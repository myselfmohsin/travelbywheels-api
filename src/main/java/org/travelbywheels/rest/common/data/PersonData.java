package org.travelbywheels.rest.common.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.travelbywheels.rest.common.entities.Person;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 25/11/2015
 * Time: 15:25
 * Copyright TravelByWheels.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonData {
    private Long personId;
    private String firstName;
    private String lastName;
    private Timestamp dateOfBirth;
    private String phoneNumber;
    private String mobileNumber;
    private Timestamp createDate;
    private Long createdBy;
    private Timestamp lastUpdateDate;
    private Long lastUpdatedBy;

    private UserData userDataByPersonId;

    public PersonData() {
    }

    public PersonData(Person person) {
        this.personId = person.getPersonId();
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.dateOfBirth = person.getDateOfBirth();
        this.phoneNumber = person.getPhoneNumber();
        this.mobileNumber = person.getMobileNumber();
        this.createDate = person.getCreateDate();
        this.createdBy = person.getCreatedBy();
        this.lastUpdateDate = person.getLastUpdateDate();
        this.lastUpdatedBy = person.getLastUpdatedBy();
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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

    public UserData getUserDataByPersonId() {
        return userDataByPersonId;
    }

    public void setUserDataByPersonId(UserData userDataByPersonId) {
        this.userDataByPersonId = userDataByPersonId;
    }

    public Person toPerson(){

        Person person = new Person();

         person.setPersonId(this.personId);
         person.setFirstName(this.firstName);
         person.setLastName(this.lastName);
         person.setDateOfBirth(this.dateOfBirth);
         person.setPhoneNumber(this.phoneNumber);
         person.setMobileNumber(this.mobileNumber);
         person.setCreateDate(this.createDate);
         person.setCreatedBy(this.createdBy);
         person.setLastUpdateDate(this.lastUpdateDate);
         person.setLastUpdatedBy(this.lastUpdatedBy);

        return person;
    }
}

