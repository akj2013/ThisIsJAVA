package LambdaStandardAPI;

import java.util.function.Function;

/**
 * Function의 순차적 연결
 * 
 * @author akjak
 *
 */
public class FunctionAndThenComposeEx {

	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;

		functionA = (m) -> m.getAddress(); // functionA의 람다식 저의
		functionB = (a) -> a.getCity(); // functionB의 람다식 정의

		// 인터페이스 A를 처리하고 결과를 인터페이스 B의 매개값으로 제공한다.
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(
				new Member("홍길동", "hong", new Address("한국", "서울"))
				);
		System.out.println("거주 도시 : " + city);

		// 인터페이스 A를 처리하고 결과를 인터페이스 B의 매개값으로 제공한다.
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(
				new Member("홍길동", "hong", new Address("한국", "서울"))
				);
		System.out.println("거주 도시 : " + city);

	}

}
