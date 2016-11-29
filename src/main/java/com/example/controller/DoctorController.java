package com.example.controller;

import com.example.entity.Doctor;
import com.example.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "doctor")
public class DoctorController {
    private DoctorRepository doctorRepository;

    @Autowired
    public DoctorController(DoctorRepository doctorRepository) { this.doctorRepository = doctorRepository; }

    @RequestMapping(method = RequestMethod.GET)
    public List<Doctor> findAllDoctor() { return doctorRepository.findAll(); }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewDoctor(@RequestBody Doctor doctor) {
        Doctor doctor1 = new Doctor();
        doctor1.setId(doctor.getId());
        doctor1.setName(doctor.getName());
        doctor1.setLastName(doctor.getLastName());
        doctor1.setIdSpec(doctor.getIdSpec());
        doctor1.setLogin(doctor.getLogin());

    }
}
