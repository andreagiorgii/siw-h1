package it.uniroma3.siw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String ragioneSociale;
	
	private Address address;
	
	private String phoneNumber;
	
	public Company(String ragione, Address address, String phone ) {
		this.ragioneSociale = ragione;
		this.address = address;
		this.phoneNumber = phone;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public Address getIndirizzo() {
		return address;
	}

	public void setIndirizzo(Address indirizzo) {
		this.address = indirizzo;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
