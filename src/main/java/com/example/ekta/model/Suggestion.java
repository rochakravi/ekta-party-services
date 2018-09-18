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
	
// 	@Column(name="SUGGESTION_SUBJECT")
// 	private String suggsestion_subject ;
	
	@Column(name="SUGGESTION_DESCRIPTION")
	private String suggsestion_description ;
	
	@Column(name="SOCIAL_NAME")
	private String social_name ;
	
	@Column(name="SOCIAL_PIC")
	private String social_pic ;

	public int getSuggsestion_id() {
		return suggsestion_id;
	}

	public void setSuggsestion_id(int suggsestion_id) {
		this.suggsestion_id = suggsestion_id;
	}

// 	public String getSuggsestion_subject() {
// 		return suggsestion_subject;
// 	}

// 	public void setSuggsestion_subject(String suggsestion_subject) {
// 		this.suggsestion_subject = suggsestion_subject;
// 	}

	public String getSuggsestion_description() {
		return suggsestion_description;
	}

	public void setSuggsestion_description(String suggsestion_description) {
		this.suggsestion_description = suggsestion_description;
	}

	public String getSocial_name() {
		return social_name;
	}

	public void setSocial_name(String social_name) {
		this.social_name = social_name;
	}

	public String getSocial_pic() {
		return social_pic;
	}

	public void setSocial_pic(String social_pic) {
		this.social_pic = social_pic;
	}

	public Suggestion(int suggsestion_id, String suggsestion_description,
			String social_name, String social_pic) {
		super();
		this.suggsestion_id = suggsestion_id;		
		this.suggsestion_description = suggsestion_description;
		this.social_name = social_name;
		this.social_pic = social_pic;
	}

	public Suggestion() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
}
