package com.wildcodeschool.sea.bonn.whereismyband.entity;

public class Instrument {
	
	// database id
	private Long id;
	private String name;

	public Instrument(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instrument [id=" + id + ", name=" + name + "]";
	}
	
}