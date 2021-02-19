package be.omichaela.bookshop.services;

import be.omichaela.bookshop.model.WaterCup;
import be.omichaela.bookshop.repositories.WaterCupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterCupService {

    private WaterCupRepository waterCupRepository;

    @Autowired
    public WaterCupService(WaterCupRepository waterCupRepository) {
        this.waterCupRepository = waterCupRepository;
    }

    public List<WaterCup> getAllWaterCups(){
        return waterCupRepository.findAll();
    }

    public WaterCup getWaterCupById(long id){

        return waterCupRepository.findById(id).get();

    }
}
