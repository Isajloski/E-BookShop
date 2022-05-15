package mk.ukim.finki.wp.ebookshop.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String bookName;
    private String authorName;
    private String img;
    private String synapse;
    private int price;
    private String genre;


    public String getImg(){
        return img;
    }
    public Book() {}
    public Book(String bookName, String authorName, String img, String synapse, int price, String genre) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.img = img;
        this.synapse = synapse;
        this.price = price;
        this.genre = genre;
    }
}
