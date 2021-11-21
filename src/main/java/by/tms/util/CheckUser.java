package by.tms.util;

import by.tms.dto.UserDTO;
import by.tms.entity.User;
import by.tms.service.UserService;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

public class CheckUser {
    public static String checkUser(UserDTO user, Model model, HttpSession httpSession, UserService userService) {
        User byUserName = userService.findByUserName(user.getUsername());
        if (byUserName != null) {
            if (byUserName.getPassword().equals(user.getPassword())) {
                httpSession.setAttribute("user", byUserName);
                return "redirect:/home";
            } else {
                model.addAttribute("message", "Wrong password");
            }

        } else {
            model.addAttribute("message", "User not found!");
        }

        return "auth";

    }
}
