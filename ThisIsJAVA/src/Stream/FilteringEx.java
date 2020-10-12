package Stream;

import java.util.Arrays;
import java.util.List;

/**
 * 필터링
 * 
 * 필터링은 중간 처리 기능이다. 요소를 걸러내는 역할을 수행한다.
 * 필터링 메소드는 distinct() : 중복 제거, filter() 조건 필터링이 있고, 모든 스트림이 가지고 있는 공통 메소드이다.
 * 
 * 
 * @author akjak
 *
 */
public class FilteringEx {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신사임당", "임꺽정", "이순신", "세종대왕", "세종대왕");

		// 중복을 제거한 필터링
		names.stream()
			.distinct() // 중복 제거 : Object.equals(object)가 true 이면 동일한 객체로 판단하고 중복을 제거한다.
			.forEach(n -> System.out.println(n)); // 중복 제거한 객체들의 이름을 하나씩 출력한다.

		System.out.println(); 

		// 조건 필터링
		names.stream()
			.filter(n -> n.startsWith("세")) // 필터링 : '세' 로 시작하는 이름만 가져온다.
			.forEach(n -> System.out.println(n)); // 조건에 부합하는 객체들을 하나씩 출력한다.

		System.out.println();

		// 중복 제거 후 조건 필터링
		names.stream()
			.distinct()
			.filter(n -> n.startsWith("세"))
			.forEach(n -> System.out.println(n));

	}

}
