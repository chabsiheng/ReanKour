package com.jaicode.spi;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.CollectionResponse;
import com.jaicode.exception.ReanKourException;
import com.jaicode.dao.PMF;
import com.jaicode.dao.PersistenceDao;
import com.jaicode.entity.CourseDto;
import com.jaicode.entity.Course;
import com.jaicode.entity.Message;
import com.jaicode.entity.TeacherDto;
import com.jaicode.utils.Constant;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

/**
 * Created by siheng.chap on 03/06/2015.
 */

@Api(name = "reankourApi", version = "v1", namespace = @ApiNamespace(ownerDomain = "api.jaicode.com", ownerName = "api.jaicode.com", packagePath = ""))
public class ReanKourApi {

    @ApiMethod(name = "new.teacher", httpMethod = "POST")
    public Message newTeacher(TeacherDto teacherDto){
        try{
            PersistenceDao.saveTeacher(teacherDto);
            return new Message("200","New Teacher Added Successfully!!!");
        }
        catch (ReanKourException e) {
            return new Message("500",e.getMessage());
        }catch (Exception e){
            return new Message("500","Teacher cannot be saved !!!");
        }
    }
    @ApiMethod(name = "new.course", httpMethod = "POST")
    public Message newCourse(CourseDto courseDto, @Nullable @Named("lstTime") List<String> lstTime){
        try{
            PersistenceDao.saveCourse(courseDto, lstTime);
            return new Message("200","New Course Added Successfully!!!");
        }
        catch (ReanKourException e) {
            return new Message("500",e.getMessage());
        }catch (Exception e){
            return new Message("500","Course can't be saved !!!");
        }
    }
    @ApiMethod(name = "detail.teacher")
    public TeacherDto getDetailTeacher(@Named("teacherId") Long teacherId){
        try{
            return PersistenceDao.getTeacherDetailById(teacherId);
        }
        catch (Exception e){

        } catch (ReanKourException e) {
            e.printStackTrace();
        }
        return null;
    }

    @ApiMethod(name = "detail.course", httpMethod = "GET")
    public CourseDto detailCourse(@Named("courseId") Long courseId){
        try{
            return PersistenceDao.getCourseDetailById(courseId);
        }
        catch (Exception e){
            e.printStackTrace();
        } catch (ReanKourException e) {
            e.printStackTrace();
        }
        return null;
    }

    @ApiMethod(name = "search.course", httpMethod = "GET")
    public List<Course> searchCourse(@Named("keyword") String keyword,@Named("cat") @Nullable String cat, @Named("subcat") @Nullable String subcat,
            @Named("lat") @Nullable Double lat, @Named("lng") @Nullable Double lng, @Named("distance") @Nullable Double distance, @Named("shift") @Nullable String shift, @Named("studyDay") @Nullable String studyDay, @Named("price") @Nullable Double price,@Named("pagging") Integer pagging){
        try{
            String criteria = "";
            String locationCriteria = "";
            if (!validateData(keyword))
                keyword = "";
            if (validateData(cat))
                keyword += " "+cat;
            if (validateData(subcat))
                keyword += " "+subcat;
            if (validateData(shift))
                criteria = "shift=="+shift;
            if (validateData(studyDay)){
                if (!criteria.isEmpty())
                    criteria += " && ";
                criteria += "studyDay=="+studyDay;
            }
            if (price == null || price <= 0){
                if (!criteria.isEmpty())
                    criteria += " && ";
                criteria += "price > "+price;
            }
            if (distance != null || distance >0){

            }
            return PersistenceDao.getFilterCourse(keyword, criteria, pagging);
        }
        catch (Exception e){

        } catch (ReanKourException e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean validateData(String key){
        if (key == null){
            return false;
        }
        if (key.isEmpty()){
            return false;
        }
        return true;
    }
    private Double getDistanceTwoPoint(double lat1, double lng1, double lat2, double lng2){
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lng2 - lng1);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.sin(dLon / 2) * Math.sin(dLon / 2) * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return Constant.R * c;
    }
}
