package be.omichaela.bookshop.services;

import be.omichaela.bookshop.model.IncenseHolder;
import be.omichaela.bookshop.repositories.IncenseHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncenseHolderService {

    private IncenseHolderRepository incenseHolderRepository;

    @Autowired
    public IncenseHolderService(IncenseHolderRepository incenseHolderRepository) {
        this.incenseHolderRepository = incenseHolderRepository;
    }

    public List<IncenseHolder> getAllIncenseHolders(){
        return incenseHolderRepository.findAll();
    }

    public Book getIncenseHolderById(long id){

        return incenseHolderRepository.findById(id).get();

    }
}
