package Stream;

import java.util.Arrays;
import java.util.List;

/**
 * 매핑
 * 
 * 매핑은 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 작업을 말한다.
 * 
 * flatMapXXX() 메소드는 요소를 대체하는 복수 개의 요소들로 구성된 새로운 스트림을 리턴한다.
 * 
 * @author akjak
 *
 */
public class FlatMapEx {

	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");

		inputList1.stream()
			.flatMap(data -> Arrays.stream(data.split(" "))) // 띄어쓰기로 split하여 2개씩 구성된 객체로 새로운 스트림을 리턴한다.
			.forEach(word -> System.out.println(word)); // 단어들을 하나씩 출력한다.

		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		inputList2.stream()
			.flatMapToInt(data -> { // 리턴타입이 IntStream
				String[] strArr = data.split(","); // 반점으로 각각 데이터들을 나눈다.
				int[] intArr = new int[strArr.length];
				for (int i=0; i<strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim()); // trim() : 문자열의 양쪽 공백을 제거한다.
				}
				return Arrays.stream(intArr);
			})
			.forEach(number -> System.out.println(number)); // 숫자들을 하나씩 출력한다.
	}

}
