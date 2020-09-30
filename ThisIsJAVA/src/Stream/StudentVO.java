package Stream;

public class StudentVO {
	private String name;
	private int score;

	public StudentVO(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}
}
