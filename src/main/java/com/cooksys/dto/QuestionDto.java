package com.cooksys.dto;

import java.util.HashMap;

public class QuestionDto {
	public Integer id;
	public String text;
	private HashMap<Integer, String> answers;


	public QuestionDto() {
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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

