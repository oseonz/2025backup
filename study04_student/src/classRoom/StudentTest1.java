package classRoom;

public class StudentTest1 {

	public static void main(String[] args) {
		Student student = new Student("이서진");
		
		student.addSubject("자바", 100);
		student.addSubject("html", 100);
		student.addSubject("파이썬", 100);
		
		student.getAverage();
		student.printSubjects();
		
	}

}
