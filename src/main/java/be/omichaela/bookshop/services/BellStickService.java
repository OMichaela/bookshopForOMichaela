package be.omichaela.bookshop.services;

import be.omichaela.bookshop.model.BellStick;
import be.omichaela.bookshop.repositories.BellStickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BellStickService {

    private BellStickRepository bellStickRepository;

    @Autowired
    public BellStickService(BellStickRepository bellStickRepository) {
        this.bellStickRepository = bellStickRepository;
    }

    public List<BellStick> getAllBellSticks(){
        return bellStickRepository.findAll();
    }

    public BellStick getBellStickById(long id){

        return bellStickRepository.findById(id).get();

    }

}
