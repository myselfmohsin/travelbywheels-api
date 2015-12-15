package org.travelbywheels.rest.common.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.travelbywheels.rest.common.entities.Journey;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 01/12/2015
 * Time: 17:09
 * Copyright TravelByWheels.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JourneyData {

    private Long journeyId;

    public Long getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(Long journeyId) {
        this.journeyId = journeyId;
    }

    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    private Long fromCityCode;

    public Long getFromCityCode() {
        return fromCityCode;
    }

    public void setFromCityCode(Long fromCityCode) {
        this.fromCityCode = fromCityCode;
    }

    private Long fromStateCode;

    public Long getFromStateCode() {
        return fromStateCode;
    }

    public void setFromStateCode(Long fromStateCode) {
        this.fromStateCode = fromStateCode;
    }

    private String fromCountryCode;

    public String getFromCountryCode() {
        return fromCountryCode;
    }

    public void setFromCountryCode(String fromCountryCode) {
        this.fromCountryCode = fromCountryCode;
    }

    private Long toCityCode;

    public Long getToCityCode() {
        return toCityCode;
    }

    public void setToCityCode(Long toCityCode) {
        this.toCityCode = toCityCode;
    }

    private Long toStateCode;

    public Long getToStateCode() {
        return toStateCode;
    }

    public void setToStateCode(Long toStateCode) {
        this.toStateCode = toStateCode;
    }

    private String toCountryCode;

    public String getToCountryCode() {
        return toCountryCode;
    }

    public void setToCountryCode(String toCountryCode) {
        this.toCountryCode = toCountryCode;
    }

    private String departureDateTime;

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    private String returnDateTime;

    public String getReturnDateTime() {
        return returnDateTime;
    }

    public void setReturnDateTime(String returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    private String specialRequest;

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    private Long noOfPassengers;

    public Long getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(Long noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    private Long noOfExtraLargeLuggage;

    public Long getNoOfExtraLargeLuggage() {
        return noOfExtraLargeLuggage;
    }

    public void setNoOfExtraLargeLuggage(Long noOfExtraLargeLuggage) {
        this.noOfExtraLargeLuggage = noOfExtraLargeLuggage;
    }

    private Long noOfLargeLuggage;

    public Long getNoOfLargeLuggage() {
        return noOfLargeLuggage;
    }

    public void setNoOfLargeLuggage(Long noOfLargeLuggage) {
        this.noOfLargeLuggage = noOfLargeLuggage;
    }

    private Long noOfMediumLuggage;

    public Long getNoOfMediumLuggage() {
        return noOfMediumLuggage;
    }

    public void setNoOfMediumLuggage(Long noOfMediumLuggage) {
        this.noOfMediumLuggage = noOfMediumLuggage;
    }

    private Long noOfSmallLuggage;

    public Long getNoOfSmallLuggage() {
        return noOfSmallLuggage;
    }

    public void setNoOfSmallLuggage(Long noOfSmallLuggage) {
        this.noOfSmallLuggage = noOfSmallLuggage;
    }

    private Long acceptedQuoteId;

    public Long getAcceptedQuoteId() {
        return acceptedQuoteId;
    }

    public void setAcceptedQuoteId(Long acceptedQuoteId) {
        this.acceptedQuoteId = acceptedQuoteId;
    }

    private Long journeyStatusCode;

    public Long getJourneyStatusCode() {
        return journeyStatusCode;
    }

    public void setJourneyStatusCode(Long journeyStatusCode) {
        this.journeyStatusCode = journeyStatusCode;
    }

    private Timestamp createDate;

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    private Long createdBy;

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    private Timestamp lastUpdateDate;

    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    private Long lastUpdatedBy;

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public JourneyData() {
    }

    public JourneyData(Journey journey) {
        this.journeyId = journey.getJourneyId();
        this.userId = journey.getUserId();
        this.fromCityCode = journey.getFromCityCode();
        this.fromStateCode = journey.getFromStateCode();
        this.fromCountryCode = journey.getFromCountryCode();
        this.toCityCode = journey.getToCityCode();
        this.toStateCode = journey.getToStateCode();
        this.toCountryCode = journey.getToCountryCode();
        this.departureDateTime = journey.getDepartureDateTime();
        this.returnDateTime = journey.getReturnDateTime();
        this.specialRequest = journey.getSpecialRequest();
        this.noOfPassengers = journey.getNoOfPassengers();
        this.noOfExtraLargeLuggage = journey.getNoOfExtraLargeLuggage();
        this.noOfLargeLuggage = journey.getNoOfLargeLuggage();
        this.noOfMediumLuggage = journey.getNoOfMediumLuggage();
        this.noOfSmallLuggage = journey.getNoOfSmallLuggage();
        this.acceptedQuoteId = journey.getAcceptedQuoteId();
        this.journeyStatusCode = journey.getJourneyStatusCode();
        this.createDate = journey.getCreateDate();
        this.createdBy = journey.getCreatedBy();
        this.lastUpdateDate = journey.getLastUpdateDate();
        this.lastUpdatedBy = journey.getLastUpdatedBy();
    }

    public Journey toJourney(){

        Journey journey = new Journey();

        journey.setJourneyId(this.journeyId);
        journey.setUserId(this.userId);
        journey.setFromCityCode(this.fromCityCode);
        journey.setFromStateCode(this.fromStateCode);
        journey.setFromCountryCode(this.fromCountryCode);
        journey.setToCityCode(this.toCityCode);
        journey.setToStateCode(this.toStateCode);
        journey.setToCountryCode(this.toCountryCode);
        journey.setDepartureDateTime(this.departureDateTime);
        journey.setReturnDateTime(this.returnDateTime);
        journey.setSpecialRequest(this.specialRequest);
        journey.setNoOfPassengers(this.noOfPassengers);
        journey.setNoOfExtraLargeLuggage(this.noOfExtraLargeLuggage);
        journey.setNoOfLargeLuggage(this.noOfLargeLuggage);
        journey.setNoOfMediumLuggage(this.noOfMediumLuggage);
        journey.setNoOfSmallLuggage(this.noOfSmallLuggage);
        journey.setAcceptedQuoteId(this.acceptedQuoteId);
        journey.setJourneyStatusCode(this.journeyStatusCode);
        journey.setCreateDate(this.createDate);
        journey.setCreatedBy(this.createdBy);
        journey.setLastUpdateDate(this.lastUpdateDate);
        journey.setLastUpdatedBy(this.lastUpdatedBy);

        return journey;
    }
}
