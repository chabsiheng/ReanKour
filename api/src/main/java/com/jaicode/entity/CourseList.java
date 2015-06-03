package com.jaicode.entity;

import java.util.Date;

/**
 * Created by siheng.chap on 03/06/2015.
 */
public class CourseList {
    private Integer id;
    private String title;
    private Date startingDate;
    private Integer startingHour, endingHour;
    private Float pricing;
    private String pricingMethod;
    private String promotion;
    private String teacherName;
    private String teacherId;
    private String room;
    private Double latitude;
    private Double logtitude;
    private Integer viewCount;
    private String address;

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

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Integer getStartingHour() {
        return startingHour;
    }

    public void setStartingHour(Integer startingHour) {
        this.startingHour = startingHour;
    }

    public Integer getEndingHour() {
        return endingHour;
    }

    public void setEndingHour(Integer endingHour) {
        this.endingHour = endingHour;
    }

    public Float getPricing() {
        return pricing;
    }

    public void setPricing(Float pricing) {
        this.pricing = pricing;
    }

    public String getPricingMethod() {
        return pricingMethod;
    }

    public void setPricingMethod(String pricingMethod) {
        this.pricingMethod = pricingMethod;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
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

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLogtitude() {
        return logtitude;
    }

    public void setLogtitude(Double logtitude) {
        this.logtitude = logtitude;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
