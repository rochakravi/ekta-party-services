package com.example.ekta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ekta.model.Suggestion;

@Repository
public interface SuggestionRepository extends JpaRepository<Suggestion, Integer>  {

}
