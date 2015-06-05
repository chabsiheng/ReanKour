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

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

/**
 * Created by siheng.chap on 03/06/2015.
 */

@Api(name = "reankourApi", version = "v1", namespace = @ApiNamespace(ownerDomain = "api.jaicode.com", ownerName = "api.jaicode.com", packagePath = ""))
public class ReanKourApi {

    @ApiMethod(name = "new.teacher")
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
    public CollectionResponse<Course> searchCourse(@Named("keyword") String keyword,@Named("cat") @Nullable String cat, @Named("subcat") @Nullable String subcat,
            @Named("lat") @Nullable Double lat, @Named("lng") @Nullable Double lng, @Named("shift") @Nullable String shift, @Named("studyDay") @Nullable String studyDay, @Named("price") @Nullable Double price,@Named("pagging") Integer pagging){
        try{
            String criteria = "";
            if (!validateData(keyword))
                keyword = "";
            if (validateData(cat))
                keyword += " "+cat;
            if (validateData(subcat))
                keyword += " "+subcat;
            return null;
        }
        catch (Exception e){

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
}
