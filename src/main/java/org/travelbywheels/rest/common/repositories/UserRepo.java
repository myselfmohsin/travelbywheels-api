package org.travelbywheels.rest.common.repositories;

import org.travelbywheels.rest.common.entities.User;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 25/11/2015
 * Time: 15:37
 * Copyright TravelByWheels.
 */
public interface UserRepo {

    public User getUser(String userEmail);

    public int getEmailCount(String userEmail);

    public User registerUser(User user);
}
