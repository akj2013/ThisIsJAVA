package LambdaStandardAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate 함수적 인터페이스
 * 
 * @author akjak
 *
 */
public class PredicateEx {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 10, 20),
			new Student("홍길동", 33, 44),
			new Student("홍길동", 55, 66),
			new Student("홍길동", 77, 88)
			);

	/**
	 * 학생들의 영어 점수의 평균값을 구한다.
	 * 
	 * @param predicate
	 * @return 영어 평균 점수
	 */
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for (Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getEnglishScore();
			}
		}
		return (double) sum / count;
	}

	
	public static void main(String[] args) {
		double avg = avg(t -> t.getName().equals("홍길동"));
		System.out.println("홍길동 영어 평균 점수 : " + avg);
	}

}
/*
Predicate 함수적 인터페이스

매개 변수와 boolean 리턴값이 있는 testXXX() 메소드를 가지고 있다.
이 메소드들은 매개값을 조사해서 true 또는 false를 리턴하는 역할을 한다.

*/