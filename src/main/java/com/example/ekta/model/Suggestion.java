package com.example.ekta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="SUGGESTION")
//@Entity /*H2 data base*/
public class Suggestion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	//@GeneratedValue h2 in memory database
	@Column(name="SUGGESTION_ID")
	private int suggsestion_id ;
	
	@Column(name="SUGGESTION_SUBJECT")
	private String suggsestion_subject ;
	
	@Column(name="SUGGESTION_DESCRIPTION")
	private String suggsestion_description ;

	public int getSuggsestion_id() {
		return suggsestion_id;
	}

	public void setSuggsestion_id(int suggsestion_id) {
		this.suggsestion_id = suggsestion_id;
	}

	public String getSuggsestion_subject() {
		return suggsestion_subject;
	}

	public void setSuggsestion_subject(String suggsestion_subject) {
		this.suggsestion_subject = suggsestion_subject;
	}

	public String getSuggsestion_description() {
		return suggsestion_description;
	}

	public void setSuggsestion_description(String suggsestion_description) {
		this.suggsestion_description = suggsestion_description;
	}
	public Suggestion() {
		super();
	}
	public Suggestion(int suggsestion_id, String suggsestion_subject, String suggsestion_description) {
		super();
		this.suggsestion_id = suggsestion_id;
		this.suggsestion_subject = suggsestion_subject;
		this.suggsestion_description = suggsestion_description;
	}

	
}
