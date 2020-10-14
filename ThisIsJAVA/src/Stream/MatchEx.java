package Stream;

import java.util.Arrays;

/**
 * 매칭
 * 
 * 스트림 클래스는 최종 처리 단계에서 요소들이 특정 조건에 만족하는지 조사할 수 있도록 세 가지 매칭 메소드를 제공한다.
 * allMatch() : 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하는지 조사.
 * anyMatch() : 최소한 한 개의 요소가 매개값으로 주어진 Predicate의 조건을 만족하는지 조사.
 * noneMatch() : 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하지 않는지 조사.
 * 
 * @author akjak
 *
 */

public class MatchEx {

	public static void main(String[] args) {
		int[] intArr = {2, 4, 6};

		boolean result = Arrays.stream(intArr)
				.allMatch(a -> a%2 ==0);
		System.out.println("모두 2의 배수인가? " + result);

		result = Arrays.stream(intArr)
				.anyMatch(a -> a%3 == 0);
		System.out.println("3의 배수가 하나라도 있는가? " + result); 

		result = Arrays.stream(intArr)
				.noneMatch(a -> a%3 == 0);
		System.out.println("3의 배수가 없는가? " + result);
	}

}
