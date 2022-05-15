package mk.ukim.finki.wp.ebookshop.web;

import mk.ukim.finki.wp.ebookshop.service.BasketService;
import mk.ukim.finki.wp.ebookshop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/basket")
public class basketController{
    private final BasketService basketService;
    private final UserService userService;

    public basketController(BasketService basketService, UserService userService) {
        this.basketService = basketService;
        this.userService = userService;
    }

    @GetMapping
    public String buy(Model model){
        //model.addAttribute("books", basketService.getAllBooks());
        return "basket";
    }

    @PostMapping(path = "{id}")
    public void x(@PathVariable Long id){


    }


}
