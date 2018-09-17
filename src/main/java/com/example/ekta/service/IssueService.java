package com.example.ekta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ekta.model.Issue;
import com.example.ekta.model.Suggestion;
import com.example.ekta.repository.IssueRepository;
import com.example.ekta.repository.SuggestionRepository;

@Service
public class IssueService {


	@Autowired IssueRepository issueRepo ;
	
	public void issue(Issue issue) {
		
		issueRepo.save(issue);
	}

	public List<Issue> issues() {
		// TODO Auto-generated method stub
		
		List<Issue> obj = null ;
		obj = issueRepo.findAll();
		return obj ;
	}

	public void deletePatient(int id) {
		// TODO Auto-generated method stub
		issueRepo.deleteById(id);
		
	}
}