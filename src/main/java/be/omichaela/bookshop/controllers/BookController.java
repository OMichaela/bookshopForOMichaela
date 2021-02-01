package be.omichaela.bookshop.controllers;

import be.omichaela.bookshop.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @GetMapping("/books")
    public String greeting(  Model model) {
        Book book = new Book("Lord of the rings");
        model.addAttribute("book",book );
        return "books";
    }


}
