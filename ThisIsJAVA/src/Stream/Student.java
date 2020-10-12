package Stream;

/**
 * 학생 VO
 * 
 * String 이름
 * int 점수
 * 
 * @author akjak
 *
 */
public class Student {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}
