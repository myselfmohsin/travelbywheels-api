package org.travelbywheels.rest.common.services.impl;

import org.springframework.stereotype.Service;
import org.travelbywheels.rest.common.services.MessageService;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 21/11/2015
 * Time: 00:50
 * Copyright TravelByWheels.
 */

@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public String getHelloMessage(Date date) {
        return "Hello World! " + date.toString();
    }

}
