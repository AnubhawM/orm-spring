package com.cooksys.entity;

import java.util.HashMap;

import javax.persistence.*;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String text;
	
	@Column(nullable = false)
	private HashMap<Integer, String> answers;
	
	
	public Question() {
		
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


	@Override
	public String toString() {
		return "Question [id=" + id + ", text=" + text + ", answers=" + answers + "]";
	}
	
	
}
