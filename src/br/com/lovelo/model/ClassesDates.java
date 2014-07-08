package br.com.lovelo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="Classes_Dates")
public class ClassesDates {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="classesId") 
	private Classes classes;
	
	@Column(name="dateOfClass")
	private Date dateOfClass;

	public Date getDateOfClass() {
		return dateOfClass;
	}

	public void setDateOfClass(Date dateOfClass) {
		this.dateOfClass = dateOfClass;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}
}
