package examClass01;

public class ExamClassTest1 {

	public static void main(String[] args) {
		Student student = new Student("이서진");
		student.addSubject("영어");
		student.addSubject("국어");
		
		Student eng = student.getSubject("영어");
		if (eng!=null) {
			
		}
	}

}
