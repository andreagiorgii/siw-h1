package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private Long matricola;
	
	private String firstName;
	
	private String lastName;
	
	private LocalDate dateOfBirth;
	
	private String placeOfBirth;
	
	private String email;
	
	@OneToMany(mappedBy="student",fetch=FetchType.EAGER)
	private List<Course> courses;
	
	@OneToOne 
	private Company company;
	
	public Student() {}
	
	public Student(String firstName, String lastName, LocalDate dateOfBirth, String placeOfBirth, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.email = email;
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
