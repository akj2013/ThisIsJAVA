package LambdaStandardAPI;

import java.util.function.BinaryOperator;

/**
 * minBy(), MaxBy() 정적 메소드
 * 각각 작은 것과, 큰 것을 리턴한다.
 * 
 * @author akjak
 *
 */
public class OperatorMinByMaxByEx {

	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;

		// 더 작은 것
		binaryOperator = BinaryOperator.minBy((f1,f2) -> Integer.compare(f1.price, f2.price) ); // f1이 작으면 음수, 같으면 0, 크면 양수
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 8000));
		System.out.println(fruit.name);

		// 더 큰 것
		binaryOperator = BinaryOperator.maxBy((f1,f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 8000));
		System.out.println(fruit.name);

	}

}
