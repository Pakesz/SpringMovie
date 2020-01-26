package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
public class MovieController {
    private final MovieServiceImpl movieService ;

    public MovieController(MovieServiceImpl movieService) {
        this.movieService = movieService;
    }


    // elérés                       get( default)               String a value vég miatt (default)
    //@RequestMapping(value = "/movies",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "/movies") //ugyan az mint fent. van postmapping stb
    public List<Movie> movie(){
        return movieService.findAll();

        /*
        Movie movie = new Movie();
        movie.setId(8);
        movie.setDirector("Proba");
        return movie;
*/
    }


}
