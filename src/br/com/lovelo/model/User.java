package br.com.lovelo.model;

import java.security.NoSuchAlgorithmException;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.lovelo.crypt.Encryption;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	@Column(name="dtInclude")
	private Calendar dtInclude;
	
	@Column(name="user" )
	private String user;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@OneToOne
	private Address address;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		Encryption encrypt = new Encryption();
		try {
			this.password = encrypt.encrypt(password);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Calendar getDtInclude() {
		return dtInclude;
	}

	public void setDtInclude(Calendar dtInclude) {
		this.dtInclude = dtInclude;
	}
	
	
}
