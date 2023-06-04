package com.rungroup.web2.controller;

import com.rungroup.web2.model.User;
import com.rungroup.web2.service.Impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signup")
    public String signup(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "signup";
    }

    @PostMapping("/signup")
    public String signupSave(User user){
        userService.saveUser(user);
        return "redirect:/login";

    }

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

    @PostMapping("/login")
    public String loginCheck(@RequestParam("email") String email, @RequestParam("password") String password){
       String results = userService.logConfirmation(email,password);

        return results;
    }

    @GetMapping("/school/{sklid}/apply")
    public String userApply(@PathVariable("sklid") long sklid,@RequestParam("userid") long userid, Model model){
        userService.userApply(sklid);
        model.addAttribute("sklid",sklid);
        model.addAttribute("userid",userid);
        return "Final";
    }

    @GetMapping("/Final")
    public String Final(Model model){
        return "Final";
    }

}
