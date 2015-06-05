package com.jaicode.entity;

import java.util.Date;

import javax.jdo.annotations.Persistent;

/**
 * Created by siheng.chap on 03/06/2015.
 */
public class Course {
    private Long id;
    private String title;
    private Date startingDate;
    private String studyHour;
    private String chargeFee;
    private String studyDay;
    private boolean promotion;
    private String teacherName;
    private String teacherId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setChargeFee(String chargeFee) {
        this.chargeFee = chargeFee;
    }
    public void setStudyDay(String studyDay) {
        this.studyDay = studyDay;
    }
    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }
    public void setStudyHour(String studyHour) {
        this.studyHour = studyHour;
    }
}
