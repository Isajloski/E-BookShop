package mk.ukim.finki.wp.ebookshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class EBookShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(EBookShopApplication.class, args);
    }

}
