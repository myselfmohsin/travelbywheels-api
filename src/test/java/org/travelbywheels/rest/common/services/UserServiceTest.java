package org.travelbywheels.rest.common.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.travelbywheels.rest.common.entities.User;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 29/11/2015
 * Time: 00:37
 * Copyright TravelByWheels.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-config.xml")
public class UserServiceTest {

    @Qualifier("userServiceImpl")
    @Autowired
    private UserService userService;

    @Test
//    @Transactional
//    @Rollback(false)
    public void testRegisterUser(){

        User user = new User();
        user.setUserEmail("myselfmohsin3@gmail.com");
        user.setUserPassword("mohsin");

//        User newUser = userService.registerUser(user);

//        System.out.println(newUser.getUserId());

    }
}
