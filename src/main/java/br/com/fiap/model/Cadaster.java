package br.com.fiap.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cadaster {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String name;
	private Date birthdate;
	private String email;
	private String password;
	
	
	
	@Override
	public String toString() {
		return "Cadaster [id=" + id + ", name=" + name + ", birthdate=" + birthdate + ", email=" + email
				+ ", password=" + password + "]";
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

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}