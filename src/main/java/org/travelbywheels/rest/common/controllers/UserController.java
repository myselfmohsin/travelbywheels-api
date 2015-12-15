package org.travelbywheels.rest.common.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.travelbywheels.rest.common.data.PersonData;
import org.travelbywheels.rest.common.data.UserData;
import org.travelbywheels.rest.common.entities.User;
import org.travelbywheels.rest.common.services.UserService;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 25/11/2015
 * Time: 15:17
 * Copyright TravelByWheels.
 */

@Controller
@RequestMapping("/api/user-services")
public class UserController {

    private static final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(UserController.class);

    @Qualifier("userServiceImpl")
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{userEmail}/", method = RequestMethod.GET)
    public ResponseEntity<UserData> getUserData(@PathVariable String userEmail) {

        User user = userService.getUser(userEmail);
        if (user != null){
            UserData userData = new UserData(user);
            userData.setPersonDataByUserId(new PersonData(user.getPersonByUserId()));
            return new ResponseEntity<UserData>(userData, HttpStatus.OK);
        } else {
            return new ResponseEntity<UserData>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/{userEmail}/check", method = RequestMethod.GET)
    public ResponseEntity<Boolean> isUserEmailExist(@PathVariable String userEmail) {

        LOG.info("isUserEmailExist Request");
        ResponseEntity responseEntity = new ResponseEntity<Boolean>(userService.isUserEmailExist(userEmail), HttpStatus.OK);
        LOG.info("responseEntity Ready"+responseEntity.toString());
        return responseEntity;
    }

    @RequestMapping(value = "/register-user", method = RequestMethod.POST)
    public ResponseEntity<UserData> registerUser(@RequestBody UserData userData) {


        User user = userData.toUser();
        userService.registerUser(user);

        userData = new UserData(user);
        PersonData personData = new PersonData(user.getPersonByUserId());
        userData.setPersonDataByUserId(personData);

        return new ResponseEntity<UserData>(userData, HttpStatus.OK);
    }



}
