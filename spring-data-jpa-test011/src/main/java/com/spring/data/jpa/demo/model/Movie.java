package com.spring.data.jpa.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="year_of_release")
	private int yearOfRelease;
	
	@ManyToOne
	Genre genreId;
	
	@ManyToMany(mappedBy = "movies")
  	private List<Actor> actors = new ArrayList<>();

	public Movie() {
		super();
	}

	public Movie(long id, String title, int yearOfRelease, Genre genreId) {
		this.id = id;
		this.title = title;
		this.yearOfRelease = yearOfRelease;
		this.genreId = genreId;
	}
	
	public Movie(String title, int yearOfRelease, Genre genreId) {
		this.title = title;
		this.yearOfRelease = yearOfRelease;
		this.genreId = genreId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public Genre getGenreId() {
		return genreId;
	}

	public void setGenreId(Genre genreId) {
		this.genreId = genreId;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", yearOfRelease=" + yearOfRelease + ", genreId=" + genreId
				+ "]";
	}
	
}
