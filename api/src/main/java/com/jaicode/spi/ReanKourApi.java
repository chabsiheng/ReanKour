package com.jaicode.spi;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.CollectionResponse;
import com.jaicode.ReanKourException;
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
            return new Message("500","Teacher can't be saved !!!");
        }catch (Exception e){
            return new Message("500","Teacher can't be saved !!!");
        }
    }

    @ApiMethod(name = "get.teacher")
    public TeacherDto getAllTeacher(@Named("teacherId") Integer teacherId){
        try{
            return null;
        }
        catch (Exception e){

        }
        return null;
    }

    @ApiMethod(name = "new.course", httpMethod = "POST")
    public Message newCourse(CourseDto courseDto, @Nullable @Named("teacherId") Integer teacherId, @Nullable @Named("lstTime") List<String> lstTime){
        try{
            courseDto.setTeacherId(Long.valueOf(teacherId));
            PersistenceDao.saveCourse(courseDto, lstTime);
            return new Message("200","New Course Added Successfully!!!");
        }
        catch (ReanKourException e) {
            return new Message("500","Course can't be saved !!!");
        }catch (Exception e){
            return new Message("500","Course can't be saved !!!");
        }
    }

    @ApiMethod(name = "detail.course", httpMethod = "GET")
    public CourseDto detailCourse(@Named("courseId") Integer courseId){
        try{
            PersistenceManager pm = getPersistenceManager();
            Query query = pm.newQuery(CourseDto.class);
            query.setFilter("id == courseId");
            query.declareParameters("Integer courseId");
            CourseDto courseDto = (CourseDto) query.execute(courseId);
            return courseDto;
        }
        catch (Exception e){
            return null;
        }
    }

    @ApiMethod(name = "search.course", httpMethod = "GET")
    public CollectionResponse<Course> searchCourse(@Named("query") String query){
        try{
            return null;
        }
        catch (Exception e){

        }
        return null;
    }

    @ApiMethod (name = "filter.course", httpMethod = "GET")
    public CollectionResponse<Course> filterCourse(@Named("query") String query){
        try{
            return null;
        }
        catch (Exception e){

        }
        return null;
    }

    @ApiMethod(name = "update.couseview", httpMethod = "GET")
    public void incrementCourseView(){
        try{

        }
        catch (Exception e){

        }
    }

    private static PersistenceManager getPersistenceManager() {
        return PMF.get().getPersistenceManager();
    }

}
