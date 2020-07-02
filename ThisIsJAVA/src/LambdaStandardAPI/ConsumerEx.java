package LambdaStandardAPI;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.*;

/**
 * 람다식 표준 API의 Consumer 함수적 인터페이스
 * 
 * 리턴값이 없는 accept() 메소드를 가지고 있다.
 * accept() 메소드는 단지 매개값을 소비하는 역할만 한다.
 *
 * @author akjak
 *
 */
public class ConsumerEx {
	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + 8);
		consumer.accept("자바");

		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("JAVA", "8");

		DoubleConsumer doubleConsumer = d -> System.out.println("java" + d);
		doubleConsumer.accept(8.0);

		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("자바", 8);
	}
}
