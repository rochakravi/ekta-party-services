package com.example.ekta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ekta.model.Suggestion;
import com.example.ekta.service.SugesstionService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SuggestionController {
	
	@Autowired
	private SugesstionService sugestionService ;
	
	@RequestMapping(value="/suggetion", method=RequestMethod.POST)
	public void suggestion(@RequestBody Suggestion suggestion) {
		sugestionService.suggestion(suggestion);
	}
	@RequestMapping(value="/suggetions", method=RequestMethod.GET)
	public List<Suggestion> suggestions() {
		return sugestionService.suggestions();
	}


}
