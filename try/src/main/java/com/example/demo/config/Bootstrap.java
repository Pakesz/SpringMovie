package com.example.demo.config;

import com.example.demo.model.Appointment;
import com.example.demo.model.Movie;
import com.example.demo.model.Projection;
import com.example.demo.model.User;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.ProjectionRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.MovieService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component // konténeres cuc miatt                      többit is megnézni
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> { // feliratozunk a spring lifecicle eseményeire
   private final MovieService movieService; // ide service-k kellenek
   private final AppointmentRepository appointmentRepository;
   private final ProjectionRepository projectionRepository;
   private final UserRepository userRepository;

    public Bootstrap(MovieService movieService, AppointmentRepository appointmentRepository, ProjectionRepository projectionRepository, UserRepository userRepository) {
        this.movieService = movieService;
        this.appointmentRepository = appointmentRepository;
        this.projectionRepository = projectionRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //Movies
        Movie movie = new Movie();
        movie.setId(8);
        movie.setDirector("Proba");
        Movie movie2 = new Movie();
        movie2.setId(8);
        movie2.setDirector("Proba2");
        Movie movie3 = new Movie();
        movie3.setId(8);
        movie3.setDirector("Proba3");


        List<Movie> movies = new ArrayList<>();
        movies.add(movie);
        movies.add(movie2);
        movies.add(movie3);

        movieService.saveAll(movies);

        //Appointments
        Appointment appointment1 = new Appointment();
        appointment1.setId(1);
        appointment1.setClaimedSeats(2);
        appointment1.setProjectionId(1);
        appointment1.setUserId(3);

        Appointment appointment2 = new Appointment();
        appointment2.setId(1);
        appointment2.setClaimedSeats(2);
        appointment2.setProjectionId(1);
        appointment2.setUserId(3);


        List<Appointment> appointments = new ArrayList<>();
        appointments.add(appointment1);
        appointments.add(appointment2);

        appointmentRepository.saveAll(appointments);

        //Projections
        Projection projection1 = new Projection();
        projection1.setId(1);
        projection1.setMovieId(2);
        projection1.setSeats(40);
        projection1.setTime("2019-12-01 16:00:00");

        Projection projection2 = new Projection();
        projection2.setId(2);
        projection2.setMovieId(1);
        projection2.setSeats(25);
        projection2.setTime("2019-12-01 19:30:00");

        List<Projection> list = new ArrayList<>();
        list.add(projection1);
        list.add(projection2);
        projectionRepository.saveAll(list);

        User user1 = new User();
        user1.setName("Tivadar");
        user1.setStatus(1);
        // user1.setId(2);

        User user2 = new User();
        user2.setName("Norbi");
        user2.setStatus(3);

        User user3 = new User();
        user3.setName("István");
        user3.setStatus(2);

        List<User> ulist = new ArrayList<>();
        ulist.add(user1);
        ulist.add(user2);
        ulist.add(user3);
        userRepository.saveAll(ulist);


    }
}
