package com.oracle.emqa.controller;

import com.oracle.emqa.model.Topic;
import com.oracle.emqa.model.User;
import com.oracle.emqa.service.TopicService;
import com.oracle.emqa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Dony on 10/31/2014.
 */
@Controller
public class TopicAddController {

    private UserService userService;
    private TopicService topicService;

    @Autowired
    public void setTopicService(TopicService topicService) {
        this.topicService = topicService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = {"/add"}, method = RequestMethod.GET)
    public String toAddPage(HttpServletRequest request, Model model) {
        User user = (User) request.getSession().getAttribute("current_use");
        if (user == null) {
            return "redirect:/index";
        }
        user = userService.queryUser(user);
        model.addAttribute("user", user);
        model.addAttribute("message_count",user.getAvailableCount());
        if (user.getAvailableCount() < 1) {
            model.addAttribute("Full", "Yes");
        }
        return "add";
    }

    @RequestMapping(value = "/add/addtopics", method = RequestMethod.POST)
    public String toAddTopic(HttpServletRequest request, Model model, @ModelAttribute("addtopic") Topic topic) {
        User user = (User) request.getSession().getAttribute("current_use");
        if (user == null) {
            return "index";
        } else if (topic == null || "".equals(topic.getTopicName().trim()) || "".equals(topic.getDescription().trim())) {
            model.addAttribute("user", user);
            model.addAttribute("message", "Yes");
            return "redirect:/add";
        } else {
            topicService.addTopic(topic);
            if(user.getAvailableCount()>=1){
                user.setAvailableCount(user.getAvailableCount()-1);
                model.addAttribute("message_count",user.getAvailableCount());
                userService.updateAvailableCount(user);
                if (user.getAvailableCount() < 1) {
                    model.addAttribute("Full", "Yes");
                    return "redirect:/main";
                }

            }
            return "redirect:/add";
        }
    }
}
