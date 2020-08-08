package org.launchcode.spaday.controllers;

import org.launchcode.spaday.data.UserData;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        if (!user.getPassword().equals(verify)) {
            model.addAttribute("message", "Passwords do not match.");
            model.addAttribute("user", user);
            return "user/add";
        }
        UserData.addUser(user);
        model.addAttribute("users", UserData.getAll());
        return "user/index";
    }

    @GetMapping("add")
    public String displayAddUserForm() {
        return "user/add";
    }

    @GetMapping("detail")
    public String displayUserDetails(@RequestParam int id, Model model) {
        model.addAttribute("user", UserData.getUserById(id));
        return "user/detail";
    }

}
