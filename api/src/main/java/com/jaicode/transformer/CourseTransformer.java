package com.jaicode.transformer;

import com.google.api.server.spi.config.Transformer;
import com.jaicode.entity.Course;
import com.jaicode.entity.CourseList;

/**
 * Created by siheng.chap on 03/06/2015.
 */
public class CourseTransformer implements Transformer<Course, CourseList> {

    @Override
    public Course transformFrom(CourseList courseList) {
        Course course = new Course();
        course.setId(courseList.getId());
        course.setAddress(courseList.getAddress());
        return course;
    }

    @Override
    public CourseList transformTo(Course course) {
        CourseList lst = new CourseList();
        lst.setId(course.getId());
        lst.setAddress(course.getAddress());
        return lst;
    }
}
