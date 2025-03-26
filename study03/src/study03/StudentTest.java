package study03;

public class StudentTest {

	int sum = 0; 
	public static void main(String[] args) {
		Student lee = new Student();
		lee.studentName = "강영현";
		lee.address = "서울";
		
		lee.showStudentInfo();
		
		
		Student kim = new Student();
		Student han = new Student(); //실체화
		
		han.studentName = "이서진";
		han.address = "인천";
		
		han.showStudentInfo();
	}

}
