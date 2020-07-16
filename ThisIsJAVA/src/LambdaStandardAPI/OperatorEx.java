package LambdaStandardAPI;

import java.util.function.IntBinaryOperator;

/**
 * Operator 함수적 인터페이스
 * 
 * @author akjak
 *
 */
public class OperatorEx {

		public static int[] scores = { 92, 50, 30 };
		
		// operator를 매개변수로 가지기 때문에 이 메소드를 호출할 때 람다식을 사용할 수 있다.
		public static int maxOrMin(IntBinaryOperator operator) {
			int result = scores[0];
			for(int score : scores) {
				result = operator.applyAsInt(result, score); // 람다식{} 실행
			}
			return result;
		}

	// 메인 실행문
	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin(
			(a, b) -> {
				if (a>=b) return a;
				else return b;
			}
		);
		System.out.println("최대값 : " + max);
		
		// 최소값 얻기
		int min = maxOrMin(
			(a, b) -> {
				if (a<=b) return a;
				else return b;
			}
		);
		System.out.println("최소값 : " + min);
	}
}

/*
 * Operator 함수적 인터페이스
 * 
 * Operator 함수적 인터페이스는 Function과 동일하게 매개 변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다.
 * 하지만 이 메소드들은 리턴값으로 매핑하는 역할보다는 매개값을 이용해서 연산을 수행한 후 동일한 타입으로 리턴값을 제공하는 역할을 한다.
 * 
 * 
*/