package com.oracle.emqa.controller;

import com.oracle.emqa.model.User;
import com.oracle.emqa.service.TopicService;
import com.oracle.emqa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Dony on 10/27/2014.
 */
@Controller

public class VoteController {

    private TopicService topicService;
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setTopicService(TopicService topicService) {
        this.topicService = topicService;
    }

    @RequestMapping(value = {"/main"}, method = RequestMethod.GET)
    public String topicList(HttpServletRequest request, Model model) {
        User user = (User) request.getSession().getAttribute("current_use");
        if (user == null) {
            return "redirect:/index";
        } else if (user != null && user.getIsVoted().booleanValue()) {
            model.addAttribute("message", "You have completed the vote!!");
            model.addAttribute("disabledFlag", true);
            model.addAttribute("topicsList", topicService.listTopics(user.getVotedTopics()));
        } else {
            model.addAttribute("topicsList", topicService.listTopics());
        }
        return "main";
    }


    @RequestMapping(value = "/main/vote", method = RequestMethod.POST)
    public String voteTopics(HttpServletRequest request, Model model, @RequestParam(value = "selectedTopics") String selectedTopics) {
        User user = (User) request.getSession().getAttribute("current_use");
        if (user == null) {
            return "index";
        }
        if (!userService.queryUser(user).getIsVoted().booleanValue()) {
            if (selectedTopics.split(",").length > 6) {
                model.addAttribute("message", "You only can select three topics for this vote!!!!");
                model.addAttribute("topicsList", topicService.listTopics());
            } else {
                model.addAttribute("message", "Thanks for you voting! You have selected following topic!");
                model.addAttribute("disabledFlag", true);
                topicService.updateTopicsVote(selectedTopics);
                model.addAttribute("topicsList", topicService.listTopics(selectedTopics));
                user.setIsVoted(true);
                user.setVotedTopics(selectedTopics);
                userService.updateVoteStatus(user);
            }
        } else {
            model.addAttribute("message", "You have completed the vote!!");
            model.addAttribute("disabledFlag", true);
            model.addAttribute("topicsList", topicService.listTopics(user.getVotedTopics()));
        }

        return "redirect:/main";
    }

    @RequestMapping(value = {"/result"}, method = RequestMethod.GET)
    public String result(Model model) {
        model.addAttribute("voteResultList", topicService.getVoteResult(false));
        return "result";
    }

    @RequestMapping(value = {"/sort"}, method = RequestMethod.GET)
    public String sort (Model model) {
        model.addAttribute("voteResultList", topicService.getVoteResult(true));
        return "result";
    }
}
