package Stream;

import java.util.Arrays;

/**
 * 루핑
 * 
 * 푸링은 요소 전체를 반복하는 것을 말한다.
 * peek() : 중간 처리 메소드 -> 최종 처리 메소드가 호출되어야만 동작한다.
 * forEach() : 최종 처리 메소드
 * 
 * 
 * @author akjak
 *
 */
public class LoopingEx {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};

		System.out.println("peek()을 마지막에 호출한 경우");
		Arrays.stream(intArr)
			.filter(a -> a%2 == 0)
			.peek(n -> System.out.println(n)); // 중간 처리 메소드이기 때문에 동작하지 않는다.

		System.out.println("최종 처리 메소드를 마지막에 호출한 경우");

		int total =Arrays.stream(intArr)
				.filter(a -> a%2 == 0)
				.peek(n -> System.out.println(n))
				.sum(); // 최종 메소드
		System.out.println("총합 : " + total);

		System.out.println("forEach()를 마지막에 호출한 경우");
		Arrays.stream(intArr)
			.filter(a -> a%2 == 0)
			.forEach(n -> System.out.println(n)); // 최종 메소드로 동작함
	}
}
