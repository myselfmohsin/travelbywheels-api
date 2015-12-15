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
@Table(name = "travel_agency", schema = "", catalog = "travelbywheels")
public class TravelAgency {
    private int travelAgencyId;
    private String agencyName;
    private String agencyPhone;
    private String agencyMobile;
    private int agencyAddressId;
    private int responsiblePersonId;
    private Timestamp createDate;
    private int createdBy;
    private Timestamp lastUpdateDate;
    private Integer lastUpdatedBy;
    private int jpaVersionNumber;

    @Id
    @Column(name = "travel_agency_id", nullable = false, insertable = true, updatable = true)
    public int getTravelAgencyId() {
        return travelAgencyId;
    }

    public void setTravelAgencyId(int travelAgencyId) {
        this.travelAgencyId = travelAgencyId;
    }

    @Basic
    @Column(name = "agency_name", nullable = false, insertable = true, updatable = true, length = 45)
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Basic
    @Column(name = "agency_phone", nullable = true, insertable = true, updatable = true, length = 15)
    public String getAgencyPhone() {
        return agencyPhone;
    }

    public void setAgencyPhone(String agencyPhone) {
        this.agencyPhone = agencyPhone;
    }

    @Basic
    @Column(name = "agency_mobile", nullable = true, insertable = true, updatable = true, length = 15)
    public String getAgencyMobile() {
        return agencyMobile;
    }

    public void setAgencyMobile(String agencyMobile) {
        this.agencyMobile = agencyMobile;
    }

    @Basic
    @Column(name = "agency_address_id", nullable = false, insertable = true, updatable = true)
    public int getAgencyAddressId() {
        return agencyAddressId;
    }

    public void setAgencyAddressId(int agencyAddressId) {
        this.agencyAddressId = agencyAddressId;
    }

    @Basic
    @Column(name = "responsible_person_id", nullable = false, insertable = true, updatable = true)
    public int getResponsiblePersonId() {
        return responsiblePersonId;
    }

    public void setResponsiblePersonId(int responsiblePersonId) {
        this.responsiblePersonId = responsiblePersonId;
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

        TravelAgency that = (TravelAgency) o;

        if (travelAgencyId != that.travelAgencyId) return false;
        if (agencyAddressId != that.agencyAddressId) return false;
        if (responsiblePersonId != that.responsiblePersonId) return false;
        if (createdBy != that.createdBy) return false;
        if (jpaVersionNumber != that.jpaVersionNumber) return false;
        if (agencyName != null ? !agencyName.equals(that.agencyName) : that.agencyName != null) return false;
        if (agencyPhone != null ? !agencyPhone.equals(that.agencyPhone) : that.agencyPhone != null) return false;
        if (agencyMobile != null ? !agencyMobile.equals(that.agencyMobile) : that.agencyMobile != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(that.lastUpdatedBy) : that.lastUpdatedBy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = travelAgencyId;
        result = 31 * result + (agencyName != null ? agencyName.hashCode() : 0);
        result = 31 * result + (agencyPhone != null ? agencyPhone.hashCode() : 0);
        result = 31 * result + (agencyMobile != null ? agencyMobile.hashCode() : 0);
        result = 31 * result + agencyAddressId;
        result = 31 * result + responsiblePersonId;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + jpaVersionNumber;
        return result;
    }
}
