package com.spring.collections.collectionEx;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Questions {

	   private List<Object> questionId;
	   private Set<Object>  question;
	   private Map<Object, Object>  answers;
	   
	   
	   
	public List<Object> getQuestionId() {
		System.out.println("Question List Elements :"  + questionId);
		return questionId;
	}
	public void setQuestionId(List<Object> questionId) {
		this.questionId = questionId;
	}
	public Set<Object> getQuestion() {
		
		System.out.println("Question Elements :"  + question);
		return question;
	}
	public void setQuestion(Set<Object> question) {
		this.question = question;
	}
	public Map<Object, Object> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Object, Object> answers) {
		System.out.println("Question Answer :"  + answers);
		this.answers = answers;
	}
	
	@Override
	public String toString() {
		return "Questions [getQuestionId()=" + getQuestionId() + ", getQuestion()=" + getQuestion() + ", getAnswers()="
				+ getAnswers() + "]";
	}
	   
 
	   
	
}
