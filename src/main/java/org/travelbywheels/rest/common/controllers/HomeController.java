package org.travelbywheels.rest.common.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 21/11/2015
 * Time: 00:49
 * Copyright TravelByWheels.
 */

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String homePage() {
        return "index";
    }
}
