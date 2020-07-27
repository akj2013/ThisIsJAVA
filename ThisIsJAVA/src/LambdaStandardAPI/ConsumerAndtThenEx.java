package LambdaStandardAPI;

import java.util.function.Consumer;

/**
 * Consumer 메인 클래스
 * 
 * Consumer의 순차적 연결을 실행한다. AndThen을 이용한다.
 * 
 * @author akjak
 *
 */
public class ConsumerAndtThenEx {
	public static void main(String[] args) {
		// 매개변수로 받은 Member의 name을 출력한다.
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA : " + m.getName());
		};

		// 매개변수로 받은 Member의 id를 출력한다.
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB : " + m.getId());
		};

		// A를 먼저 실행하고 B를 실행한다.
		Consumer<Member> consumerAB = consumerA.andThen(consumerB); 
		consumerAB.accept(new Member("홍길동", "akj2013", null));
	}

}
