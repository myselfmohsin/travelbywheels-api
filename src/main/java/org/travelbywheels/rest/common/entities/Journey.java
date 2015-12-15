package org.travelbywheels.rest.common.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 22/11/2015
 * Time: 00:30
 * Copyright TravelByWheels.
 */
@Entity
public class Journey {
    private Long journeyId;

    @Id
    @javax.persistence.Column(name = "journey_id", nullable = false, insertable = true, updatable = true)
    public Long getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(Long journeyId) {
        this.journeyId = journeyId;
    }

    private Long userId;

    @Basic
    @javax.persistence.Column(name = "user_id", nullable = false, insertable = true, updatable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    private Long fromCityCode;

    @Basic
    @javax.persistence.Column(name = "from_city_code", nullable = false, insertable = true, updatable = true)
    public Long getFromCityCode() {
        return fromCityCode;
    }

    public void setFromCityCode(Long fromCityCode) {
        this.fromCityCode = fromCityCode;
    }

    private Long fromStateCode;

    @Basic
    @javax.persistence.Column(name = "from_state_code", nullable = false, insertable = true, updatable = true)
    public Long getFromStateCode() {
        return fromStateCode;
    }

    public void setFromStateCode(Long fromStateCode) {
        this.fromStateCode = fromStateCode;
    }

    private String fromCountryCode;

    @Basic
    @javax.persistence.Column(name = "from_country_code", nullable = false, insertable = true, updatable = true, length = 3)
    public String getFromCountryCode() {
        return fromCountryCode;
    }

    public void setFromCountryCode(String fromCountryCode) {
        this.fromCountryCode = fromCountryCode;
    }

    private Long toCityCode;

    @Basic
    @javax.persistence.Column(name = "to_city_code", nullable = false, insertable = true, updatable = true)
    public Long getToCityCode() {
        return toCityCode;
    }

    public void setToCityCode(Long toCityCode) {
        this.toCityCode = toCityCode;
    }

    private Long toStateCode;

    @Basic
    @javax.persistence.Column(name = "to_state_code", nullable = false, insertable = true, updatable = true)
    public Long getToStateCode() {
        return toStateCode;
    }

    public void setToStateCode(Long toStateCode) {
        this.toStateCode = toStateCode;
    }

    private String toCountryCode;

    @Basic
    @javax.persistence.Column(name = "to_country_code", nullable = false, insertable = true, updatable = true, length = 3)
    public String getToCountryCode() {
        return toCountryCode;
    }

    public void setToCountryCode(String toCountryCode) {
        this.toCountryCode = toCountryCode;
    }

    private String departureDateTime;

    @Basic
    @javax.persistence.Column(name = "departure_date_time", nullable = false, insertable = true, updatable = true, length = 45)
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    private String returnDateTime;

    @Basic
    @javax.persistence.Column(name = "return_date_time", nullable = true, insertable = true, updatable = true, length = 45)
    public String getReturnDateTime() {
        return returnDateTime;
    }

    public void setReturnDateTime(String returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    private String specialRequest;

    @Basic
    @javax.persistence.Column(name = "special_request", nullable = true, insertable = true, updatable = true, length = 250)
    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    private Long noOfPassengers;

    @Basic
    @javax.persistence.Column(name = "no_of_passengers", nullable = true, insertable = true, updatable = true)
    public Long getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(Long noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    private Long noOfExtraLargeLuggage;

    @Basic
    @javax.persistence.Column(name = "no_of_extra_large_luggage", nullable = true, insertable = true, updatable = true)
    public Long getNoOfExtraLargeLuggage() {
        return noOfExtraLargeLuggage;
    }

    public void setNoOfExtraLargeLuggage(Long noOfExtraLargeLuggage) {
        this.noOfExtraLargeLuggage = noOfExtraLargeLuggage;
    }

    private Long noOfLargeLuggage;

    @Basic
    @javax.persistence.Column(name = "no_of_large_luggage", nullable = true, insertable = true, updatable = true)
    public Long getNoOfLargeLuggage() {
        return noOfLargeLuggage;
    }

    public void setNoOfLargeLuggage(Long noOfLargeLuggage) {
        this.noOfLargeLuggage = noOfLargeLuggage;
    }

    private Long noOfMediumLuggage;

    @Basic
    @javax.persistence.Column(name = "no_of_medium_luggage", nullable = true, insertable = true, updatable = true)
    public Long getNoOfMediumLuggage() {
        return noOfMediumLuggage;
    }

    public void setNoOfMediumLuggage(Long noOfMediumLuggage) {
        this.noOfMediumLuggage = noOfMediumLuggage;
    }

    private Long noOfSmallLuggage;

    @Basic
    @javax.persistence.Column(name = "no_of_small_luggage", nullable = true, insertable = true, updatable = true)
    public Long getNoOfSmallLuggage() {
        return noOfSmallLuggage;
    }

    public void setNoOfSmallLuggage(Long noOfSmallLuggage) {
        this.noOfSmallLuggage = noOfSmallLuggage;
    }

    private Long acceptedQuoteId;

    @Basic
    @javax.persistence.Column(name = "accepted_quote_id", nullable = true, insertable = true, updatable = true)
    public Long getAcceptedQuoteId() {
        return acceptedQuoteId;
    }

    public void setAcceptedQuoteId(Long acceptedQuoteId) {
        this.acceptedQuoteId = acceptedQuoteId;
    }

    private Long journeyStatusCode;

    @Basic
    @javax.persistence.Column(name = "journey_status_code", nullable = false, insertable = true, updatable = true)
    public Long getJourneyStatusCode() {
        return journeyStatusCode;
    }

    public void setJourneyStatusCode(Long journeyStatusCode) {
        this.journeyStatusCode = journeyStatusCode;
    }

    private Timestamp createDate;

    @Basic
    @javax.persistence.Column(name = "create_date", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    private Long createdBy;

    @Basic
    @javax.persistence.Column(name = "created_by", nullable = false, insertable = true, updatable = true)
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    private Timestamp lastUpdateDate;

    @Basic
    @javax.persistence.Column(name = "last_update_date", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    private Long lastUpdatedBy;

    @Basic
    @javax.persistence.Column(name = "last_updated_by", nullable = true, insertable = true, updatable = true)
    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    private Long jpaVersionNumber;

    @Basic
    @javax.persistence.Column(name = "jpa_version_number", nullable = false, insertable = true, updatable = true)
    public Long getJpaVersionNumber() {
        return jpaVersionNumber;
    }

    public void setJpaVersionNumber(Long jpaVersionNumber) {
        this.jpaVersionNumber = jpaVersionNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Journey journey = (Journey) o;

        if (journeyId != journey.journeyId) return false;
        if (userId != journey.userId) return false;
        if (fromCityCode != journey.fromCityCode) return false;
        if (fromStateCode != journey.fromStateCode) return false;
        if (toCityCode != journey.toCityCode) return false;
        if (toStateCode != journey.toStateCode) return false;
        if (journeyStatusCode != journey.journeyStatusCode) return false;
        if (createdBy != journey.createdBy) return false;
        if (jpaVersionNumber != journey.jpaVersionNumber) return false;
        if (fromCountryCode != null ? !fromCountryCode.equals(journey.fromCountryCode) : journey.fromCountryCode != null)
            return false;
        if (toCountryCode != null ? !toCountryCode.equals(journey.toCountryCode) : journey.toCountryCode != null)
            return false;
        if (departureDateTime != null ? !departureDateTime.equals(journey.departureDateTime) : journey.departureDateTime != null)
            return false;
        if (returnDateTime != null ? !returnDateTime.equals(journey.returnDateTime) : journey.returnDateTime != null)
            return false;
        if (specialRequest != null ? !specialRequest.equals(journey.specialRequest) : journey.specialRequest != null)
            return false;
        if (noOfPassengers != null ? !noOfPassengers.equals(journey.noOfPassengers) : journey.noOfPassengers != null)
            return false;
        if (noOfExtraLargeLuggage != null ? !noOfExtraLargeLuggage.equals(journey.noOfExtraLargeLuggage) : journey.noOfExtraLargeLuggage != null)
            return false;
        if (noOfLargeLuggage != null ? !noOfLargeLuggage.equals(journey.noOfLargeLuggage) : journey.noOfLargeLuggage != null)
            return false;
        if (noOfMediumLuggage != null ? !noOfMediumLuggage.equals(journey.noOfMediumLuggage) : journey.noOfMediumLuggage != null)
            return false;
        if (noOfSmallLuggage != null ? !noOfSmallLuggage.equals(journey.noOfSmallLuggage) : journey.noOfSmallLuggage != null)
            return false;
        if (acceptedQuoteId != null ? !acceptedQuoteId.equals(journey.acceptedQuoteId) : journey.acceptedQuoteId != null)
            return false;
        if (createDate != null ? !createDate.equals(journey.createDate) : journey.createDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(journey.lastUpdateDate) : journey.lastUpdateDate != null)
            return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(journey.lastUpdatedBy) : journey.lastUpdatedBy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = journeyId.intValue();
        result = 31 * result + userId.intValue();
        result = 31 * result + fromCityCode.intValue();
        result = 31 * result + fromStateCode.intValue();
        result = 31 * result + (fromCountryCode != null ? fromCountryCode.hashCode() : 0);
        result = 31 * result + toCityCode.intValue();
        result = 31 * result + toStateCode.intValue();
        result = 31 * result + (toCountryCode != null ? toCountryCode.hashCode() : 0);
        result = 31 * result + (departureDateTime != null ? departureDateTime.hashCode() : 0);
        result = 31 * result + (returnDateTime != null ? returnDateTime.hashCode() : 0);
        result = 31 * result + (specialRequest != null ? specialRequest.hashCode() : 0);
        result = 31 * result + (noOfPassengers != null ? noOfPassengers.hashCode() : 0);
        result = 31 * result + (noOfExtraLargeLuggage != null ? noOfExtraLargeLuggage.hashCode() : 0);
        result = 31 * result + (noOfLargeLuggage != null ? noOfLargeLuggage.hashCode() : 0);
        result = 31 * result + (noOfMediumLuggage != null ? noOfMediumLuggage.hashCode() : 0);
        result = 31 * result + (noOfSmallLuggage != null ? noOfSmallLuggage.hashCode() : 0);
        result = 31 * result + (acceptedQuoteId != null ? acceptedQuoteId.hashCode() : 0);
        result = 31 * result + journeyStatusCode.intValue();
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + createdBy.intValue();
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + jpaVersionNumber.intValue();
        return result;
    }
}
