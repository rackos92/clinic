package com.example.controller;

import com.example.entity.Specialization;
import com.example.repository.SpecializationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController(value = "specialization")
public class SpecializationController {

    private SpecializationRepository specializationRepository;

    @Autowired
    public SpecializationController(SpecializationRepository specializationRepository) { this.specializationRepository = specializationRepository; }

    @RequestMapping(method = RequestMethod.GET)
    public List<Specialization> findAllSpecialization() { return specializationRepository.findAll(); }

    @RequestMapping(value ="/specialization", method = RequestMethod.POST)
    public void addNewSpecialization(@RequestBody Specialization specialization) {
        Specialization specialization1 = new Specialization();
        specialization1.setIdSpec(specialization.getIdSpec());
        specialization1.setName(specialization.getName());
        specialization1.setDescription(specialization.getDescription());
        specializationRepository.save(specialization1);
    }

    @RequestMapping(value ="/delete", method = RequestMethod.DELETE)
    public void deleteSpecialization(@RequestBody Specialization specialization) {
        Specialization specialization1 = new Specialization();
        specialization1.setIdSpec(specialization.getIdSpec());
        specialization1.setName(specialization.getName());
        specialization1.setDescription(specialization.getDescription());
        specializationRepository.delete(specialization1);
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public void editSpecialization(@RequestBody Specialization specialization) {
        Specialization specialization1 = specialization;
        specialization1.setName(specialization.getName());
        specialization1.setDescription(specialization.getDescription());
        specializationRepository.save(specialization1);
    }
}
