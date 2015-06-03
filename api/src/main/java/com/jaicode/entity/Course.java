package com.jaicode.entity;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * Created by siheng.chap on 03/06/2015.
 */

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Course {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Integer id;

    @Persistent
    private String title;
    @Persistent
    private Date startingDate;
    @Persistent
    private Integer startingHour, endingHour;
    @Persistent
    private Float pricing;
    @Persistent
    private String pricingMethod;
    @Persistent
    private String promotion;
    @Persistent
    private String courseOverview;
    @Persistent
    private String courseOutline;
    @Persistent
    private String courseDescription;
    @Persistent
    private Integer voteCount;
    @Persistent
    private String room;
    @Persistent
    private Double latitude;
    @Persistent
    private Double logtitude;
    @Persistent
    private String timeShift;
    @Persistent
    private Integer viewCount;
    @Persistent
    private String address;
    @Persistent
    private Integer createdDate;
    @Persistent
    private Integer modifiedDate;
    @Persistent
    private Integer teacherId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCourseOverview() {
        return courseOverview;
    }

    public void setCourseOverview(String courseOverview) {
        this.courseOverview = courseOverview;
    }

    public String getCourseOutline() {
        return courseOutline;
    }

    public void setCourseOutline(String courseOutline) {
        this.courseOutline = courseOutline;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTimeShift() {
        return timeShift;
    }

    public void setTimeShift(String timeShift) {
        this.timeShift = timeShift;
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

    public Integer getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Integer createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Integer modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}
