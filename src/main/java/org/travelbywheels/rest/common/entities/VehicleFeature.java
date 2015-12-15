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
@Table(name = "vehicle_feature", schema = "", catalog = "travelbywheels")
public class VehicleFeature {
    private int vehicleFeatureId;
    private int vehicleId;
    private int featureCode;
    private String isFeatureVerified;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private int jpaVersionNumber;

    @Id
    @Column(name = "vehicle_feature_id", nullable = false, insertable = true, updatable = true)
    public int getVehicleFeatureId() {
        return vehicleFeatureId;
    }

    public void setVehicleFeatureId(int vehicleFeatureId) {
        this.vehicleFeatureId = vehicleFeatureId;
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
    @Column(name = "feature_code", nullable = false, insertable = true, updatable = true)
    public int getFeatureCode() {
        return featureCode;
    }

    public void setFeatureCode(int featureCode) {
        this.featureCode = featureCode;
    }

    @Basic
    @Column(name = "is_feature_verified", nullable = false, insertable = true, updatable = true, length = 1)
    public String getIsFeatureVerified() {
        return isFeatureVerified;
    }

    public void setIsFeatureVerified(String isFeatureVerified) {
        this.isFeatureVerified = isFeatureVerified;
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

        VehicleFeature that = (VehicleFeature) o;

        if (vehicleFeatureId != that.vehicleFeatureId) return false;
        if (vehicleId != that.vehicleId) return false;
        if (featureCode != that.featureCode) return false;
        if (createdBy != that.createdBy) return false;
        if (jpaVersionNumber != that.jpaVersionNumber) return false;
        if (isFeatureVerified != null ? !isFeatureVerified.equals(that.isFeatureVerified) : that.isFeatureVerified != null)
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
        int result = vehicleFeatureId;
        result = 31 * result + vehicleId;
        result = 31 * result + featureCode;
        result = 31 * result + (isFeatureVerified != null ? isFeatureVerified.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + jpaVersionNumber;
        return result;
    }
}
