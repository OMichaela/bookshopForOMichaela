package be.omichaela.bookshop.services;


import be.omichaela.bookshop.model.LogoBottles;
import be.omichaela.bookshop.repositories.LogoBottlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogoBottlesService {

    private LogoBottlesRepository logoBottlesRepository;

    @Autowired
    public LogoBottlesService(LogoBottlesRepository logoBottlesRepository) {
        this.logoBottlesRepository = logoBottlesRepository;
    }

    public List<LogoBottlesService> getAllLogoBottles(){
        return logoBottlesRepository.findAll();
    }

    public LogoBottles getLogoBottlesById(long id){

        return logoBottlesRepository.findById(id).get();

    }
}
