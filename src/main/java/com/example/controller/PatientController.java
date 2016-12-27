package com.example.controller;


import com.example.entity.Patient;
import com.example.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "patient")
public class PatientController {

    private PatientRepository patientRepository;

    @Autowired
    public PatientController(PatientRepository patientRepository) { this.patientRepository = patientRepository; }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Patient> findAllPatient() {return  patientRepository.findAll(); }

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public String addNewPatient(@RequestBody Patient patient) {
        Patient patient1 = new Patient();
        patient1.setIdpatient(patient.getIdpatient());
        patient1.setIdUser(patient.getIdUsers());
        patient1.setPesel(patient.getPesel());
        patient1.setName(patient.getName());
        patient1.setLastName(patient.getLastName());
        patient1.setDateOfBirth(patient.getDateOfBirth());
        patient1.setApartmentNr(patient.getApartmentNr());
        patient1.setStreet(patient.getStreet());
        patient1.setCity(patient.getCity());
        patient1.setPostalCode(patient.getPostalCode());
        patient1.setPhoneContact(patient.getPhoneContact());
        return "patient";
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String deletePatient(@RequestBody Patient patient) {
        Patient patient1 = patientRepository.findOne(patient.getIduser());
        patientRepository.delete(patient1);
        return "patient";
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editPatient(@RequestBody Patient patient) {
        Patient patient1 = patientRepository.findOne(patient.getIduser());
        //patient1.setName(patient.getName());
        patient1.setLastName(patient.getLastName());
        //patient1.setDateOfBirth(patient.getDateOfBirth());
        patient1.setApartmentNr(patient.getApartmentNr());
        patient1.setStreet(patient.getStreet());
        patient1.setCity(patient.getCity());
        patient1.setPostalCode(patient.getPostalCode());
        patient1.setPhoneContact(patient.getPhoneContact());
        return "patient";
    }
}
