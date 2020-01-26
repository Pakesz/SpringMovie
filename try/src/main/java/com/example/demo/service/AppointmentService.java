package com.example.demo.service;

import com.example.demo.model.Appointment;
import com.example.demo.repository.AppointmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public interface AppointmentService {


    List<Appointment> findAll();

   Appointment save(Appointment a);

   List<Appointment> saveall(List<Appointment> list);
}
