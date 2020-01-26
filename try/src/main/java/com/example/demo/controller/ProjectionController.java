package com.example.demo.controller;

import com.example.demo.model.Projection;
import com.example.demo.service.ProjectionServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectionController {
    public final ProjectionServiceImpl projectionService;

    public ProjectionController(ProjectionServiceImpl projectionService) {
        this.projectionService = projectionService;
    }

//

    @GetMapping(value= "/projections")
    public List<Projection> findAll(){
        return projectionService.findAll();
    }
}
