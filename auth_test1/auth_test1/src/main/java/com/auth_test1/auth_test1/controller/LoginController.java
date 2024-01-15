package com.auth_test1.auth_test1.controller;

import com.auth_test1.auth_test1.Entity.UserEntity;
import com.auth_test1.auth_test1.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        UserEntity user = userService.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            if ("admin".equals(user.getRole())) {
                return "redirect:/admin/dashboard";
            } else {
                return "redirect:/user/dashboard";
            }
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}
