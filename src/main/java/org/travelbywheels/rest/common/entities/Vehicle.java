package org.travelbywheels.rest.common.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
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
public class Vehicle {
    private int vehicleId;
    private String numberPlate;
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleRegistrationYear;
    private String isVehicleVerified;
    private int travelAgencyId;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private int jpaVersionNumber;

    @Id
    @Column(name = "vehicle_id", nullable = false, insertable = true, updatable = true)
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Basic
    @Column(name = "number_plate", nullable = true, insertable = true, updatable = true, length = 45)
    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    @Basic
    @Column(name = "vehicle_make", nullable = true, insertable = true, updatable = true, length = 45)
    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    @Basic
    @Column(name = "vehicle_model", nullable = true, insertable = true, updatable = true, length = 45)
    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    @Basic
    @Column(name = "vehicle_registration_year", nullable = true, insertable = true, updatable = true, length = 45)
    public String getVehicleRegistrationYear() {
        return vehicleRegistrationYear;
    }

    public void setVehicleRegistrationYear(String vehicleRegistrationYear) {
        this.vehicleRegistrationYear = vehicleRegistrationYear;
    }

    @Basic
    @Column(name = "is_vehicle_verified", nullable = false, insertable = true, updatable = true, length = 1)
    public String getIsVehicleVerified() {
        return isVehicleVerified;
    }

    public void setIsVehicleVerified(String isVehicleVerified) {
        this.isVehicleVerified = isVehicleVerified;
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

        Vehicle vehicle = (Vehicle) o;

        if (vehicleId != vehicle.vehicleId) return false;
        if (travelAgencyId != vehicle.travelAgencyId) return false;
        if (createdBy != vehicle.createdBy) return false;
        if (jpaVersionNumber != vehicle.jpaVersionNumber) return false;
        if (numberPlate != null ? !numberPlate.equals(vehicle.numberPlate) : vehicle.numberPlate != null) return false;
        if (vehicleMake != null ? !vehicleMake.equals(vehicle.vehicleMake) : vehicle.vehicleMake != null) return false;
        if (vehicleModel != null ? !vehicleModel.equals(vehicle.vehicleModel) : vehicle.vehicleModel != null)
            return false;
        if (vehicleRegistrationYear != null ? !vehicleRegistrationYear.equals(vehicle.vehicleRegistrationYear) : vehicle.vehicleRegistrationYear != null)
            return false;
        if (isVehicleVerified != null ? !isVehicleVerified.equals(vehicle.isVehicleVerified) : vehicle.isVehicleVerified != null)
            return false;
        if (createDate != null ? !createDate.equals(vehicle.createDate) : vehicle.createDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(vehicle.lastUpdateDate) : vehicle.lastUpdateDate != null)
            return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(vehicle.lastUpdatedBy) : vehicle.lastUpdatedBy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vehicleId;
        result = 31 * result + (numberPlate != null ? numberPlate.hashCode() : 0);
        result = 31 * result + (vehicleMake != null ? vehicleMake.hashCode() : 0);
        result = 31 * result + (vehicleModel != null ? vehicleModel.hashCode() : 0);
        result = 31 * result + (vehicleRegistrationYear != null ? vehicleRegistrationYear.hashCode() : 0);
        result = 31 * result + (isVehicleVerified != null ? isVehicleVerified.hashCode() : 0);
        result = 31 * result + travelAgencyId;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + jpaVersionNumber;
        return result;
    }
}
