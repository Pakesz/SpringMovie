package com.example.demo.controller;

import com.example.demo.model.Appointment;
import com.example.demo.service.AppointmentServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {
    public final AppointmentServiceImpl appointmentService;

    public AppointmentController(AppointmentServiceImpl appointmentService) {
        this.appointmentService = appointmentService;
    }


    @GetMapping(value="/appointments")
    public List<Appointment> findAll() {
        return appointmentService.findAll();
    }
}
