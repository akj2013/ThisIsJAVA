package Generic;

/**
 * 비제네릭 타입을 이용할 떄와
 * 제네릭 타입을 이용할 때의 타입 변환을 확인한다.
 * 
 * 
 * @author akjak
 *
 */
public class BoxEx {

	public static void main(String[] args) {
		// ------------------- 비 제네릭 -------------------------
		Box box = new Box();
		box.set("홍길동"); 							// String -> Object (자동 타입 변환)
		String name = (String) box.get(); 	// Object -> String (강제 타입 변환)

		box.set(new Apple());					// Apple -> Object (자동 타입 변환)
		Apple apple = (Apple) box.get(); 	// Object -> Apple (강제 타입 변환)

		// ------------------- 제네릭 -------------------------
		BoxGeneric<String> boxG = new BoxGeneric<String>(); // 실제 클래스가 사용될 때 구체적인 타입을 지정함으로써 타입 변환을 최소화 시킨다.
		boxG.set("hello");
		String str = boxG.get(); // 캐스팅이 없다.

		BoxGeneric<Integer> boxG2 = new BoxGeneric<Integer>(); // 실제 클래스가 사용될 때 구체적인 타입을 지정함으로써 타입 변환을 최소화 시킨다.
		boxG2.set(6);
		int value = boxG2.get(); // 캐스팅이 없다.
	}

}

/*
[제네릭] 정의
Java 5부터 제네릭 타입이 새로 추가되었는데, 제네릭 타입을 이용함으로써 잘못된 타입이 사용될 수 있는
문제를 컴파일 과정에서 제거할 수 있게 되었다. 제네릭은 컬렉션, 람다식, 스트림, NIO에서 널리 사용되므로
확실히 이해해 두어야 한다. API 다큐먼트를 보면 제네릭 표현이 많기 때문에 제네릭을 이해하지 못하면
API 다큐먼트를 제대로 이해할 수 없다. 제네릭은 클래스와 인터페이스, 그리고 메소드를 정의할 때 타입을
파라미터로 사용할 수 있도록 한다. 타입 파라미터는 코드 작성 시 구체적인 타입으로 대체되어 다양한 코드를
생성하도록 해준다.

1. 컴파일 시 강한 타입 체크를 할 수 있다.
자바 컴파일러는 코드에서 잘못 사용된 타입 때문에 발생하는 문제점을 제거하기 위해 제네릭 코드에 대해
강한 타입 체크를 한다. 실행 시 타입 에러가 나는 것보다는 컴파일 시에 미리 타입을 강하게 체크해서
에러를 사전에 방지하는 것이 좋다.

2. 타입 변환(casting)을 제거한다.
비제네릭 코드는 불필요한 타입 변환을 하기 때문에 프로그램 성능에 악영향을 미친다. 제네릭을 사용하면
요소를 찾아올 때 타입 변환을 할 필요가 없어 프로그램 성능이 향상된다.

*/