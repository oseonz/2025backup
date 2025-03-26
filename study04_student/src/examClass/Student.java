package examClass;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String name;
	List<Subject> subjects;
	
	public Student(String name) {
		this.name = name;
		this.subjects = new ArrayList<>();
	} //생성자
	
	public void addSubject(String subjectName, int score) {
		subjects.add(new Subject(subjectName, score));
	}
	
	public void printSubjects() {
		System.out.println(name+" 학생의 수강과목 리스트");
		for(Subject subject:subjects) {
			System.out.println("- "+subject);
		}
		System.out.println("평균 점수: "+getAverage()+"점입니다.");
		
	}
	
	public int getAverage() {
		int sum = 0;
		for(Subject subject:subjects) {
			sum += subject.getScore();
		}
		
		
		return (int) Math.floor((double)sum/subjects.size());
	}
	
	//과목의 최고 점수
	public Subject getHighScoreSub() {
		Subject highScore = subjects.get(0);
//		Subject name = new Subject("자바", 50);
		
		for(Subject subject:subjects) {
//			System.out.println("점수"+subject.getScore());
			if(subject.getScore() > highScore.getScore()) {
				highScore = subject;
			}	
		}
		return highScore;
	}
	
	public Subject getHigh() {
//		Subject name = new Subject("국어", 10);
		Subject name = subjects.get(0); //List<Subject> subjects
		
		for(Subject kang:subjects) {
			if(kang.getScore() > name.getScore()) { //1순위 50>50 2순위 80>50 3순위 60>80
				
			}
		}
		return name;
	}
}
