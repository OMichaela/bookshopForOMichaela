package be.omichaela.bookshop.services;


import be.omichaela.bookshop.model.Incense;
import be.omichaela.bookshop.repositories.IncenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncenseService {

    private IncenseRepository incenseRepository;

    @Autowired
    public IncenseService(IncenseRepository incenseRepository) {
        this.incenseRepository = incenseRepository;
    }

    public List<Incense> getAllIncenses(){
        return incenseRepository.findAll();
    }

    public Incense getIncenseById(long id){

        return incenseRepository.findById(id).get();

    }
}
