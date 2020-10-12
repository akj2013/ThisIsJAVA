package Stream;

import java.util.Arrays;
import java.util.List;

/**
 * mapXXX() 메소드는 요소를 대체하는 요소로 구성된 새로운 스트림을 리턴한다.
 * 
 * 학생 List에서 학생의 점수를 요소로 하는 새로운 스트림을 생성하고, 점수를 순차적으로 콘솔에 출력한다.
 * 
 * @author akjak
 *
 */
public class MapEx {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("이순시", 100),
				new Student("황진이", 50)
			);

		list.stream()
			.mapToInt(Student :: getScore) // int로 된 스트림을 새로 리턴한다.
			.forEach(socre -> System.out.println(socre));

	}

}
