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
@Table(name = "review_about_user", schema = "", catalog = "travelbywheels")
public class ReviewAboutUser {
    private int reviewAboutUserId;
    private int byTravelAgencyId;
    private int forUserId;
    private String userReviewText;
    private Integer userRating;
    private int journeyId;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private int jpaVersionNumber;

    @Id
    @Column(name = "review_about_user_id", nullable = false, insertable = true, updatable = true)
    public int getReviewAboutUserId() {
        return reviewAboutUserId;
    }

    public void setReviewAboutUserId(int reviewAboutUserId) {
        this.reviewAboutUserId = reviewAboutUserId;
    }

    @Basic
    @Column(name = "by_travel_agency_id", nullable = false, insertable = true, updatable = true)
    public int getByTravelAgencyId() {
        return byTravelAgencyId;
    }

    public void setByTravelAgencyId(int byTravelAgencyId) {
        this.byTravelAgencyId = byTravelAgencyId;
    }

    @Basic
    @Column(name = "for_user_id", nullable = false, insertable = true, updatable = true)
    public int getForUserId() {
        return forUserId;
    }

    public void setForUserId(int forUserId) {
        this.forUserId = forUserId;
    }

    @Basic
    @Column(name = "user_review_text", nullable = true, insertable = true, updatable = true, length = 500)
    public String getUserReviewText() {
        return userReviewText;
    }

    public void setUserReviewText(String userReviewText) {
        this.userReviewText = userReviewText;
    }

    @Basic
    @Column(name = "user_rating", nullable = true, insertable = true, updatable = true)
    public Integer getUserRating() {
        return userRating;
    }

    public void setUserRating(Integer userRating) {
        this.userRating = userRating;
    }

    @Basic
    @Column(name = "journey_id", nullable = false, insertable = true, updatable = true)
    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
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

        ReviewAboutUser that = (ReviewAboutUser) o;

        if (reviewAboutUserId != that.reviewAboutUserId) return false;
        if (byTravelAgencyId != that.byTravelAgencyId) return false;
        if (forUserId != that.forUserId) return false;
        if (journeyId != that.journeyId) return false;
        if (createdBy != that.createdBy) return false;
        if (jpaVersionNumber != that.jpaVersionNumber) return false;
        if (userReviewText != null ? !userReviewText.equals(that.userReviewText) : that.userReviewText != null)
            return false;
        if (userRating != null ? !userRating.equals(that.userRating) : that.userRating != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(that.lastUpdatedBy) : that.lastUpdatedBy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reviewAboutUserId;
        result = 31 * result + byTravelAgencyId;
        result = 31 * result + forUserId;
        result = 31 * result + (userReviewText != null ? userReviewText.hashCode() : 0);
        result = 31 * result + (userRating != null ? userRating.hashCode() : 0);
        result = 31 * result + journeyId;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + jpaVersionNumber;
        return result;
    }
}
