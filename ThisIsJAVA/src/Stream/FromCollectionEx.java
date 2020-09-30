package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 컬렉션으로부터 스트림 얻기
 * 
 * @author akjak
 *
 */
public class FromCollectionEx {

	public static void main(String[] args) {
		List<StudentVO> studentList = Arrays.asList(
				new StudentVO("이순신", 100),
				new StudentVO("황희", 95),
				new StudentVO("정승", 80)
			);

		Stream<StudentVO> stream = studentList.stream();
		stream.forEach(s -> System.out.println(s.getName()));

	}

}
