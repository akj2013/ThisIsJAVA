package LambdaStandardAPI;

import java.util.function.ToIntBiFunction;

/**
 * 매개 변수의 메소드 참조
 * 두 문자열이 대소문자와 상관없이 동일한 알파벳으로 구성되어 있는지 비교한다.
 * 
 * @author akjak
 *
 */
public class ArgumentMethodReferencesEx {

	public static void main(String[] args) {
		// 함수적 인터페이스 : 두 String 매개값을 받고 int 값을 리턴한다.
		ToIntBiFunction<String, String> function;

		function = (a, b) -> a.compareToIgnoreCase(b); // 람다식을 이용
		print(function.applyAsInt("Java8", "JAVA8")); 

		function = String :: compareToIgnoreCase; // 메소드 참조
		print(function.applyAsInt("java8", "JAVA8"));
	}

	public static void print(int order) {
		if(order < 0) {
			System.out.println("사전순으로 먼저 옵니다.");
		} else if (order == 0) {
			System.out.println("동일한 문자열입니다.");
		} else {
			System.out.println("사전순으로 나중에 옵니다.");
		}
	}
}
