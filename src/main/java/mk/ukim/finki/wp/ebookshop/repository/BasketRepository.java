package mk.ukim.finki.wp.ebookshop.repository;

import mk.ukim.finki.wp.ebookshop.model.Basket;
import mk.ukim.finki.wp.ebookshop.model.Book;
import mk.ukim.finki.wp.ebookshop.service.BasketService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Long> {


}
