package br.com.lovelo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.com.lovelo.enums.ClassTypeEnum;

@Entity
public class Classes {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="classType")
	private ClassTypeEnum classType;
	
	@OneToOne
	@JoinColumn(name="localId")
	private Address localClass;
	
	@Column(name="timeOfClass")
	private String timeOfClass;
	
	@Column(name="whatToBring")
	private String whatToBring;
	
	@Column(name="workoutDescription")
	private String workoutDescription;
	
	@OneToMany
	private List<ClassesActivities> classesActivities;
	
	@OneToMany
	private List<ClassesDates> classesDate;
	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ClassTypeEnum getClassType() {
		return classType;
	}

	public void setClassType(ClassTypeEnum classType) {
		this.classType = classType;
	}

	public Address getLocalClass() {
		return localClass;
	}

	public void setLocalClass(Address localClass) {
		this.localClass = localClass;
	}

	public String getTimeOfClass() {
		return timeOfClass;
	}

	public void setTimeOfClass(String timeOfClass) {
		this.timeOfClass = timeOfClass;
	}

	public String getWhatToBring() {
		return whatToBring;
	}

	public void setWhatToBring(String whatToBring) {
		this.whatToBring = whatToBring;
	}

	public List<ClassesActivities> getClassesActivities() {
		return classesActivities;
	}

	public void setClassesActivities(List<ClassesActivities> classesActivities) {
		this.classesActivities = classesActivities;
	}

	public List<ClassesDates> getClassesDate() {
		return classesDate;
	}

	public void setClassesDate(List<ClassesDates> classesDate) {
		this.classesDate = classesDate;
	}

	public String getWorkoutDescription() {
		return workoutDescription;
	}

	public void setWorkoutDescription(String workoutDescription) {
		this.workoutDescription = workoutDescription;
	}
	
}
