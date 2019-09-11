package com.cooksys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.dto.CreateQuestionDto;
import com.cooksys.dto.QuestionDto;
import com.cooksys.service.QuestionService;


@RestController
@RequestMapping("/Quizzes")
public class QuestionController {
	
	private QuestionService questionService;
	
	@Autowired
	public QuestionController (QuestionService questionService) {
		this.questionService = questionService;
	}
	
	
	@GetMapping(value = "/{id}")
	public QuestionDto getQuestion(@PathVariable Integer id) {
		return questionService.getById(id);
	}
	
	@PostMapping
	public QuestionDto createDto (@RequestBody CreateQuestionDto createQuestionDto) {
		return questionService.createQuestion(createQuestionDto);
	}
	
	
}
