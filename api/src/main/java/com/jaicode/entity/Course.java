package com.jaicode.entity;

import java.util.Date;

import javax.jdo.annotations.Persistent;

/**
 * Created by siheng.chap on 03/06/2015.
 */
public class Course {
    private Integer id;
    private String title;
    private Date startingDate;
    private String studyHour;
    private String chargeFee;
    private String studyDay;
    private boolean promotion;
    private String teacherName;
    private String teacherId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public String getChargeFee() {
        return chargeFee;
    }

    public void setChargeFee(String chargeFee) {
        this.chargeFee = chargeFee;
    }

    public String getStudyDay() {
        return studyDay;
    }

    public void setStudyDay(String studyDay) {
        this.studyDay = studyDay;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public String getStudyHour() {
        return studyHour;
    }

    public void setStudyHour(String studyHour) {
        this.studyHour = studyHour;
    }
}
