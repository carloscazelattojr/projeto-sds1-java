package br.com.carlosjunior.dspesquisa.dto;

import java.io.Serializable;
import java.time.Instant;

import br.com.carlosjunior.dspesquisa.entities.Record;
import br.com.carlosjunior.dspesquisa.entities.enums.Platform;

public class RecordDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Instant moment;
	private String name;
	private Integer age;
	private String gameTitle;
	private Platform platform;
	private String genreTitle;

	public RecordDTO() {

	}

	public RecordDTO(Record entity) {
		id = entity.getId();
		moment = entity.getMoment();
		name = entity.getName();
		age = entity.getAge();
		gameTitle = entity.getGame().getTitle();
		platform = entity.getGame().getPlatform();
		genreTitle = entity.getGame().getGenre().getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public String getGenreTitle() {
		return genreTitle;
	}

	public void setGenreTitle(String genreTitle) {
		this.genreTitle = genreTitle;
	}

}
