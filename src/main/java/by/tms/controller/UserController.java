package by.tms.controller;

import by.tms.dto.UserDTO;
import by.tms.entity.User;
import by.tms.service.UserService;
import by.tms.util.CheckUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/reg")
    public String reg(Model model) {
        model.addAttribute("newUser", new User());
        return "reg";
    }

    @PostMapping("/reg")
    public String reg(@Valid @ModelAttribute("newUser") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "reg";
        } else {
            userService.save(user);
            return "redirect:/";
        }

    }

    @GetMapping("/auth")
    public String auth(Model model) {
        model.addAttribute("authUser", new User());
        return "auth";
    }

    @PostMapping("/auth")
    public String auth(@Valid @ModelAttribute("authUser")UserDTO user, BindingResult bindingResult, Model model, HttpSession httpSession) {
        if (bindingResult.hasErrors()) {
            return "auth";
        } else {
            return CheckUser.checkUser(user, model, httpSession, userService);
        }


    }
}
