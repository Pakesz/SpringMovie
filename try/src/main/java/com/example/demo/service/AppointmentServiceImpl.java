package com.example.demo.service;

import com.example.demo.model.Appointment;
import com.example.demo.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class AppointmentServiceImpl implements AppointmentService{
    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }


    public List<Appointment> findAll(){
        return appointmentRepository.findAll();
    }

    public Appointment save(Appointment a){
        return appointmentRepository.save(a);
    }

    public List<Appointment> saveall(List<Appointment> list){
        return appointmentRepository.saveAll(list);
    }
}
