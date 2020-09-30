package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 스트림은 내부 반복자를 사용하므로 병렬 처리가 쉽다.
 * 
 * 외부 반복자는 개발자가 코드로 직접 컬렉션의 요소를 반복해서 가져오는 코드 패턴을 말한다.
 * for문이나 iterator의 while문은 모두 외부 반복자이다.
 * 반면에, 내부 반복자는 컬렉션 내부에서 요소들을 반복시키고, 개발자는 요소당 처리해야 할 코드만 제공하는 코드 패턴을 말한다.
 * 컬렉션 내부에서 어떻게 요소를 반복시킬 것인가는 컬렉션에 맡겨두고, 개발자는 요소 처리 코드에만 집중할 수 있다.
 * 
 * 병렬 처리란 한 가지 작업을 서브 작업으로 나누고, 서브 작업들을 분리된 스레드에서 병렬적으로 처리하는 것을 말한다.
 * 병렬 처리 스트림을 이용하면 런타임 시 하나의 작업을 서브 작업으로 자동으로 나누고, 서브 작업의 결과를 자동으로 결합해서
 * 최종 결과물을 생성한다.
 * 
 * 
 * @author akjak
 *
 */
public class ParallelEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "이순신", "신사임당", "황희", "김옥균");

		// 순차 처리
		Stream<String> stream = list.stream();
		stream.forEach(ParallelEx :: print); // 메소드 참조 ( s -> ParallelEx.print(s)와 동일)

		System.out.println();

		// 병렬 처리 : 여러 스레드를 이용한다.
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelEx :: print); // 메소드 참조

	}

	/**
	 * 이름과 내부 반복자가 사용한 스레드의 이름을 출력한다.
	 * @param str 이름
	 */
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}
