package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 다른 요소로 대체
 *  * 
 * @author akjak
 *
 */
public class AsDoubleStreamAndBoxedEx {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};

		IntStream intStream = Arrays.stream(intArr);
		intStream
			.asDoubleStream() // int -> double
			.forEach(더블 -> System.out.println(더블)); // double 요소를 출력.

		System.out.println();

		// boxed() : int를 Integer / long을 Long / double을 Double 요소로 박싱해서 Stream을 생성한다.
		intStream = Arrays.stream(intArr);
		intStream
			.boxed() // Stream<Integer>를 생성
			.forEach(obj -> System.out.println(obj.intValue())); // int 요소를 출력

	}

}
