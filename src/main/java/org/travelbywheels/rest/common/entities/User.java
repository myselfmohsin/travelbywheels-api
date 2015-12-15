package org.travelbywheels.rest.common.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 14/11/2015
 * Time: 00:49
 * Copyright TravelByWheels.
 */
@Entity
public class User {
    private Long userId;
    private String userEmail;
    private String userPassword;
    private String isActiveFlag;
    private Timestamp createDate;
    private Long createdBy;
    private Timestamp lastUpdateDate;
    private Long lastUpdatedBy;
    private Long jpaVersionNumber;
    private Person personByUserId;

    @Id
    @Column(name = "user_id", nullable = false, insertable = true, updatable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_email", nullable = false, insertable = true, updatable = true, length = 100)
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_password", nullable = false, insertable = true, updatable = true, length = 45)
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "is_active_flag", nullable = false, insertable = true, updatable = true, length = 1)
    public String getIsActiveFlag() {
        return isActiveFlag;
    }

    public void setIsActiveFlag(String isActiveFlag) {
        this.isActiveFlag = isActiveFlag;
    }

    @Basic
    @Column(name = "create_date", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "created_by", nullable = false, insertable = true, updatable = true)
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "last_update_date", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Basic
    @Column(name = "last_updated_by", nullable = true, insertable = true, updatable = true)
    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Basic
    @Column(name = "jpa_version_number", nullable = false, insertable = true, updatable = true)
    public Long getJpaVersionNumber() {
        return jpaVersionNumber;
    }

    public void setJpaVersionNumber(Long jpaVersionNumber) {
        this.jpaVersionNumber = jpaVersionNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (createdBy != user.createdBy) return false;
        if (jpaVersionNumber != user.jpaVersionNumber) return false;
        if (userEmail != null ? !userEmail.equals(user.userEmail) : user.userEmail != null) return false;
        if (userPassword != null ? !userPassword.equals(user.userPassword) : user.userPassword != null) return false;
        if (isActiveFlag != null ? !isActiveFlag.equals(user.isActiveFlag) : user.isActiveFlag != null) return false;
        if (createDate != null ? !createDate.equals(user.createDate) : user.createDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(user.lastUpdateDate) : user.lastUpdateDate != null)
            return false;
        return !(lastUpdatedBy != null ? !lastUpdatedBy.equals(user.lastUpdatedBy) : user.lastUpdatedBy != null);

    }

    @Override
    public int hashCode() {
        int result = userId.intValue();
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (isActiveFlag != null ? isActiveFlag.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + createdBy.intValue();
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + jpaVersionNumber.intValue();
        return result;
    }

    @OneToOne(cascade = {CascadeType.DETACH}, fetch = FetchType.EAGER, targetEntity = Person.class)
    @JoinColumn(name = "user_id", referencedColumnName = "person_id", nullable = false)
    public Person getPersonByUserId() {
        return personByUserId;
    }

    public void setPersonByUserId(Person personByUserId) {
        this.setUserId(personByUserId.getPersonId());
        this.personByUserId = personByUserId;
    }

}
