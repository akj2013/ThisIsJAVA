package Stream;

/**
 * 학생 VO
 * 
 * String 이름
 * int 점수
 * 
 * 정렬 가능한 클래스
 * 
 * 스트림은 요소가 최종 처리되기 전에 중간 단계에서 요소를 정렬해서 최종 처리 순서를 변경할 수 있다.
 * 객체 요소일 경우에는 클래스가 Comparable을 구현하지 않으면 sorted() 메소드를 호출했을 때 ClassCastException이 발생한다.
 * 따라서 Comparable을 구현한 요소에서만 sorted() 메소드를 호출해야 한다.
 * 
 * 
 * @author akjak
 *
 */
public class Student implements Comparable<Student>{
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

	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score); // < 음수 , == 0 , > 양수 리턴
	}
}
