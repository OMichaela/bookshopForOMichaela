package be.omichaela.bookshop.services;


import be.omichaela.bookshop.model.LightHolder;
import be.omichaela.bookshop.repositories.LightHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LightHolderService {

    private LightHolderRepository lightHolderRepository;

    @Autowired
    public LightHolderService(LightHolderRepository lightHolderRepository) {
        this.lightHolderRepository = lightHolderRepository;
    }

    public List<LightHolder> getAllLightHolders(){
        return lightHolderRepository.findAll();
    }

    public LightHolder getLightHolderById(long id){

        return lightHolderRepository.findById(id).get();

    }
}
