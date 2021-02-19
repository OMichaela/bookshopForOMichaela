package be.omichaela.bookshop.services;

import be.omichaela.bookshop.model.PerpetualCalendar;
import be.omichaela.bookshop.repositories.PerpetualCalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerpetualCalendarService {

    private PerpetualCalendarRepository perpetualCalendarRepository;

    @Autowired
    public PerpetualCalendarService(PerpetualCalendarRepository perpetualCalendarRepository) {
        this.perpetualCalendarRepository = perpetualCalendarRepository;
    }

    public List<PerpetualCalendar> getAllPerpetualCalendars(){
        return perpetualCalendarRepository.findAll();
    }

    public PerpetualCalendar getPerpetualCalendarById(long id){

        return perpetualCalendarRepository.findById(id).get();

    }
}
