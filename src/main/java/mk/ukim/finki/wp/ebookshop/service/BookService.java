package mk.ukim.finki.wp.ebookshop.service;

import mk.ukim.finki.wp.ebookshop.model.Book;
import mk.ukim.finki.wp.ebookshop.repository.BookRepository;
import mk.ukim.finki.wp.ebookshop.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository book;

    public BookService(BookRepository book) {
        this.book = book;
    }

    public Object getAllBooks() { return book.findAll();}

}

