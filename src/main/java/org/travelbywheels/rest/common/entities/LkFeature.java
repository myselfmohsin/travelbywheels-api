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
@Table(name = "LK_feature", schema = "", catalog = "travelbywheels")
public class LkFeature {
    private int featureCode;
    private String featureName;
    private String featureDescription;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private Integer businessPriority;
    private String isDefaultChoice;
    private int jpaVersionNumber;

    @Id
    @Column(name = "feature_code", nullable = false, insertable = true, updatable = true)
    public int getFeatureCode() {
        return featureCode;
    }

    public void setFeatureCode(int featureCode) {
        this.featureCode = featureCode;
    }

    @Basic
    @Column(name = "feature_name", nullable = true, insertable = true, updatable = true, length = 45)
    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    @Basic
    @Column(name = "feature_description", nullable = true, insertable = true, updatable = true, length = 250)
    public String getFeatureDescription() {
        return featureDescription;
    }

    public void setFeatureDescription(String featureDescription) {
        this.featureDescription = featureDescription;
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

        LkFeature lkFeature = (LkFeature) o;

        if (featureCode != lkFeature.featureCode) return false;
        if (createdBy != lkFeature.createdBy) return false;
        if (jpaVersionNumber != lkFeature.jpaVersionNumber) return false;
        if (featureName != null ? !featureName.equals(lkFeature.featureName) : lkFeature.featureName != null)
            return false;
        if (featureDescription != null ? !featureDescription.equals(lkFeature.featureDescription) : lkFeature.featureDescription != null)
            return false;
        if (createDate != null ? !createDate.equals(lkFeature.createDate) : lkFeature.createDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(lkFeature.lastUpdateDate) : lkFeature.lastUpdateDate != null)
            return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(lkFeature.lastUpdatedBy) : lkFeature.lastUpdatedBy != null)
            return false;
        if (businessPriority != null ? !businessPriority.equals(lkFeature.businessPriority) : lkFeature.businessPriority != null)
            return false;
        if (isDefaultChoice != null ? !isDefaultChoice.equals(lkFeature.isDefaultChoice) : lkFeature.isDefaultChoice != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = featureCode;
        result = 31 * result + (featureName != null ? featureName.hashCode() : 0);
        result = 31 * result + (featureDescription != null ? featureDescription.hashCode() : 0);
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
