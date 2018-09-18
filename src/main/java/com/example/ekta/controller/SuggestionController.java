package com.example.ekta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ekta.model.Suggestion;
import com.example.ekta.service.SugesstionService;

@RestController
//@CrossOrigin(origins = "http://localhost:2500")
@CrossOrigin(origins = "https://jantaekta-party-dev.firebaseapp.com")
//@CrossOrigin(origins = "http://localhost:8080")
public class SuggestionController {
	
	@Autowired
	private SugesstionService sugestionService ;
	/*payload
	{"suggsestion_subject" :"ssdsadsadsad1","suggsestion_description":"d1dasd"}*/
	@RequestMapping(value="/suggestion", method=RequestMethod.POST)
	public String suggestion(@RequestBody Suggestion suggestion) {
		sugestionService.suggestion(suggestion);
		return "Your Suggestion has been accepted" ;
	}
	@RequestMapping(value="/suggestions", method=RequestMethod.GET)
	public List<Suggestion> suggestions() {
		return sugestionService.suggestions();
	}
	@RequestMapping(value="/suggestion/{id}", method=RequestMethod.DELETE)
	public String deleteSuggestion(@PathVariable int id){
		sugestionService.deleteSuggestion(id);
		return "Suggestion has been deleted" ;
	}


}
