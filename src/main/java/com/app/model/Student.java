package com.app.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "studentV6")
public class Student implements Serializable {


	private static final long serialVersionUID = -1040729419671526075L;

	@Id
	private String id;
    private String  surnames;
	private String  names;
	private String  gender;
	private String  typeDocument;
	private String  numDocument;
	private LocalDate dateBirthStudent;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSurnames() {
		return surnames;
	}
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTypeDocument() {
		return typeDocument;
	}
	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}
	public String getNumDocument() {
		return numDocument;
	}
	public void setNumDocument(String numDocument) {
		this.numDocument = numDocument;
	}
	public LocalDate getDateBirthStudent() {
		return dateBirthStudent;
	}
	public void setDateBirthStudent(LocalDate dateBirthStudent) {
		this.dateBirthStudent = dateBirthStudent;
	}	
}
