package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 스트림이 제공하는 대부분의 요소 처리 메소드는 함수적 인터페이스 매개 타입을 가지기 때문에
 * 람다식 또는 메소드 참조를 이용해서 요소 처리 내용을 매개값으로 전달할 수 있다.
 * 
 * 
 *   [함수적 인터페이스]
 * 모든 인터페이스를 람다식의 타겟 타입으로 사용할 수는 없다.
 * 람다식이 하나의 메소드를 정의하기 때문에 두 개 이상의 추상 메소드가 선언된 인터페이스는
 * 람다식을 이용해서 구현 객체를 생성할 수 없다.
 * 하나의 추상 메소드가 선언된 인터페이스만이 람다식의 타겟 타입이 될 수 있는데,
 * 이러한 인터페이스를 함수적 인터페이스라고 한다.
 * 
 * @FuncionalInterface를 함수적 인터페이스에 붙여주면
 * 두 개 이상의 추상 메소드를 선언했을 때 컴파일 오류를 발생시킨다.
 * 물론, 이 어노테이션이 없더라도 하나의 추상 메소드만 있으면 모두 함수적 인터페이스이다.
 * @author akjak
 *
 */
public class LambdaExpressionEx {

	public static void main(String[] args) {
		List<StudentVO> list = Arrays.asList(new StudentVO("홍길동", 90), new StudentVO("이순신", 100));

		// 스트림 객체를 생성
		Stream<StudentVO> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + " : " + score); // List 컬렉션에서 Student를 가져와 람다식의 매개값으로 제공한다.
		});

	}

}
