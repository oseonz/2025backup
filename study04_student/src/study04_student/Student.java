package study04_student;

import classRoom.Subject;

public class Student {
	String name;
	int score;
	int average;
	private Object subjects;
	
	public Student(String name, int score, int average) {
		this.name = name;
		this.score = score;
		this.average = average;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setAverage(int average) {
		this.average = average;
	}
}
