package org.travelbywheels.rest.common.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.travelbywheels.rest.common.entities.User;
import org.travelbywheels.rest.common.repositories.UserRepo;
import org.travelbywheels.rest.common.services.UserService;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 25/11/2015
 * Time: 15:33
 * Copyright TravelByWheels.
 */

@Service
public class UserServiceImpl implements UserService {

    @Qualifier("userRepoImpl")
    @Autowired
    private UserRepo userRepo;

    @Override
    public User getUser(String userEmail) {

        User user = userRepo.getUser(userEmail);

        return user;
    }

    @Override
    public Boolean isUserEmailExist(String userEmail) {
        return (userRepo.getEmailCount(userEmail)==0?Boolean.FALSE:Boolean.TRUE);
    }

    @Transactional
    @Override
    public User registerUser(User user) {
        return userRepo.registerUser(user);
    }
}
