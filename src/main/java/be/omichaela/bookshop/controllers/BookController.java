package be.omichaela.bookshop.controllers;

import be.omichaela.bookshop.model.Book;
import be.omichaela.bookshop.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @Autowired
    private BookService service;


    @GetMapping("/book")
    public String greeting(  Model model) {
        Book book = service.getBookById(1L);
        model.addAttribute("book",book );
        return "books";
    }


}
