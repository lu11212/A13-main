package com.example.db_setup.controller.view;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AuthViewController {

    @GetMapping("/register")
    public ModelAndView showRegisterUser() {
        return new ModelAndView("register_user");
    }

    @GetMapping("/register/success")
    public ModelAndView showRegistrationSuccess() {
        return new ModelAndView("registration_success");
    }

    @GetMapping("/login")
    public ModelAndView showLoginUser() {
        return new ModelAndView("login_user");
    }

    @GetMapping("/reset_password")
    public ModelAndView showResetPasswordUser() {
        return new ModelAndView("reset_password_user");
    }

    @GetMapping("/change_password")
    public ModelAndView showChangePasswordUser() {
        return new ModelAndView("change_password_user");
    }

    @GetMapping("/admin/login")
    public ModelAndView showLoginAdmin() {
        return new ModelAndView("login_admin");
    }

    @GetMapping("/admin/register")
    public ModelAndView showRegisterAdmin() {
        return new ModelAndView("register_admin");
    }

    @GetMapping("/admin/reset_password")
    public ModelAndView showResetPasswordAdmin() {
        return new ModelAndView("reset_password_admin");
    }

    @GetMapping("/admin/change_password")
    public ModelAndView showPasswordChangeAdmin() {
        return new ModelAndView("change_password_admin");
    }
}
