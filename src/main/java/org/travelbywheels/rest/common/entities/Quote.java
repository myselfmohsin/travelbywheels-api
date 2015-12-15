package org.travelbywheels.rest.common.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 22/11/2015
 * Time: 00:30
 * Copyright TravelByWheels.
 */
@Entity
public class Quote {
    private int quoteId;
    private int journeyId;
    private BigDecimal quotePrice;
    private String quoteDescription;
    private int quoteStatusCode;
    private int userId;
    private int travelAgencyId;
    private int driverDriverId;
    private int vehicleId;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private int jpaVersionNumber;

    @Id
    @Column(name = "quote_id", nullable = false, insertable = true, updatable = true)
    public int getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(int quoteId) {
        this.quoteId = quoteId;
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
    @Column(name = "quote_price", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getQuotePrice() {
        return quotePrice;
    }

    public void setQuotePrice(BigDecimal quotePrice) {
        this.quotePrice = quotePrice;
    }

    @Basic
    @Column(name = "quote_description", nullable = true, insertable = true, updatable = true, length = 500)
    public String getQuoteDescription() {
        return quoteDescription;
    }

    public void setQuoteDescription(String quoteDescription) {
        this.quoteDescription = quoteDescription;
    }

    @Basic
    @Column(name = "quote_status_code", nullable = false, insertable = true, updatable = true)
    public int getQuoteStatusCode() {
        return quoteStatusCode;
    }

    public void setQuoteStatusCode(int quoteStatusCode) {
        this.quoteStatusCode = quoteStatusCode;
    }

    @Basic
    @Column(name = "user_id", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "travel_agency_id", nullable = false, insertable = true, updatable = true)
    public int getTravelAgencyId() {
        return travelAgencyId;
    }

    public void setTravelAgencyId(int travelAgencyId) {
        this.travelAgencyId = travelAgencyId;
    }

    @Basic
    @Column(name = "driver_driver_id", nullable = false, insertable = true, updatable = true)
    public int getDriverDriverId() {
        return driverDriverId;
    }

    public void setDriverDriverId(int driverDriverId) {
        this.driverDriverId = driverDriverId;
    }

    @Basic
    @Column(name = "vehicle_id", nullable = false, insertable = true, updatable = true)
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
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

        Quote quote = (Quote) o;

        if (quoteId != quote.quoteId) return false;
        if (journeyId != quote.journeyId) return false;
        if (quoteStatusCode != quote.quoteStatusCode) return false;
        if (userId != quote.userId) return false;
        if (travelAgencyId != quote.travelAgencyId) return false;
        if (driverDriverId != quote.driverDriverId) return false;
        if (vehicleId != quote.vehicleId) return false;
        if (createdBy != quote.createdBy) return false;
        if (jpaVersionNumber != quote.jpaVersionNumber) return false;
        if (quotePrice != null ? !quotePrice.equals(quote.quotePrice) : quote.quotePrice != null) return false;
        if (quoteDescription != null ? !quoteDescription.equals(quote.quoteDescription) : quote.quoteDescription != null)
            return false;
        if (createDate != null ? !createDate.equals(quote.createDate) : quote.createDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(quote.lastUpdateDate) : quote.lastUpdateDate != null)
            return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(quote.lastUpdatedBy) : quote.lastUpdatedBy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = quoteId;
        result = 31 * result + journeyId;
        result = 31 * result + (quotePrice != null ? quotePrice.hashCode() : 0);
        result = 31 * result + (quoteDescription != null ? quoteDescription.hashCode() : 0);
        result = 31 * result + quoteStatusCode;
        result = 31 * result + userId;
        result = 31 * result + travelAgencyId;
        result = 31 * result + driverDriverId;
        result = 31 * result + vehicleId;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + jpaVersionNumber;
        return result;
    }
}
