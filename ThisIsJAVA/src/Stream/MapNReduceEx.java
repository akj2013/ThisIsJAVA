package Stream;

import java.util.Arrays;
import java.util.List;

/**
 * 스트림은 컬렉션의 요소에 대해 중간 처리와 최종 처리를 수행할 수 있는데,
 * 중간 처리에서는 매핑, 필터링, 정렬을 수행하고
 * 최종 처리에서는 반복, 카운팅, 평균, 총합 등의 집계 처리를 수행한다.
 * 
 * 
 * @author akjak
 *
 */
public class MapNReduceEx {

	public static void main(String[] args) {
		List<StudentVO> studentList = Arrays.asList(
			new StudentVO("이순신", 100),
			new StudentVO("황희", 95),
			new StudentVO("정승", 80)
		);

		double avg = studentList.stream()
				// 중간 처리 ( 학생 전체를 점수로 매핑)
				.mapToInt(StudentVO :: getScore)
				// 최종 처리 (평균 점수)
				.average()
				.getAsDouble();

		System.out.println("평균 점수 : " + avg);

	}

}
