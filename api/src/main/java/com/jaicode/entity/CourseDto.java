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
public class CourseDto {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;

    @Persistent
    private String title;
    @Persistent
    private Date startingDate;
    @Persistent
    private Integer startingHour, endingHour;
    @Persistent
    private String studyDay;
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
    private Double longitude;
    @Persistent
    private String timeShift;
    @Persistent
    private Integer viewCount;
    @Persistent
    private String address;
    @Persistent
    private Long createdDate;
    @Persistent
    private Long modifiedDate;
    @Persistent
    private Long teacherId;
    @Persistent
    private String isUnicode;
    @Persistent
    private String status;

    private String tag;
    private String teacherName;

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

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public Long getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Long modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getStudyDay() {
        return studyDay;
    }

    public void setStudyDay(String studyDay) {
        this.studyDay = studyDay;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getIsUnicode() {
        return isUnicode;
    }

    public void setIsUnicode(String isUnicode) {
        this.isUnicode = isUnicode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
