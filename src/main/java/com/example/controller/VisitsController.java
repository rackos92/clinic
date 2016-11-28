package com.example.controller;

import com.example.entity.Visits;
import com.example.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "visits")
public class VisitsController {

    private VisitRepository visitRepository;

    @Autowired
    public VisitsController(VisitRepository visitRepository) {this.visitRepository = visitRepository; }

    @RequestMapping(method = RequestMethod.GET)
    public List<Visits> findAllVisits() { return visitRepository.findAll(); }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewVisit(@RequestBody Visits visits) {
        Visits visits1 = new Visits();
        visits1.setDateVisit(visits.getDateVisit());
        visits1.setIdDoc(visits.getIdDoc());
        visits1.setPeselPatient(visits.getPeselPatient());
        visitRepository.save(visits1);
    }

}
