package com.serialization;

import java.io.Serializable;

// Serialization
public class Students implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private String FirstName;
	private String Lastname;
	private String city;

	
	
	public String getFirstName() {
		return FirstName;
	}



	public void setFirstName(String firstName) {
		FirstName = firstName;
	}



	public String getLastname() {
		return Lastname;
	}



	public void setLastname(String lastname) {
		Lastname = lastname;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
