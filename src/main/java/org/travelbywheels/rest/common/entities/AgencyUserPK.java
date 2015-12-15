package org.travelbywheels.rest.common.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 22/11/2015
 * Time: 00:29
 * Copyright TravelByWheels.
 */
public class AgencyUserPK implements Serializable {
    private int userId;
    private int travelAgencyId;

    @Column(name = "user_id", nullable = false, insertable = true, updatable = true)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "travel_agency_id", nullable = false, insertable = true, updatable = true)
    @Id
    public int getTravelAgencyId() {
        return travelAgencyId;
    }

    public void setTravelAgencyId(int travelAgencyId) {
        this.travelAgencyId = travelAgencyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgencyUserPK that = (AgencyUserPK) o;

        if (userId != that.userId) return false;
        if (travelAgencyId != that.travelAgencyId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + travelAgencyId;
        return result;
    }
}
