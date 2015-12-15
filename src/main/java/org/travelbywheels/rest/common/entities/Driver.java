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
 * Time: 00:29
 * Copyright TravelByWheels.
 */
@Entity
public class Driver {
    private int driverId;
    private String driverPhotoThumbnailUrl;
    private String driverPhotoUrl;
    private String driverLicenceNumber;
    private Timestamp firstLicenceIssueDate;
    private String isLicenceVerified;
    private String isAddressVerified;
    private int travelAgencyId;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private int jpaVersionNumber;

    @Id
    @Column(name = "driver_id", nullable = false, insertable = true, updatable = true)
    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    @Basic
    @Column(name = "driver_photo_thumbnail_url", nullable = true, insertable = true, updatable = true, length = 250)
    public String getDriverPhotoThumbnailUrl() {
        return driverPhotoThumbnailUrl;
    }

    public void setDriverPhotoThumbnailUrl(String driverPhotoThumbnailUrl) {
        this.driverPhotoThumbnailUrl = driverPhotoThumbnailUrl;
    }

    @Basic
    @Column(name = "driver_photo_url", nullable = true, insertable = true, updatable = true, length = 250)
    public String getDriverPhotoUrl() {
        return driverPhotoUrl;
    }

    public void setDriverPhotoUrl(String driverPhotoUrl) {
        this.driverPhotoUrl = driverPhotoUrl;
    }

    @Basic
    @Column(name = "driver_licence_number", nullable = true, insertable = true, updatable = true, length = 45)
    public String getDriverLicenceNumber() {
        return driverLicenceNumber;
    }

    public void setDriverLicenceNumber(String driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber;
    }

    @Basic
    @Column(name = "first_licence_issue_date", nullable = true, insertable = true, updatable = true)
    public Timestamp getFirstLicenceIssueDate() {
        return firstLicenceIssueDate;
    }

    public void setFirstLicenceIssueDate(Timestamp firstLicenceIssueDate) {
        this.firstLicenceIssueDate = firstLicenceIssueDate;
    }

    @Basic
    @Column(name = "is_licence_verified", nullable = false, insertable = true, updatable = true, length = 1)
    public String getIsLicenceVerified() {
        return isLicenceVerified;
    }

    public void setIsLicenceVerified(String isLicenceVerified) {
        this.isLicenceVerified = isLicenceVerified;
    }

    @Basic
    @Column(name = "is_address_verified", nullable = false, insertable = true, updatable = true, length = 1)
    public String getIsAddressVerified() {
        return isAddressVerified;
    }

    public void setIsAddressVerified(String isAddressVerified) {
        this.isAddressVerified = isAddressVerified;
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

        Driver driver = (Driver) o;

        if (driverId != driver.driverId) return false;
        if (travelAgencyId != driver.travelAgencyId) return false;
        if (createdBy != driver.createdBy) return false;
        if (jpaVersionNumber != driver.jpaVersionNumber) return false;
        if (driverPhotoThumbnailUrl != null ? !driverPhotoThumbnailUrl.equals(driver.driverPhotoThumbnailUrl) : driver.driverPhotoThumbnailUrl != null)
            return false;
        if (driverPhotoUrl != null ? !driverPhotoUrl.equals(driver.driverPhotoUrl) : driver.driverPhotoUrl != null)
            return false;
        if (driverLicenceNumber != null ? !driverLicenceNumber.equals(driver.driverLicenceNumber) : driver.driverLicenceNumber != null)
            return false;
        if (firstLicenceIssueDate != null ? !firstLicenceIssueDate.equals(driver.firstLicenceIssueDate) : driver.firstLicenceIssueDate != null)
            return false;
        if (isLicenceVerified != null ? !isLicenceVerified.equals(driver.isLicenceVerified) : driver.isLicenceVerified != null)
            return false;
        if (isAddressVerified != null ? !isAddressVerified.equals(driver.isAddressVerified) : driver.isAddressVerified != null)
            return false;
        if (createDate != null ? !createDate.equals(driver.createDate) : driver.createDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(driver.lastUpdateDate) : driver.lastUpdateDate != null)
            return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(driver.lastUpdatedBy) : driver.lastUpdatedBy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = driverId;
        result = 31 * result + (driverPhotoThumbnailUrl != null ? driverPhotoThumbnailUrl.hashCode() : 0);
        result = 31 * result + (driverPhotoUrl != null ? driverPhotoUrl.hashCode() : 0);
        result = 31 * result + (driverLicenceNumber != null ? driverLicenceNumber.hashCode() : 0);
        result = 31 * result + (firstLicenceIssueDate != null ? firstLicenceIssueDate.hashCode() : 0);
        result = 31 * result + (isLicenceVerified != null ? isLicenceVerified.hashCode() : 0);
        result = 31 * result + (isAddressVerified != null ? isAddressVerified.hashCode() : 0);
        result = 31 * result + travelAgencyId;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + jpaVersionNumber;
        return result;
    }
}
