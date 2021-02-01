package be.omichaela.bookshop;

import be.omichaela.bookshop.model.Book;
import be.omichaela.bookshop.repositories.BookRepository;
import be.omichaela.bookshop.services.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BookshopApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BookshopApplication.class, args);
        BookRepository bookRepository = context.getBean(BookRepository.class);

        bookRepository.save(new Book(1L,"alice in wonderland"));

    }

}
