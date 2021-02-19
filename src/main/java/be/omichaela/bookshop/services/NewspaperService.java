package be.omichaela.bookshop.services;


import be.omichaela.bookshop.model.Newspaper;
import be.omichaela.bookshop.repositories.NewspaperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewspaperService {

    private NewspaperRepository newspaperRepository;

    @Autowired
    public NewspaperService(NewspaperRepository newspaperRepository) {
        this.newspaperRepository = newspaperRepository;
    }

    public List<Newspaper> getAllNewspapers(){
        return newspaperRepository.findAll();
    }

    public Newspaper getNewspaperById(long id){

        return newspaperRepository.findById(id).get();

    }
}
