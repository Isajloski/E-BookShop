package mk.ukim.finki.wp.ebookshop.service;

import mk.ukim.finki.wp.ebookshop.model.Book;
import mk.ukim.finki.wp.ebookshop.repository.HomeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {
    private final HomeRepository home;

    public HomeService(HomeRepository home) {
        this.home = home;
    }


    //(String bookName, String authorName, String img, String synapse, int price, String genre)
    public Object getAllBooks() {
        /*
        List<Book> books = new ArrayList<Book>() ;
        books.add(new Book("Anna Karenina", "Leo Tolstoy","books/1.jpg", "The story centers on an extramarital affair between Anna and dashing cavalry officer Count Alexei Kirillovich Vronsky that scandalizes the social circles of Saint Petersburg and forces the young lovers to flee to Italy in a search for happiness.", 30, "Novel"));
        books.add(new Book("Crime and Punishment", "Fyodor Dostoevsky","books/2.png", "Crime and Punishment follows the mental anguish and moral dilemmas of Rodion Raskolnikov, an impoverished ex-student in Saint Petersburg who plans to kill an unscrupulous pawnbroker, an old woman who stores money and valuable objects in her flat.", 25, "Novel,Psychological"));
        books.add(new Book("Don Quixote", "Miguel de Cervantes","books/3.png", "Don Quixote is a book by Miguel de Cervantes. It focuses on Alonso, who calls himself Don Quixote of La Manch. He intends to lead the life of a hero. He has the determination to defeat evil and protect the weak.", 20, "Novel,Satire,Humor"));
        books.add(new Book("Dune", "Frank Herbert","books/4.jpg", "The story of Dune focuses on the journey of protagonist Paul Atreide, who, along with his family, is in pursuit of conquering a planet named Arrakis. The desert planet is valuable in containing a rare spice named melange.", 20, "Science fiction,Sci-fi"));
        books.add(new Book("Gone Girl", "Gillian Flynn","books/5.jpg", "former New York-based writer Nick Dunne and his glamorous wife Amy present a portrait of a blissful marriage to the public. However, when Amy goes missing on the couple's fifth wedding anniversary, Nick becomes the prime suspect in her disappearance.", 15, "Novel,Thriller,Mystery"));
        books.add(new Book("Hamlet", "William Shakespeare","books/6.jpg", "The ghost of the King of Denmark tells his son Hamlet to avenge his murder by killing the new king, Hamlet's uncle. Hamlet feigns madness, contemplates life and death, and seeks revenge.", 12, "Tragedy,Drama"));
        books.add(new Book("Jane Eyre", "Charlotte Brontë","books/7.jpg", "The novel follows the story of Jane, a seemingly plain and simple girl as she battles through life's struggles. Jane has many obstacles in her life - her cruel and abusive Aunt Reed, the grim conditions at Lowood school.", 25, "Novel"));
        books.add(new Book("Macbeth", "William Shakespeare","books/8.jpg", "Three witches tell the Scottish general Macbeth that he will be King of Scotland", 12, "Tragedy,Drama"));
        books.add(new Book("Pride and Prejudice", "Jane Austen","books/9.jpg", "Pride and Prejudice follows the turbulent relationship between Elizabeth Bennet, the daughter of a country gentleman, and Fitzwilliam Darcy, a rich aristocratic landowner.", 25, "Romance,Satire,Novel"));
        books.add(new Book("Snow Crash ", "Neal Stephenson","books/10.jpg", "Plunging headlong into the enigma of a new computer virus that's striking down hackers everywhere, he races along the neon-lit streets on a search-and-destroy mission for the shadowy virtual villain threatening to bring about infocalypse.", 20, "Science fiction,Novel,Sci-fi"));
        books.add(new Book("The Brothers Karamazov", "Fyodor Dostoevsky","books/11.jpg", "The Brothers Karamazov is a novel with a simple plot about a murder and a complex discussion of faith, doubt, and morality.", 30, "Novel"));
        books.add(new Book("The Hobbit", "J. R. R. Tolkien","books/12.jpg", "The Hobbit is set within Tolkien's fictional universe and follows the quest of home-loving Bilbo Baggins, the titular hobbit, to win a share of the treasure guarded by a dragon.", 20, "Fantasy,Novel"));
        books.add(new Book("The Martian Chronicles", "Ray Bradbury","books/13.jpg", "The Martian Chronicles is a science fiction fix-up novel, published in 1950, that chronicles the exploration and settlement of Mars, the home of indigenous Martians, by Americans leaving a troubled Earth that is eventually devastated by nuclear war.", 15, "Science fiction,Sci-fi"));
        books.add(new Book("Thus Spoke Zarathustra", "Friedrich Nietzsche","books/14.jpg", "It describes how the ancient Persian prophet Zarathustra descends from his solitude in the mountains to tell the world that God is dead and that the Superman, the human embodiment of divinity, is his successor.", 20, "Philosophy,Novel"));
        books.add(new Book("The Stranger", "Albert Camus	","books/15.jpg", "A shipping clerk living in French Algiers in the 1940s, Meursault is a young, detached but ordinary man. The novel begins with Meursault receiving a telegram informing him of his mother's death.", 15, "Novel,Philosophy"));
        //books.add(new Book("", "","", "", 30, ""));
        //books.add(new Book("", "","", "", 30, ""));

        home.saveAll(books);
        */
        return home.findAll();

    }
}
