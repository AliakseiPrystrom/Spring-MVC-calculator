package by.tms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SignUpController {

    @GetMapping
    public String signup(){
        return "signup";
    }
}
