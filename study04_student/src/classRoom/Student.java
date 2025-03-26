package classRoom;

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
		System.out.println("평균 점수: "+getAverage()+"입니다.");
	}
	
	public int getAverage() {
		int sum = 0;
		for(Subject subject:subjects) {
			sum += subject.getScore();
		}
		
		
		return (int) Math.floor((double)sum/subjects.size());
	}
}
