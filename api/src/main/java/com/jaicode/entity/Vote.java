package com.jaicode.entity;

/**
 * Created by siheng.chap on 03/06/2015.
 */
public class Vote {
    private Integer id;
    private Integer userId;
    private Integer voteId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }
}
