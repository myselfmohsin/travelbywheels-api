package org.travelbywheels.rest.common.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.travelbywheels.rest.common.entities.User;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 25/11/2015
 * Time: 17:02
 * Copyright TravelByWheels.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-config.xml")
public class UserRepoTest {

    @Qualifier("userRepoImpl")
    @Autowired
    private UserRepo userRepo;

    private User user;

    @Before
    public void setup() {
        user = new User();
    }

//    @Test
    @Transactional
    @Rollback(false)
    public void testGetUser(){
        user = userRepo.getUser("myselfmohsin@gmail.com");
        assertNotNull(user);

    }

    @Test
    @Transactional
    @Rollback(false)
    public void testCheckEmailExist(){
        int emailCount= userRepo.getEmailCount("myselfmohsin1@gmail.com");

        System.out.println(emailCount);

    }

//    @Test
    @Transactional
    @Rollback(true)
    public void testRegisterUser(){

        User user = new User();
        user.setUserEmail("myselfmohsin2@gmail.com");
        user.setUserPassword("mohsin");

        User newUser = userRepo.registerUser(user);

        System.out.println(newUser.getUserId());

    }
}
