package mk.ukim.finki.wp.ebookshop.web;

import mk.ukim.finki.wp.ebookshop.model.User;

import mk.ukim.finki.wp.ebookshop.service.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/","/books","/home"})
public class homeController {
    private  final HomeService books;


    public homeController(HomeService books) {
        this.books = books;
    }

    @GetMapping
    public String getStore(Model model){
        User user = (User) model.getAttribute("user");
            model.addAttribute("books", books.getAllBooks());

        return "main";
    }

    @PostMapping
    public String postStore(Model model){
        model.addAttribute("books", books.getAllBooks());
        return "redirect:/books";
    }
}

/*
@WebServlet(urlPatterns = "/books",name = "The Book Shop")
public class homeController extends HttpServlet {
    private  final BookService books;
    private  final SpringTemplateEngine springTemplateEngine;

    public homeController(BookService books, SpringTemplateEngine springTemplateEngine) {
        this.books = books;
        this.springTemplateEngine = springTemplateEngine;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebContext context = new WebContext(req, resp,req.getServletContext());
        context.setVariable("books", books.listbooks());
        context.setVariable("len", books.listbooks().size());
        this.springTemplateEngine.process("main.html", context,resp.getWriter());
    }
}
*/