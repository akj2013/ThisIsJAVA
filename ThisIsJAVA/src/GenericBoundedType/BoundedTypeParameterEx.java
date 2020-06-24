package GenericBoundedType;

public class BoundedTypeParameterEx {

	public static void main(String[] args) {
		int result1 = Util.compare(10, 20); // int -> Integer (자동 Boxing)
		System.out.println(result1); // -1이 반환된다.

		int result2 = Util.compare(4.5, 3); // double -> Double (자동 Boxing)
		System.out.println(result2); // 1이 반환된다.

		try {
			// String str = Util.compare("a", "b"); // String은 Number 타입이 아니다.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
[제한된 타입 파라미터]
타입 파라미터에 지정되는 구체적인 타입을 제한할 필요가 종종 있다.
예를 들어 숫자를 연산하는 제네릭 메소드는 매개값으로 Number 타입 또는 하위 클래스 타입의 인스턴스만
가져야 한다.
제한된 타입 파라미터를 선언하려면 타입 파라미터 뒤에 extends 키워드를 붙이고
상위 타입을 명시하면 된다. 
상위 타입은 클래스뿐만 아니라 인터페이스도 가능하다. implements는 사용하지 않는다.

public <T extends 상위타입> 리턴타입 메소드명 (매개변수, ...) { ... }

타입 파라미터에 지정되는 구체적인 타입은 상위 타입이거나 상위 타입의 하위 또는 구현 클래스만 가능하다.
주의할 점은 메소드의 중괄호 {} 안에서 타입 파라미터 변수로 사용 가능한 것은 상위 타입의 멤버(필드, 메소드)로 제한된다.
하위 타입에만 있는 필드와 메소드는 사용할 수 없다.

*/