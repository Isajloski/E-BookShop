package mk.ukim.finki.wp.ebookshop.web;

import mk.ukim.finki.wp.ebookshop.exceptions.InvalidUsernameOrPasswordException;
import mk.ukim.finki.wp.ebookshop.model.User;
import mk.ukim.finki.wp.ebookshop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
@RequestMapping("/login")
public class loginController {
    private final UserService userService;

    public loginController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public String sucessfulLogIn(Model model){
        return "login";
    }

    @PostMapping
    public String login(
           @RequestParam String username,
           @RequestParam String password,
           HttpServletRequest request,
           Model model) {
        User user;
            user = this.userService.loginUser(username, password);
            model.addAttribute("user",user);
            if (user != null) {
                request.getSession().setAttribute("user", user);
                return "redirect:/books";
            }
            else {
                return "login";
            }

    }
}

