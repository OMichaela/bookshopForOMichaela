package be.omichaela.bookshop.services;

import be.omichaela.bookshop.model.BellSet;
import be.omichaela.bookshop.repositories.BellSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BellSetService {

    private BellSetRepository bellSetRepository;

    @Autowired
    public BellSetService(BellSetRepository bellSetRepository) {
        this.bellSet = bellSetRepository;
    }

    public List<BellSet> getAllBellSets(){
        return bellSetRepository.findAll();
    }

    public Book getBellSetById(long id){

        return bellSetRepository.findById(id).get();

    }
}
