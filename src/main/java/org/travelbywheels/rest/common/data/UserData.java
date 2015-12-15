package org.travelbywheels.rest.common.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.travelbywheels.rest.common.entities.Person;
import org.travelbywheels.rest.common.entities.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 25/11/2015
 * Time: 15:20
 * Copyright TravelByWheels.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserData {
    private Long userId;
    private String userEmail;
    private String userPassword;
    private String isActiveFlag;
    private Timestamp createDate;
    private Long createdBy;
    private Timestamp lastUpdateDate;
    private Long lastUpdatedBy;

    private PersonData personDataByUserId;

    public UserData() {
    }

    public UserData(User user) {
        this.userId = user.getUserId();
        this.userEmail = user.getUserEmail();
        this.userPassword = user.getUserPassword();
        this.isActiveFlag = user.getIsActiveFlag();
        this.createDate = user.getCreateDate();
        this.createdBy = user.getCreatedBy();
        this.lastUpdateDate = user.getLastUpdateDate();
        this.lastUpdatedBy = user.getLastUpdatedBy();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

//    @JsonIgnore
    public String getUserPassword() {
        return userPassword;
    }

//    @JsonProperty
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getIsActiveFlag() {
        return isActiveFlag;
    }

    public void setIsActiveFlag(String isActiveFlag) {
        this.isActiveFlag = isActiveFlag;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public PersonData getPersonDataByUserId() {
        return personDataByUserId;
    }

    public void setPersonDataByUserId(PersonData personDataByUserId) {
        this.setUserId(personDataByUserId.getPersonId());
        this.personDataByUserId = personDataByUserId;
    }

    public User toUser(){
        User user = new User();
         user.setUserId(this.userId);
         user.setUserEmail(this.userEmail);
         user.setUserPassword(this.userPassword);
         user.setIsActiveFlag(this.isActiveFlag);
         user.setCreateDate(this.createDate);
         user.setCreatedBy(this.createdBy);
         user.setLastUpdateDate(this.lastUpdateDate);
         user.setLastUpdatedBy(this.lastUpdatedBy);

        return user;
    }

}
