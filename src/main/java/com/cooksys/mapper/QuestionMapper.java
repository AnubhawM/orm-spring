package com.cooksys.mapper;

import java.util.ArrayList;

import org.mapstruct.Mapper;

import com.cooksys.dto.CreateQuestionDto;
import com.cooksys.dto.QuestionDto;
import com.cooksys.entity.Question;

@Mapper(componentModel = "spring")
public interface  QuestionMapper {
	
	Question createQuestionDtoToEntity(CreateQuestionDto createQuestionDto);
	
	QuestionDto entityToDto(Question question);
	
	ArrayList<QuestionDto> entitiesToDtos(ArrayList<Question> questions);
	
	
}
