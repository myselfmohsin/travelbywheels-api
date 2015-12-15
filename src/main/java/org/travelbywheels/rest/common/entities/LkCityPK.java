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
public class LkCityPK implements Serializable {
    private int cityCode;
    private int stateCode;
    private String countryCode;

    @Column(name = "city_code", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

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

        LkCityPK lkCityPK = (LkCityPK) o;

        if (cityCode != lkCityPK.cityCode) return false;
        if (stateCode != lkCityPK.stateCode) return false;
        if (countryCode != null ? !countryCode.equals(lkCityPK.countryCode) : lkCityPK.countryCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityCode;
        result = 31 * result + stateCode;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        return result;
    }
}
