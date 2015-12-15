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
@Table(name = "travel_agency_rating", schema = "", catalog = "travelbywheels")
public class TravelAgencyRating {
    private int travelAgencyRatingId;
    private Integer travelAgencyRating;
    private int reviewCategoryCode;
    private int reviewAboutTravelAgencyId;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private int jpaVersionNumber;

    @Id
    @Column(name = "travel_agency_rating_id", nullable = false, insertable = true, updatable = true)
    public int getTravelAgencyRatingId() {
        return travelAgencyRatingId;
    }

    public void setTravelAgencyRatingId(int travelAgencyRatingId) {
        this.travelAgencyRatingId = travelAgencyRatingId;
    }

    @Basic
    @Column(name = "travel_agency_rating", nullable = true, insertable = true, updatable = true)
    public Integer getTravelAgencyRating() {
        return travelAgencyRating;
    }

    public void setTravelAgencyRating(Integer travelAgencyRating) {
        this.travelAgencyRating = travelAgencyRating;
    }

    @Basic
    @Column(name = "review_category_code", nullable = false, insertable = true, updatable = true)
    public int getReviewCategoryCode() {
        return reviewCategoryCode;
    }

    public void setReviewCategoryCode(int reviewCategoryCode) {
        this.reviewCategoryCode = reviewCategoryCode;
    }

    @Basic
    @Column(name = "review_about_travel_agency_id", nullable = false, insertable = true, updatable = true)
    public int getReviewAboutTravelAgencyId() {
        return reviewAboutTravelAgencyId;
    }

    public void setReviewAboutTravelAgencyId(int reviewAboutTravelAgencyId) {
        this.reviewAboutTravelAgencyId = reviewAboutTravelAgencyId;
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

        TravelAgencyRating that = (TravelAgencyRating) o;

        if (travelAgencyRatingId != that.travelAgencyRatingId) return false;
        if (reviewCategoryCode != that.reviewCategoryCode) return false;
        if (reviewAboutTravelAgencyId != that.reviewAboutTravelAgencyId) return false;
        if (createdBy != that.createdBy) return false;
        if (jpaVersionNumber != that.jpaVersionNumber) return false;
        if (travelAgencyRating != null ? !travelAgencyRating.equals(that.travelAgencyRating) : that.travelAgencyRating != null)
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
        int result = travelAgencyRatingId;
        result = 31 * result + (travelAgencyRating != null ? travelAgencyRating.hashCode() : 0);
        result = 31 * result + reviewCategoryCode;
        result = 31 * result + reviewAboutTravelAgencyId;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + jpaVersionNumber;
        return result;
    }
}
