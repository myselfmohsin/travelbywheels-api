package org.travelbywheels.rest.common.services;

import org.travelbywheels.rest.common.entities.User;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 25/11/2015
 * Time: 15:19
 * Copyright TravelByWheels.
 */
public interface UserService {

    public User getUser(String userEmail);

    public Boolean isUserEmailExist(String userEmail);

    public User registerUser(User user);
}
