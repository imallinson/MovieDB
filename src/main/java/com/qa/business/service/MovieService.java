package com.qa.business.service;

public interface MovieService {
	
	String getAllMovies();
	String addMovie(String account);
	String deleteMovie(Long id);
	
}
