package com.done.analytics.controller;


import com.done.analytics.domain.User;
import com.done.analytics.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
        logger.info("----------------test----------------");
        logger.debug("----------------test----------------");

        return "index";

    }

    @RequestMapping(value = "/index/login", method = RequestMethod.POST)
    public String loginAction(HttpServletRequest request, @ModelAttribute("login") User user, Model model) {
        logger.info(this.getIpAddr(request));
        user = userService.queryUser(user);
        if (user.getIsVoted() == null) {
            user.setIsVoted(false);
        }
        if (user.getId() != 0) {
            request.getSession().setAttribute("current_use", user);
            if (user.getAvailableCount() > 0) {
                return "redirect:/add";
            } else {
                return "redirect:/main";
            }

        } else {
            model.addAttribute("message", "Invalid user name and password");
            return "index";
        }

    }
    public  String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
