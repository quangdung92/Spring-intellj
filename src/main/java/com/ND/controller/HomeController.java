package com.ND.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.apache.log4j.Logger;

/**
 * Created by quangdung on 24/05/2016.
 */
@Controller
public class HomeController {
    private static final Logger logger = Logger.getLogger(HomeController.class);

    @RequestMapping(value = "/")
    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        logger.info("This is an info log entry");
        logger.error("This is an error log entry");
        model.setViewName("test");
        return model;
    }

    @RequestMapping(value = "/success")
    public ModelAndView successPage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("home/success");
        return model;
    }

    @RequestMapping(value = "/fail")
    public ModelAndView failPage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("home/fail");
        return model;
    }

    @RequestMapping(value = "/sign_up")
    public ModelAndView signUpPage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("home/sign_up");
        return model;
    }
}
