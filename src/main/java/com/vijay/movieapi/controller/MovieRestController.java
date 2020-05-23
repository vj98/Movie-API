package com.vijay.movieapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.movieapi.dao.MovieRepository;
import com.vijay.movieapi.entity.Moviedata;

@RestController
@RequestMapping("/api")
public class MovieRestController {

	public MovieRepository movieRepository;

	public MovieRestController(MovieRepository theMovieRepository) {
		movieRepository = theMovieRepository;
	}

	@GetMapping("/movie")
	public List<Moviedata> findAll(@RequestParam(name = "title", required = false) String title,
			@RequestParam(name = "votes", required = false) String votes) {

		if (title != null && votes != null) {
			return movieRepository.findByBoth(title, votes);
		}

		if (title != null) {
			return movieRepository.findByTitle(title);
		}

		if (votes != null) {
			return movieRepository.findByVotes(votes);
		}

		return movieRepository.findAll();
	}
}
