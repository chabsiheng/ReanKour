package com.jaicode.spi;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.CollectionResponse;
import com.jaicode.PMF.PMF;
import com.jaicode.entity.Course;
import com.jaicode.entity.CourseList;
import com.jaicode.entity.Message;
import com.jaicode.entity.Teacher;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.lang.model.element.Name;

/**
 * Created by siheng.chap on 03/06/2015.
 */

@Api(name = "reankourApi", version = "v1", namespace = @ApiNamespace(ownerDomain = "api.jaicode.com", ownerName = "api.jaicode.com", packagePath = ""))
public class ReanKourApi {

    @ApiMethod(name = "new.teacher")
    public Message newTeacher(Teacher teacher){
        try{
            return null;
        }
        catch (Exception e){

        }
        return null;
    }

    @ApiMethod(name = "get.teacher")
    public Teacher getAllTeacher(@Named("teacherId") Integer teacherId){
        try{
            return null;
        }
        catch (Exception e){

        }
        return null;
    }

    @ApiMethod(name = "new.course", httpMethod = "POST")
    public Message newCourse(Course course, @Nullable @Named("teacherId") Integer teacherId, @Nullable @Named("lstTime") List<String> lstTime){
        try{
            List<Course> lstCourse = new ArrayList<>();
            for (String time : lstTime){
                String[] t = time.split(";");
                course.setStartingHour(Integer.parseInt(t[0]));
                course.setEndingHour(Integer.parseInt(t[1]));
                course.setTimeShift(t[2]);
                lstCourse.add(course);
            }
            course.setTeacherId(teacherId);
            PersistenceManager pm = getPersistenceManager();
            pm.makePersistentAll(lstCourse);
            pm.close();
            return new Message("200","New Course Added Successfully!!!");
        }
        catch (Exception e){

        }
        return null;
    }

    @ApiMethod(name = "detail.course", httpMethod = "GET")
    public Course detailCourse(@Named("courseId") Integer courseId){
        try{
            PersistenceManager pm = getPersistenceManager();
            Query query = pm.newQuery(Course.class);
            query.setFilter("id == courseId");
            query.declareParameters("Integer courseId");
            Course course = (Course) query.execute(courseId);
            return course;
        }
        catch (Exception e){
            return null;
        }
    }

    @ApiMethod(name = "search.course", httpMethod = "GET")
    public CollectionResponse<CourseList> searchCourse(@Named("query") String query){
        try{
            return null;
        }
        catch (Exception e){

        }
        return null;
    }

    @ApiMethod (name = "filter.course", httpMethod = "GET")
    public CollectionResponse<CourseList> filterCourse(@Named("query") String query){
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
