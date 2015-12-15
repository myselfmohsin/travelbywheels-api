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
@Table(name = "LK_journey_status", schema = "", catalog = "travelbywheels")
public class LkJourneyStatus {
    private int journeyStatusCode;
    private String journeyStatusName;
    private String journeyStatusDescription;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private Integer businessPriority;
    private String isDefaultChoice;
    private int jpaVersionNumber;

    @Id
    @Column(name = "journey_status_code", nullable = false, insertable = true, updatable = true)
    public int getJourneyStatusCode() {
        return journeyStatusCode;
    }

    public void setJourneyStatusCode(int journeyStatusCode) {
        this.journeyStatusCode = journeyStatusCode;
    }

    @Basic
    @Column(name = "journey_status_name", nullable = false, insertable = true, updatable = true, length = 45)
    public String getJourneyStatusName() {
        return journeyStatusName;
    }

    public void setJourneyStatusName(String journeyStatusName) {
        this.journeyStatusName = journeyStatusName;
    }

    @Basic
    @Column(name = "journey_status_description", nullable = true, insertable = true, updatable = true, length = 45)
    public String getJourneyStatusDescription() {
        return journeyStatusDescription;
    }

    public void setJourneyStatusDescription(String journeyStatusDescription) {
        this.journeyStatusDescription = journeyStatusDescription;
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

        LkJourneyStatus that = (LkJourneyStatus) o;

        if (journeyStatusCode != that.journeyStatusCode) return false;
        if (createdBy != that.createdBy) return false;
        if (jpaVersionNumber != that.jpaVersionNumber) return false;
        if (journeyStatusName != null ? !journeyStatusName.equals(that.journeyStatusName) : that.journeyStatusName != null)
            return false;
        if (journeyStatusDescription != null ? !journeyStatusDescription.equals(that.journeyStatusDescription) : that.journeyStatusDescription != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(that.lastUpdatedBy) : that.lastUpdatedBy != null)
            return false;
        if (businessPriority != null ? !businessPriority.equals(that.businessPriority) : that.businessPriority != null)
            return false;
        if (isDefaultChoice != null ? !isDefaultChoice.equals(that.isDefaultChoice) : that.isDefaultChoice != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = journeyStatusCode;
        result = 31 * result + (journeyStatusName != null ? journeyStatusName.hashCode() : 0);
        result = 31 * result + (journeyStatusDescription != null ? journeyStatusDescription.hashCode() : 0);
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
