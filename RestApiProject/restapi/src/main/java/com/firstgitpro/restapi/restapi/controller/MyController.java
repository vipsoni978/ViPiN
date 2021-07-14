package com.firstgitpro.restapi.restapi.controller;

import com.firstgitpro.restapi.restapi.entities.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
    
 @Value("${api.key}")   
public String apiKey;

@Autowired
RestTemplate restTemplate;

@GetMapping("/getmovie/{movieid}")
public Movie getMoviebyid(@PathVariable("movieid") String movieid) {

    
 Movie movie = restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+ movieid +"?api_key="+apiKey , Movie.class);  
    
 movie.setMovieid(movieid);
  return movie;
} 




}
