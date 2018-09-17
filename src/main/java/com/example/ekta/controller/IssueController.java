package com.example.ekta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ekta.model.Issue;
import com.example.ekta.model.Suggestion;
import com.example.ekta.service.IssueService;
import com.example.ekta.service.SugesstionService;

@RestController
@CrossOrigin(origins = "http://localhost:2500")
//@CrossOrigin(origins = "http://localhost:8080")
public class IssueController {
	@Autowired
	private IssueService issueService ;
	/*payload
	{"issue_subject" :"ssdsadsadsad1","issue_description":"fgfgfg"}*/
	@RequestMapping(value="/issue", method=RequestMethod.POST)
	public String suggestion(@RequestBody Issue issue) {
		issueService.issue(issue);
		return "Your Issue has been raised." ;
	}
	@RequestMapping(value="/issues", method=RequestMethod.GET)
	public List<Issue> issues() {
		return issueService.issues();
	}
	@RequestMapping(value="/issue/{id}", method=RequestMethod.DELETE)
	public String deleteIssue(@PathVariable int id) {
		issueService.deletePatient(id);
		return "Issue has been deleted" ;
	}
	
}
