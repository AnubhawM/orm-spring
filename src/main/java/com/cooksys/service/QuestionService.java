package com.cooksys.service;

import org.springframework.stereotype.Service;

import com.cooksys.dto.CreateQuestionDto;
import com.cooksys.dto.QuestionDto;
import com.cooksys.entity.Question;
import com.cooksys.mapper.QuestionMapper;
import com.cooksys.repository.QuestionRepository;
import com.cooksys.entity.Quiz;


@Service
public class QuestionService {
	private QuestionRepository questionRepository;
	private QuestionMapper questionMapper;
	
	public QuestionService(QuestionRepository questionRepository, QuestionMapper questionMapper) {
		this.questionRepository = questionRepository;
		this.questionMapper = questionMapper;
	}
	
	public QuestionDto createQuestion(CreateQuestionDto questionDto) {
		Question questionEntity = questionMapper.createQuestionDtoToEntity(questionDto);
		Question questionCreated = questionRepository.saveAndFlush(questionEntity);
		
		// Add question to a quiz's list of questions
		// quizEntity.getQuiz().add(questionCreated);
		
		return questionMapper.entityToDto(questionEntity);
	}
	
	public QuestionDto getById(Integer id) {
		Question question = questionRepository.getById(id);
		return questionMapper.entityToDto(question);
	}
}
