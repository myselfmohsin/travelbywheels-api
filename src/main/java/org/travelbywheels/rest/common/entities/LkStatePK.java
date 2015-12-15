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
public class LkStatePK implements Serializable {
    private int stateCode;
    private String countryCode;

    @Column(name = "state_code", nullable = false, insertable = true, updatable = true)
    @Id
    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    @Column(name = "country_code", nullable = false, insertable = true, updatable = true, length = 3)
    @Id
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LkStatePK lkStatePK = (LkStatePK) o;

        if (stateCode != lkStatePK.stateCode) return false;
        if (countryCode != null ? !countryCode.equals(lkStatePK.countryCode) : lkStatePK.countryCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stateCode;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        return result;
    }
}
