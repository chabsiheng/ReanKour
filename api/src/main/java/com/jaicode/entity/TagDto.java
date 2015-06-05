package com.jaicode.entity;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * Created by siheng.chap on 03/06/2015.
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class TagDto {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
    @Persistent
    private String key;
    @Persistent
    private Long parentId;

    public TagDto(Long id, String key, Long parentId) {
        this.id = id;
        this.key = key;
        this.parentId = parentId;
    }

    public TagDto(String key, Long parentId) {
        this.key = key;
        this.parentId = parentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
