package be.omichaela.bookshop.services;


import be.omichaela.bookshop.model.Purse;
import be.omichaela.bookshop.repositories.PurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurseService {

    private PurseRepository purseRepository;

    @Autowired
    public PurseService(PurseRepository purseRepository) {
        this.purseRepository = purseRepository;
    }

    public List<Purse> getAllPurses(){
        return purseRepository.findAll();
    }

    public Purse getPurseById(long id){

        return purseRepository.findById(id).get();

    }

}
