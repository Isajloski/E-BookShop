package mk.ukim.finki.wp.ebookshop.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Basket {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime dateCreated;

    @OneToOne
    private User username;

    @OneToMany
    private List<Book> books;

    public Basket() {

    }

}
