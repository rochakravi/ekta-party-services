package com.example.ekta.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ekta.controller.SuggestionController;
import com.example.ekta.model.Suggestion;
import com.example.ekta.repository.SuggestionRepository;

@Service
public class SugesstionService {

	@Autowired SuggestionRepository suggestionRepo ;
	
	public void suggestion(Suggestion suggestion) {
		// TODO Auto-generated method stub
		
		suggestionRepo.save(suggestion);
	}

	public List<Suggestion> suggestions() {
		// TODO Auto-generated method stub
		
		List<Suggestion> obj = null ;
		obj = suggestionRepo.findAll();
		return obj ;
	}

	public void deleteSuggestion(int id) {
		// TODO Auto-generated method stub
		suggestionRepo.deleteById(id);
	}
	

}
