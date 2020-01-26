package com.example.demo.service;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public interface MovieService {


     List<Movie> findAll() ;

     Movie save(Movie m) ;

    List<Movie> saveAll(List<Movie> list);
}
