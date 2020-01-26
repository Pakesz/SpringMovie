package com.example.demo.service;

import com.example.demo.model.Projection;
import com.example.demo.repository.ProjectionRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class ProjectionServiceImpl implements ProjectionService{
    private final ProjectionRepository projectionRepository;

    public ProjectionServiceImpl(ProjectionRepository projectionRepository) {
        this.projectionRepository = projectionRepository;
    }

    public List<Projection> findAll(){
        return projectionRepository.findAll();
    }

    public Projection save(Projection p){
        return projectionRepository.save(p);
    }

    public List<Projection> saveall(List<Projection> list){
        return projectionRepository.saveAll(list);
    }
}
