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
@Table(name = "LK_review_category", schema = "", catalog = "travelbywheels")
public class LkReviewCategory {
    private int reviewCategoryCode;
    private String reviewCategoryName;
    private String reviewCategoryDescription;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private Integer businessPriority;
    private String isDefaultChoice;
    private int jpaVersionNumber;

    @Id
    @Column(name = "review_category_code", nullable = false, insertable = true, updatable = true)
    public int getReviewCategoryCode() {
        return reviewCategoryCode;
    }

    public void setReviewCategoryCode(int reviewCategoryCode) {
        this.reviewCategoryCode = reviewCategoryCode;
    }

    @Basic
    @Column(name = "review_category_name", nullable = false, insertable = true, updatable = true, length = 45)
    public String getReviewCategoryName() {
        return reviewCategoryName;
    }

    public void setReviewCategoryName(String reviewCategoryName) {
        this.reviewCategoryName = reviewCategoryName;
    }

    @Basic
    @Column(name = "review_category_description", nullable = true, insertable = true, updatable = true, length = 250)
    public String getReviewCategoryDescription() {
        return reviewCategoryDescription;
    }

    public void setReviewCategoryDescription(String reviewCategoryDescription) {
        this.reviewCategoryDescription = reviewCategoryDescription;
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

        LkReviewCategory that = (LkReviewCategory) o;

        if (reviewCategoryCode != that.reviewCategoryCode) return false;
        if (createdBy != that.createdBy) return false;
        if (jpaVersionNumber != that.jpaVersionNumber) return false;
        if (reviewCategoryName != null ? !reviewCategoryName.equals(that.reviewCategoryName) : that.reviewCategoryName != null)
            return false;
        if (reviewCategoryDescription != null ? !reviewCategoryDescription.equals(that.reviewCategoryDescription) : that.reviewCategoryDescription != null)
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
        int result = reviewCategoryCode;
        result = 31 * result + (reviewCategoryName != null ? reviewCategoryName.hashCode() : 0);
        result = 31 * result + (reviewCategoryDescription != null ? reviewCategoryDescription.hashCode() : 0);
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
