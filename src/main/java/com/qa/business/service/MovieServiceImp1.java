package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.MovieRepository;

public class MovieServiceImp1 implements MovieService {
	@Inject
	private MovieRepository repo;

	public String getAllMovies() {
		return repo.getAllMovies();
	}

	public String addMovie(String movie) {
		if (movie.contains("Titanic")) {
			return "{\"message\": \"titanic is a bad movie\"}";
		}
		return repo.createMovie(movie);
	}

	public String deleteMovie(Long id) {
		return repo.deleteMovie(id);
	}

	public void setRepo(MovieRepository repo) {
		this.repo = repo;
	}

}
