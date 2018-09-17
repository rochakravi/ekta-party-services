package com.example.ekta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="ISSUE")
public class Issue {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	//@GeneratedValue h2 in memory database
	@Column(name="ISSUE_ID")
	private int issue_id ;
	
	@Column(name="ISSUE_SUBJECT")
	private String issue_subject ;
	
	@Column(name="ISSUE_DESCRIPTION")
	private String issue_description ;

	public int getIssue_id() {
		return issue_id;
	}

	public void setIssue_id(int issue_id) {
		this.issue_id = issue_id;
	}

	public String getIssue_subject() {
		return issue_subject;
	}

	public void setIssue_subject(String issue_subject) {
		this.issue_subject = issue_subject;
	}

	public String getIssue_description() {
		return issue_description;
	}

	public void setIssue_description(String issue_description) {
		this.issue_description = issue_description;
	}

	public Issue(int issue_id, String issue_subject, String issue_description) {
		super();
		this.issue_id = issue_id;
		this.issue_subject = issue_subject;
		this.issue_description = issue_description;
	}

	public Issue() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
}
