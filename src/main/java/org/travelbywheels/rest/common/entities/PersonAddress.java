package org.travelbywheels.rest.common.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 22/11/2015
 * Time: 00:30
 * Copyright TravelByWheels.
 */
@Entity
@Table(name = "person_address", schema = "", catalog = "travelbywheels")
@IdClass(PersonAddressPK.class)
public class PersonAddress {
    private int addressId;
    private int personId;
    private String isPrimaryAddressFlag;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private int jpaVersionNumber;

    @Id
    @Column(name = "address_id", nullable = false, insertable = true, updatable = true)
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Id
    @Column(name = "person_id", nullable = false, insertable = true, updatable = true)
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "is_primary_address_flag", nullable = false, insertable = true, updatable = true, length = 1)
    public String getIsPrimaryAddressFlag() {
        return isPrimaryAddressFlag;
    }

    public void setIsPrimaryAddressFlag(String isPrimaryAddressFlag) {
        this.isPrimaryAddressFlag = isPrimaryAddressFlag;
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
    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
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
    public Integer getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Integer lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Basic
    @Column(name = "jpa_version_number", nullable = false, insertable = true, updatable = true)
    public int getJpaVersionNumber() {
        return jpaVersionNumber;
    }

    public void setJpaVersionNumber(int jpaVersionNumber) {
        this.jpaVersionNumber = jpaVersionNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonAddress that = (PersonAddress) o;

        if (addressId != that.addressId) return false;
        if (personId != that.personId) return false;
        if (createdBy != that.createdBy) return false;
        if (jpaVersionNumber != that.jpaVersionNumber) return false;
        if (isPrimaryAddressFlag != null ? !isPrimaryAddressFlag.equals(that.isPrimaryAddressFlag) : that.isPrimaryAddressFlag != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(that.lastUpdatedBy) : that.lastUpdatedBy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = addressId;
        result = 31 * result + personId;
        result = 31 * result + (isPrimaryAddressFlag != null ? isPrimaryAddressFlag.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + jpaVersionNumber;
        return result;
    }
}
