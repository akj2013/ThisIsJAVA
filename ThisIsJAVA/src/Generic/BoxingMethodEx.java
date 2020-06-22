package Generic;

/**
 * 제네릭 메소드 호출 클래스
 * @author akjak
 *
 */
public class BoxingMethodEx {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		boolean result1 = Util.<Integer, String>compare(p1, p2); // 구체적인 타입을 명시적으로 지정한다.
		if (result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}

		Pair<String, String> p3 = new Pair<String, String>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<String, String>("user2", "홍길동");
		boolean result2 = Util.compare(p3, p4); // 구체적인 타입을 추정한다.
		if (result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}

	}

}

/*
[제네릭 메소드(<T, R> R method(T t))]
제네릭 메소드는 매개 타입과 리턴 타입으로 타입 파라미터를 갖는 메소드를 말한다.
제네릭 메소드를 선언하는 방법은 리턴 타입 앞에 <> 기호를 추가하고 타입 파라미터를 기술한 다음,
리턴 타입과 매개 타입으로 타입 파라미터를 사용하면 된다.

public <타입 파라미터,...> 리턴타입 메소드명(매개변수,...) { ... }

제네릭 메소드는 두 가지 방식으로 호출할 수 있다.
코드에서 타입 파라미터의 구체적인 타입을 명시적으로 지정해도 되고, 컴파일러가 매개값의 타입을 보고 구체적인 타입을 추정하도록 할 수도 있다.

리턴타입 변수 = <구체적타입> 메소드명(매개값); 	// 명시적으로 구체적 타입을 지정
리턴타입 변수 = 메소등명(매개값); 					// 매개값을 보고 구체적 타입을 지정
*/