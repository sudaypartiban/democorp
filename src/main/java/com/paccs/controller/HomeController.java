package com.lynas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lynas on 2/3/16
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }
}
