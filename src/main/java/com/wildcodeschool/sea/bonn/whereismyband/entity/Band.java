package com.wildcodeschool.sea.bonn.whereismyband.entity;

import java.util.ArrayList;

public class Band {
	
	// database id
	private Long id;
	private String name;
	// picture to be done
	private Address address;
	private String email;
	private String phone;
	private ArrayList<Genre> favoriteGenres;	
	
	public Band(Long id, String name, Address address, String email, String phone, ArrayList<Genre> favoriteGenres) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.favoriteGenres = favoriteGenres;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public ArrayList<Genre> getFavoriteGenres() {
		return favoriteGenres;
	}
	public void setFavoriteGenres(ArrayList<Genre> favoriteGenres) {
		this.favoriteGenres = favoriteGenres;
	}

}
