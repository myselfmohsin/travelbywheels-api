package org.travelbywheels.rest.common.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 22/11/2015
 * Time: 00:29
 * Copyright TravelByWheels.
 */
@Entity
@Table(name = "LK_city", schema = "", catalog = "travelbywheels")
@IdClass(LkCityPK.class)
public class LkCity {
    private int cityCode;
    private int stateCode;
    private String countryCode;
    private String cityName;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private Integer businessPriority;
    private String isDefaultChoice;
    private int jpaVersionNumber;

    @Id
    @Column(name = "city_code", nullable = false, insertable = true, updatable = true)
    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    @Id
    @Column(name = "state_code", nullable = false, insertable = true, updatable = true)
    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    @Id
    @Column(name = "country_code", nullable = false, insertable = true, updatable = true, length = 3)
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "city_name", nullable = false, insertable = true, updatable = true, length = 100)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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
    @Column(name = "business_priority", nullable = true, insertable = true, updatable = true)
    public Integer getBusinessPriority() {
        return businessPriority;
    }

    public void setBusinessPriority(Integer businessPriority) {
        this.businessPriority = businessPriority;
    }

    @Basic
    @Column(name = "is_default_choice", nullable = true, insertable = true, updatable = true, length = 1)
    public String getIsDefaultChoice() {
        return isDefaultChoice;
    }

    public void setIsDefaultChoice(String isDefaultChoice) {
        this.isDefaultChoice = isDefaultChoice;
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

        LkCity lkCity = (LkCity) o;

        if (cityCode != lkCity.cityCode) return false;
        if (stateCode != lkCity.stateCode) return false;
        if (createdBy != lkCity.createdBy) return false;
        if (jpaVersionNumber != lkCity.jpaVersionNumber) return false;
        if (countryCode != null ? !countryCode.equals(lkCity.countryCode) : lkCity.countryCode != null) return false;
        if (cityName != null ? !cityName.equals(lkCity.cityName) : lkCity.cityName != null) return false;
        if (createDate != null ? !createDate.equals(lkCity.createDate) : lkCity.createDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(lkCity.lastUpdateDate) : lkCity.lastUpdateDate != null)
            return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(lkCity.lastUpdatedBy) : lkCity.lastUpdatedBy != null)
            return false;
        if (businessPriority != null ? !businessPriority.equals(lkCity.businessPriority) : lkCity.businessPriority != null)
            return false;
        if (isDefaultChoice != null ? !isDefaultChoice.equals(lkCity.isDefaultChoice) : lkCity.isDefaultChoice != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityCode;
        result = 31 * result + stateCode;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (businessPriority != null ? businessPriority.hashCode() : 0);
        result = 31 * result + (isDefaultChoice != null ? isDefaultChoice.hashCode() : 0);
        result = 31 * result + jpaVersionNumber;
        return result;
    }
}
