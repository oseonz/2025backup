package examClass;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("강영현");
		
		student.addSubject("국어", 100);
		student.addSubject("영어", 0);
		student.addSubject("수학", 0);
		
		student.getAverage(); //평균 점수 구하기
		student.printSubjects(); //학생의 과목 출력
		
		student.getHighScoreSub();
		
	}

}
