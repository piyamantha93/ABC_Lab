package com.abc_lab_system;

import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AbcLabSystemController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to ABC Laboratories Appointment System");
        return "index";
    }
}