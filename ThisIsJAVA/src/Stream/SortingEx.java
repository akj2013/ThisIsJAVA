package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 정렬
 * 
 * 
 * @author akjak
 *
 */
public class SortingEx {

	public static void main(String[] args) {
		// 숫자 요소일 경우
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4}); // 정렬되어 있지 않은 스트림
		intStream
			.sorted() // 숫자를 오름차순으로 정렬
			.forEach(n -> System.out.println(n)); // 숫자를 출력

		System.out.println();

		// 객체 요소일 경우
		List<Student> studentList = Arrays.asList(
					new Student("홍길동", 30),
					new Student("임꺽정", 75),
					new Student("이순신", 11)
				);

		studentList
			.stream() // 스트림 객체 얻기
			.sorted() // 정수를 기준으로 오름차순으로 Student 정렬
			.forEach(s -> System.out.println(s.getScore()));

		studentList
			.stream() // 스트림 객체 얻기
			.sorted(Comparator.reverseOrder()) // 정수를 기준으로 내림차순으로 Student 정렬
			.forEach(s -> System.out.println(s.getScore()));
	}

}
