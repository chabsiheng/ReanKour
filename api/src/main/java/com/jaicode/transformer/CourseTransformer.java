package com.jaicode.transformer;

import com.google.api.server.spi.config.Transformer;
import com.jaicode.entity.CourseDto;
import com.jaicode.entity.Course;

/**
 * Created by siheng.chap on 03/06/2015.
 */
public class CourseTransformer implements Transformer<CourseDto, Course> {

    @Override
    public CourseDto transformFrom(Course courseList) {
        CourseDto courseDto = new CourseDto();
        courseDto.setId(courseList.getId());
        courseDto.setAddress(courseList.getAddress());
        return courseDto;
    }

    @Override
    public Course transformTo(CourseDto courseDto) {
        Course lst = new Course();
        lst.setId(courseDto.getId());
        lst.setAddress(courseDto.getAddress());
        return lst;
    }
}
