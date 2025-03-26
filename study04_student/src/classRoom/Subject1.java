package classRoom;

public class Subject1 {
	private String name;
	private int score;
	
	public void Subject(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return "과목명 = "+name+", 점수 = "+score;
	}
}
