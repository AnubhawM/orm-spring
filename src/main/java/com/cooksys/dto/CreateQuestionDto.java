package com.cooksys.dto;

import java.util.HashMap;

public class CreateQuestionDto {

	private String text;
	private HashMap<Integer, String> answers;
	
	public CreateQuestionDto() {
		
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public HashMap<Integer, String> getAnswers() {
		return answers;
	}

	public void setAnswers(HashMap<Integer, String> answers) {
		this.answers = answers;
	}
	
	
}
