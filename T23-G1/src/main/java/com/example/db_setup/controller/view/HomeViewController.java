package com.example.db_setup.controller.view;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeViewController {

    @GetMapping("/home")
    public ModelAndView showHome(HttpServletRequest request) {
        return new ModelAndView("home");
    }

}
