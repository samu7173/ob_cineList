package com.example.ob_cineList.controller;

import com.example.ob_cineList.entities.Movies;
import com.example.ob_cineList.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {
    //atributos
    private MovieRepository repository;
    private final Logger log = LoggerFactory.getLogger(MovieController.class);

    public MovieController(MovieRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/movies")
    public List<Movies> findAll(){

        return repository.findAll();
    }

}
