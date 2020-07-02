package LambdaStandardAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/**
 * Function 함수적 인터페이스
 * 
 * 매개값과 리턴값이 있는 applyXXX() 메소드를 가진다.
 * 이 메소드들은 매개값을 리턴값으로 매핑하는 역할을 한다.
 *  
 * @author akjak
 *
 */
public class FunctionEx {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 36),
			new Student("황건적", 50, 50)
			);

	public static void printString( Function<Student, String> function ) {
		for (Student student : list) {
			System.out.println(function.apply(student) + " "); // 람다식 실행
		}
		System.out.println(); // 개행
	}

	public static void printInt( ToIntFunction<Student> function ) {
		for (Student student : list) {
			System.out.println(function.applyAsInt(student) + " "); // 람다식 실행
		}
		System.out.println(); // 개행
	}

	public static double avg ( ToIntFunction<Student> function ) {
		int sum = 0;
		for (Student student : list) {
			sum += function.applyAsInt(student); // 람다식 실행
		}
		double avg = (double) sum / list.size();
		return avg;
	}

	public static void main(String[] args) {
		System.out.println("학생 이름");
		printString( t -> t.getName());

		System.out.println("영어 점수");
		printInt( t -> t.getEnglishScore());

		System.out.println("수학 점수");
		printInt( t -> t.getMathScore());

		double englishAvg = avg( s -> s.getEnglishScore()); // 인스턴스 대입
		System.out.println("영어 평균 점수 : " + englishAvg);

		double mathAvg = avg( s -> s.getMathScore()); // 인스턴스 대입
		System.out.println("수학 평균 점수 : " + mathAvg);
	}

}
