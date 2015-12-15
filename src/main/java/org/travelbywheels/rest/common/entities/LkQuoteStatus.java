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
@Table(name = "LK_quote_status", schema = "", catalog = "travelbywheels")
public class LkQuoteStatus {
    private int quoteStatusCode;
    private String quoteStatusName;
    private String quoteStatusDescription;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private Integer businessPriority;
    private String isDefaultChoice;
    private int jpaVersionNumber;

    @Id
    @Column(name = "quote_status_code", nullable = false, insertable = true, updatable = true)
    public int getQuoteStatusCode() {
        return quoteStatusCode;
    }

    public void setQuoteStatusCode(int quoteStatusCode) {
        this.quoteStatusCode = quoteStatusCode;
    }

    @Basic
    @Column(name = "quote_status_name", nullable = false, insertable = true, updatable = true, length = 45)
    public String getQuoteStatusName() {
        return quoteStatusName;
    }

    public void setQuoteStatusName(String quoteStatusName) {
        this.quoteStatusName = quoteStatusName;
    }

    @Basic
    @Column(name = "quote_status_description", nullable = true, insertable = true, updatable = true, length = 45)
    public String getQuoteStatusDescription() {
        return quoteStatusDescription;
    }

    public void setQuoteStatusDescription(String quoteStatusDescription) {
        this.quoteStatusDescription = quoteStatusDescription;
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

        LkQuoteStatus that = (LkQuoteStatus) o;

        if (quoteStatusCode != that.quoteStatusCode) return false;
        if (createdBy != that.createdBy) return false;
        if (jpaVersionNumber != that.jpaVersionNumber) return false;
        if (quoteStatusName != null ? !quoteStatusName.equals(that.quoteStatusName) : that.quoteStatusName != null)
            return false;
        if (quoteStatusDescription != null ? !quoteStatusDescription.equals(that.quoteStatusDescription) : that.quoteStatusDescription != null)
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
        int result = quoteStatusCode;
        result = 31 * result + (quoteStatusName != null ? quoteStatusName.hashCode() : 0);
        result = 31 * result + (quoteStatusDescription != null ? quoteStatusDescription.hashCode() : 0);
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
