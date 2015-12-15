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
@Table(name = "vehicle_photo", schema = "", catalog = "travelbywheels")
public class VehiclePhoto {
    private int vehiclePhotoId;
    private String vehiclePhotoThumbnailUrl;
    private String vehiclePhotoUrl;
    private int vehicleVehicleId;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private int jpaVersionNumber;

    @Id
    @Column(name = "vehicle_photo_id", nullable = false, insertable = true, updatable = true)
    public int getVehiclePhotoId() {
        return vehiclePhotoId;
    }

    public void setVehiclePhotoId(int vehiclePhotoId) {
        this.vehiclePhotoId = vehiclePhotoId;
    }

    @Basic
    @Column(name = "vehicle_photo_thumbnail_url", nullable = false, insertable = true, updatable = true, length = 250)
    public String getVehiclePhotoThumbnailUrl() {
        return vehiclePhotoThumbnailUrl;
    }

    public void setVehiclePhotoThumbnailUrl(String vehiclePhotoThumbnailUrl) {
        this.vehiclePhotoThumbnailUrl = vehiclePhotoThumbnailUrl;
    }

    @Basic
    @Column(name = "vehicle_photo_url", nullable = false, insertable = true, updatable = true, length = 250)
    public String getVehiclePhotoUrl() {
        return vehiclePhotoUrl;
    }

    public void setVehiclePhotoUrl(String vehiclePhotoUrl) {
        this.vehiclePhotoUrl = vehiclePhotoUrl;
    }

    @Basic
    @Column(name = "vehicle_vehicle_id", nullable = false, insertable = true, updatable = true)
    public int getVehicleVehicleId() {
        return vehicleVehicleId;
    }

    public void setVehicleVehicleId(int vehicleVehicleId) {
        this.vehicleVehicleId = vehicleVehicleId;
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

        VehiclePhoto that = (VehiclePhoto) o;

        if (vehiclePhotoId != that.vehiclePhotoId) return false;
        if (vehicleVehicleId != that.vehicleVehicleId) return false;
        if (createdBy != that.createdBy) return false;
        if (jpaVersionNumber != that.jpaVersionNumber) return false;
        if (vehiclePhotoThumbnailUrl != null ? !vehiclePhotoThumbnailUrl.equals(that.vehiclePhotoThumbnailUrl) : that.vehiclePhotoThumbnailUrl != null)
            return false;
        if (vehiclePhotoUrl != null ? !vehiclePhotoUrl.equals(that.vehiclePhotoUrl) : that.vehiclePhotoUrl != null)
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
        int result = vehiclePhotoId;
        result = 31 * result + (vehiclePhotoThumbnailUrl != null ? vehiclePhotoThumbnailUrl.hashCode() : 0);
        result = 31 * result + (vehiclePhotoUrl != null ? vehiclePhotoUrl.hashCode() : 0);
        result = 31 * result + vehicleVehicleId;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + jpaVersionNumber;
        return result;
    }
}
