package Stream;

import java.util.stream.IntStream;

/**
 * 숫자 범위로부터 스트림 얻기
 * 
 * @author akjak
 *
 */
public class FromIntRangeEx {
	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100); // 1에서 100까지를 순차적으로 제공하는 스트림을 리턴한다.
		stream.forEach(a -> sum += a);
		System.out.println("총합 : " + sum);
	}

}
