package mk.ukim.finki.wp.ebookshop.web;

import mk.ukim.finki.wp.ebookshop.exceptions.InvalidUsernameOrPasswordException;
import mk.ukim.finki.wp.ebookshop.exceptions.UsernameAlreadyExistsException;
import mk.ukim.finki.wp.ebookshop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.spring5.SpringTemplateEngine;

@Controller
@RequestMapping("/register")
public class registerController {
    private final UserService userService;
    private final SpringTemplateEngine springTemplateEngine;


    public registerController(UserService userService, SpringTemplateEngine springTemplateEngine) {
        this.userService = userService;
        this.springTemplateEngine = springTemplateEngine;
    }

    @GetMapping
    public String getRegisterPage() {
        return "register";
    }


    @PostMapping
    public String register(@RequestParam String username,
                           @RequestParam String password,
                           @RequestParam String email,
                           Model model) {

        try {
            this.userService.register(username, password, email);
            return "redirect:/login";
        } catch (InvalidUsernameOrPasswordException | UsernameAlreadyExistsException exception) {
            return "redirect:/register?error=" + exception.getMessage();
        }


    }
}
