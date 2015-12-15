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
@Table(name = "review_about_travel_agency", schema = "", catalog = "travelbywheels")
public class ReviewAboutTravelAgency {
    private int reviewAboutTravelAgencyId;
    private String travelAgencyReviewText;
    private int byUserId;
    private int forTravelAgencyId;
    private int journeyId;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private int jpaVersionNumber;

    @Id
    @Column(name = "review_about_travel_agency_id", nullable = false, insertable = true, updatable = true)
    public int getReviewAboutTravelAgencyId() {
        return reviewAboutTravelAgencyId;
    }

    public void setReviewAboutTravelAgencyId(int reviewAboutTravelAgencyId) {
        this.reviewAboutTravelAgencyId = reviewAboutTravelAgencyId;
    }

    @Basic
    @Column(name = "travel_agency_review_text", nullable = true, insertable = true, updatable = true, length = 45)
    public String getTravelAgencyReviewText() {
        return travelAgencyReviewText;
    }

    public void setTravelAgencyReviewText(String travelAgencyReviewText) {
        this.travelAgencyReviewText = travelAgencyReviewText;
    }

    @Basic
    @Column(name = "by_user_id", nullable = false, insertable = true, updatable = true)
    public int getByUserId() {
        return byUserId;
    }

    public void setByUserId(int byUserId) {
        this.byUserId = byUserId;
    }

    @Basic
    @Column(name = "for_travel_agency_id", nullable = false, insertable = true, updatable = true)
    public int getForTravelAgencyId() {
        return forTravelAgencyId;
    }

    public void setForTravelAgencyId(int forTravelAgencyId) {
        this.forTravelAgencyId = forTravelAgencyId;
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

        ReviewAboutTravelAgency that = (ReviewAboutTravelAgency) o;

        if (reviewAboutTravelAgencyId != that.reviewAboutTravelAgencyId) return false;
        if (byUserId != that.byUserId) return false;
        if (forTravelAgencyId != that.forTravelAgencyId) return false;
        if (journeyId != that.journeyId) return false;
        if (createdBy != that.createdBy) return false;
        if (jpaVersionNumber != that.jpaVersionNumber) return false;
        if (travelAgencyReviewText != null ? !travelAgencyReviewText.equals(that.travelAgencyReviewText) : that.travelAgencyReviewText != null)
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
        int result = reviewAboutTravelAgencyId;
        result = 31 * result + (travelAgencyReviewText != null ? travelAgencyReviewText.hashCode() : 0);
        result = 31 * result + byUserId;
        result = 31 * result + forTravelAgencyId;
        result = 31 * result + journeyId;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + jpaVersionNumber;
        return result;
    }
}
