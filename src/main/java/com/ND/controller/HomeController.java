package com.ND.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by quangdung on 24/05/2016.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home() {
        return "test";
    }
}
