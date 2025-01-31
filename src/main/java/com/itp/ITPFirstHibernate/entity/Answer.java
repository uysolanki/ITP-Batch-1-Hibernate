package com.itp.ITPFirstHibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int aid;
	private String answer;
	
	@OneToOne
	private Question question;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer() {}
	public Answer(int aid, String answer, Question question) {
		this.aid = aid;
		this.answer = answer;
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", answer=" + answer + ", question=" + question + "]";
	}
	
	
	
}
