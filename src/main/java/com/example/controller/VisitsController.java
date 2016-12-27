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

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Visits> findAllVisits() { return visitRepository.findAll(); }

    @RequestMapping(value = "new",method = RequestMethod.POST)
    public String addNewVisit(@RequestBody Visits visits) {
        Visits visits1 = new Visits();
        visits1.setIdVisit(visits.getIdVisit());
        visits1.setDateVisit(visits.getDateVisit());
        visits1.setIdDoc(visits.getIdDoc());
        visits1.setIdPatient(visits.getIdPatient());
        visitRepository.save(visits);
        return "visits";
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String deleteVisit(@RequestBody Visits visits) {
        Visits visits1 = visitRepository.findOne(visits.getIdVisit());
        visitRepository.delete(visits1);
        return "visits";
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editVisit(@RequestBody Visits visits) {
        Visits visits1 = visitRepository.findOne(visits.getIdVisit());
        visits1.setDateVisit(visits.getDateVisit());
        visits1.setIdDoc(visits.getIdDoc());
        visits1.setIdPatient(visits.getIdPatient());
        visitRepository.save(visits);
        return "visits";
    }

}
