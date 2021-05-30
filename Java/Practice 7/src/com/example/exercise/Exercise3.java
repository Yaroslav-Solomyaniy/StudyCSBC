package com.example.exercise;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.domain.Director;
import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

/**
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public class Exercise3 {

    public static void main(String[] args) {
        // Find the number of movies of each director
        MovieService movieService = InMemoryMovieService.getInstance();
        Collection<Movie> movies = movieService.findAllMovies();
        Map<String, Long> directorMovieCounts =
                movies.stream()
                        .map(Movie::getDirectors)
                        .flatMap(List::stream)
                        .collect(Collectors.groupingBy(Director::getName, Collectors.counting()));
        directorMovieCounts.entrySet().forEach(System.out::println);
        printTimeStamp();
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }
}
