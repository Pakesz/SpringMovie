package com.example.demo.service;

import com.example.demo.model.Projection;
import com.example.demo.repository.ProjectionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public interface ProjectionService {


    List<Projection> findAll();

    Projection save(Projection p);

    List<Projection> saveall(List<Projection> list);
}
