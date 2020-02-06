package com.wildcodeschool.sea.bonn.whereismyband.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=5, max = 5)
	@Pattern( regexp = "^[0-9]{5}$", message="Ungültige Postleitzahl!!!")
	private String postCode;

	private String city;
	
	@OneToOne(mappedBy = "address")
	private Band band;
			
}

