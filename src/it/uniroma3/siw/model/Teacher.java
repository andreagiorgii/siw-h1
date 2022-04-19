package it.uniroma3.siw.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	private Long pIva;
	
	private String firstName;
	
	private String lastName;
	
	private LocalDate dateOfBirth;
	
	private String placeOfBirth;
	
	public Teacher() {}
	
	public Teacher(String firstName, String lastName, LocalDate date, String place) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = date;
		this.placeOfBirth = place;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

}
