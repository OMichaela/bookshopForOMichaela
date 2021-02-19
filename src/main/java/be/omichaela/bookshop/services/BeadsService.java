package be.omichaela.bookshop.services;

import be.omichaela.bookshop.model.Beads;
import be.omichaela.bookshop.repositories.BeadsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeadsService {

    private BeadsRepository beadsRepository;

    @Autowired
    public BeadsService(BeadsRepository beadsRepository) {
        this.beadsRepository = beadsRepository;
    }

    public List<Beads> getAllBeads(){
        return beadsRepository.findAll();
    }

    public Book getBeadsById(long id){

        return beadsRepository.findById(id).get();

    }
}
