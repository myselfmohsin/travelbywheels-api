package org.travelbywheels.rest.common.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 25/11/2015
 * Time: 19:30
 * Copyright TravelByWheels.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-config.xml")
public class UserControllerTest {

    @Qualifier("userController")
    @InjectMocks
    @Autowired
    private UserController userController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

//    @Test
    public void testGetUserData() throws Exception {

        mockMvc.perform(get("/REST/user-services/mohsin@iintellisys.com/")).andDo(print());
    }

    @Test
    public void testIsUserEmailExist() throws Exception {

        mockMvc.perform(get("/REST/user-services/myselfmohsin@gmail.com/check")).andDo(print());
    }

//    @Test
    public void testRegisterUser() throws Exception {

        String content = "{\"userEmail\":\"myselfmohsin33@gmail.com\",\"userPassword\":\"mohsin\",\"personDataByUserId\":{\"personId\":null,\"userDataByPersonId\":null}}";
        mockMvc.perform(post("/REST/user-services/register-user")
                .content(content)
                .contentType(MediaType.APPLICATION_JSON)).andDo(print());


    }

}
