package org.travelbywheels.rest.common.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 22/11/2015
 * Time: 00:30
 * Copyright TravelByWheels.
 */
public class PersonAddressPK implements Serializable {
    private int addressId;
    private int personId;

    @Column(name = "address_id", nullable = false, insertable = true, updatable = true)
    @Id
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Column(name = "person_id", nullable = false, insertable = true, updatable = true)
    @Id
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonAddressPK that = (PersonAddressPK) o;

        if (addressId != that.addressId) return false;
        if (personId != that.personId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = addressId;
        result = 31 * result + personId;
        return result;
    }
}
