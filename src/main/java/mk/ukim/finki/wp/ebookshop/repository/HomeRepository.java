package mk.ukim.finki.wp.ebookshop.repository;

import mk.ukim.finki.wp.ebookshop.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeRepository extends JpaRepository<Book,Long> {
    @Override
    List<Book> saveAll(Iterable entities);
}
