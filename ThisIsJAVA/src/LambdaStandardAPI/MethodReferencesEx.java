package LambdaStandardAPI;

import java.util.function.IntBinaryOperator;

/**
 * 정적 및 인스턴스 메소드 참조
 * 
 * @author akjak
 *
 */
public class MethodReferencesEx {

	public static void main(String[] args) {
		IntBinaryOperator operator;

		// 정적 메소드 참조
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1 : " + operator.applyAsInt(1, 2));

		operator = Calculator :: staticMethod; // 정적 메소드 참조
		System.out.println("결과2 : " + operator.applyAsInt(1, 2));

		// 인스턴스 메소드 참조
		Calculator cal = new Calculator(); // 인스턴스 메소드는 참조변수를 선언해야 한다.
		operator = (x, y) -> cal.instanceMethod(x, y);
		System.out.println("결과3 : " + operator.applyAsInt(3, 4));

		operator = cal :: instanceMethod; // 인스턴스 메소드 참조
		System.out.println("결과4 : " + operator.applyAsInt(3, 4));

	}

}
