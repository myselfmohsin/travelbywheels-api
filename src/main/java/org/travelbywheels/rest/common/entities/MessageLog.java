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
@Table(name = "message_log", schema = "", catalog = "travelbywheels")
public class MessageLog {
    private int messageLogId;
    private String messageText;
    private int userId;
    private int travelAgencyId;
    private int journeyId;
    private int parentMessageLogId;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private int jpaVersionNumber;

    @Id
    @Column(name = "message_log_id", nullable = false, insertable = true, updatable = true)
    public int getMessageLogId() {
        return messageLogId;
    }

    public void setMessageLogId(int messageLogId) {
        this.messageLogId = messageLogId;
    }

    @Basic
    @Column(name = "message_text", nullable = false, insertable = true, updatable = true, length = 500)
    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
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
    @Column(name = "journey_id", nullable = false, insertable = true, updatable = true)
    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }

    @Basic
    @Column(name = "parent_message_log_id", nullable = false, insertable = true, updatable = true)
    public int getParentMessageLogId() {
        return parentMessageLogId;
    }

    public void setParentMessageLogId(int parentMessageLogId) {
        this.parentMessageLogId = parentMessageLogId;
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

        MessageLog that = (MessageLog) o;

        if (messageLogId != that.messageLogId) return false;
        if (userId != that.userId) return false;
        if (travelAgencyId != that.travelAgencyId) return false;
        if (journeyId != that.journeyId) return false;
        if (parentMessageLogId != that.parentMessageLogId) return false;
        if (createdBy != that.createdBy) return false;
        if (jpaVersionNumber != that.jpaVersionNumber) return false;
        if (messageText != null ? !messageText.equals(that.messageText) : that.messageText != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(that.lastUpdatedBy) : that.lastUpdatedBy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = messageLogId;
        result = 31 * result + (messageText != null ? messageText.hashCode() : 0);
        result = 31 * result + userId;
        result = 31 * result + travelAgencyId;
        result = 31 * result + journeyId;
        result = 31 * result + parentMessageLogId;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + jpaVersionNumber;
        return result;
    }
}
