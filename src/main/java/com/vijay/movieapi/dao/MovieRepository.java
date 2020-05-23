package com.vijay.movieapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vijay.movieapi.entity.Moviedata;

public interface MovieRepository extends JpaRepository<Moviedata, Integer> {

	@Query("from Moviedata where title like %:title%")
	List<Moviedata> findByTitle(String title);

	@Query("from Moviedata where votes like %:votes%")
	List<Moviedata> findByVotes(String votes);

	@Query("from Moviedata where title like %:title% and votes like %:votes%")
	List<Moviedata> findByBoth(String title, String votes);

	@Query("from Moviedata")
	List<Moviedata> findAll();

}
