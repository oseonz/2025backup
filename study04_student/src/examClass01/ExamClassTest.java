package examClass01;


public class ExamClassTest {

	public static void main(String[] args) {
		Student student = new Student("강영현");
		student.addSubject("밴드");
		student.addSubject("영어");
		
		Subject band = student.getSubject("밴드");
		if(band!=null) {
			band.addExam(80, "2025-02-20");
			band.addExam(90, "2025-02-21");
			band.addExam(100, "2025-02-22");
		} //데이터가 있으면 실행
		
		Subject eng = student.getSubject("영어");
		if(eng!=null) {
			eng.addExam(90, "2025-02-20");
			eng.addExam(95, "2025-02-21");
			eng.addExam(100, "2025-02-22");
		} //데이터가 있으면 실행	
		
		student.printAllSubjects();
	}

}