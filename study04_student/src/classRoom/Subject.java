package classRoom;

public class Subject {
	private String name;
	private int score;
	
	public Subject(String name, int score) {
		this.name = name;
		this.score = score;
	} //생성자
	
	public String getName() {
		return name;
	} //과목 이름을 가져올 때 사용
	
	public int getScore() {
		return score;
	} //점수를 가져올 때 사용
	
	
	@Override
	public String toString() {
		return "과목명 = "+name+", 점수 = "+score;
	} //과목과 점수를 출력할 때 toString 사용
}
