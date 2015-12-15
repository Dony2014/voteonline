package com.done.analytics.controller;


import com.done.analytics.domain.User;
import com.done.analytics.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller

public class IndexController {

    private UserService userService;
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = {"/analytics", "/"}, method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        User user = (User) request.getAttribute("current_use");
        if (user != null) {
            return "redirect:/result";
        }
        logger.debug("----------------test----------------");

        return "index";
    }

}
