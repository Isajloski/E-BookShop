package mk.ukim.finki.wp.ebookshop.service;

import mk.ukim.finki.wp.ebookshop.model.Book;
import mk.ukim.finki.wp.ebookshop.repository.BasketRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasketService {
    private final BasketRepository basketRepository;

    public BasketService(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    public Object getAllBooks() {
       return basketRepository;
    }

    public void save(BookService book) {
    }


}
