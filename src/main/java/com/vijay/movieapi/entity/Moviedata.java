package com.vijay.movieapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moviedata")
public class Moviedata {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "title")
	private String title;

	@Column(name = "genre")
	private String genre;

	@Column(name = "description")
	private String description;

	@Column(name = "director")
	private String director;

	@Column(name = "actors")
	private String actors;

	@Column(name = "minutes")
	private String minutes;

	@Column(name = "votes")
	private String votes;

	@Column(name = "revenue")
	private String revenue;

	@Column(name = "metascore")
	private String metascore;

	public Moviedata() {

	}

	public Moviedata(int id, String title, String genre, String description, String director, String actors, String minutes,
			String votes, String revenue, String metascore) {
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.description = description;
		this.director = director;
		this.actors = actors;
		this.minutes = minutes;
		this.votes = votes;
		this.revenue = revenue;
		this.metascore = metascore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getMinutes() {
		return minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	public String getVotes() {
		return votes;
	}

	public void setVotes(String votes) {
		this.votes = votes;
	}

	public String getRevenue() {
		return revenue;
	}

	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}

	public String getMetascore() {
		return metascore;
	}

	public void setMetascore(String metascore) {
		this.metascore = metascore;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", genre=" + genre + ", description=" + description
				+ ", director=" + director + ", actors=" + actors + ", minutes=" + minutes + ", votes=" + votes
				+ ", revenue=" + revenue + ", metascore=" + metascore + "]";
	}

}
