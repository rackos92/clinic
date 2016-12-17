package com.example.controller;

import com.example.entity.Specialization;
import com.example.repository.SpecializationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController(value = "specializations")
public class SpecializationController {

    private SpecializationRepository specializationRepository;

    @Autowired
    public SpecializationController(SpecializationRepository specializationRepository) { this.specializationRepository = specializationRepository; }

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public List<Specialization> findAllSpecialization() { return specializationRepository.findAll(); }

    @RequestMapping(value ="/new", method = RequestMethod.POST)
    public String addNewSpecialization(@RequestBody Specialization specialization) {
        Specialization specialization1 = new Specialization();
        specialization1.setIdSpec(specialization.getIdSpec());
        specialization1.setName(specialization.getName());
        specialization1.setDescription(specialization.getDescription());
        specializationRepository.save(specialization1);
        return "specializations";
    }

    @RequestMapping(value ="/delete/{id}", method = RequestMethod.DELETE)
    public String deleteSpecialization(@RequestBody Specialization specialization) {
        Specialization specialization1 = specializationRepository.findOne(specialization.getIdSpec());
        specializationRepository.delete(specialization1);
        return "specializations";
    }
    @RequestMapping(value = "/value/{id}", method = RequestMethod.POST)
    public String editSpecialization(@RequestBody Specialization specialization) {
        Specialization specialization1 = specializationRepository.findOne(specialization.getIdSpec());
        specialization1.setName(specialization.getName());
        specialization1.setDescription(specialization.getDescription());
        specializationRepository.save(specialization1);
        return "specializations";
    }


}

