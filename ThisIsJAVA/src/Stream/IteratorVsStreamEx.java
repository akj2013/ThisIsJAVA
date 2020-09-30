package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * 스트림
 * 
 * 스트림은 자바8부터 추가된 컬렉션의 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 반복자이다.
 * 컬렉션의 stream() 메소드로 스트림 객체를 얻고 나서 forEach(a -> b) 메소드를 통해 컬렉션의 요소를 하나씩 얻어올 수 있다.
 * 
 * 스트림은 Iterator와 비슷한 역할을 하는 반복자이지만, 람다식으로 요소 처리 코드를 제공하는 점과 내부 반복자를 사용하므로 병렬 처리가
 * 쉽다는 점, 그리고 중간 처리와 최종 처리 작업을 수행하는 점에서 많은 차이를 가지고 있다.
 * 
 * 
 * @author akjak
 *
 */
public class IteratorVsStreamEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "임꺽정", "이순신");

		// Iterator를 이용
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}

		System.out.println();

		// Stream을 이용
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));

	}

}
