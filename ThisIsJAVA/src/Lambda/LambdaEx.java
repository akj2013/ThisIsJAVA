package Lambda;

public class LambdaEx {
	public static void main(String[] args) {
		// 매개변수와 리턴값이 없는 람다식
		FuncWithoutParamReturn func1;
		func1 = () -> {
			String str = "매개변수와 리턴값이 없는 람다식";
			System.out.println(str);
		};
		func1.funcWithoutParamReturn();

		func1 = () -> {
			System.out.println("매개변수와 리턴값이 없는 람다식");
		};
		func1.funcWithoutParamReturn();

		// 매개 변수가 있는 람다식
		FuncWithoutReturn func2;
		func2 = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		func2.funcWithoutReturn(2);

		func2 = x -> System.out.println(x*5); // 매개 변수가 하나일 경우에는 괄호를 생략할 수 있다.
		func2.funcWithoutReturn(5);

		// 리턴값이 있는 람다식
		FuncWithParamReturn func3;
		func3 = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(func3.funcWithParamReturn(7, 1));

		func3 = (x, y) -> { return x + y; };
		System.out.println(func3.funcWithParamReturn(1, 7));

		func3 = (x, y) -> x + y; // return 문만 있을 경우 중괄호와 리턴문 생략 가능
		System.out.println(func3.funcWithParamReturn(3, 4));

		func3 = (x, y) -> sum(x, y); // return 문만 있을 경우 중괄호와 리턴문 생략 가능
		System.out.println(func3.funcWithParamReturn(4, 3));
	}

	private static int sum(int x, int y) {
		return x + y;
	}
}

/*
[람다식 특징]
람다식의 특징 : 자바 코드가 매우 간결해지고, 컬렉션의 요소를 필터링하거나 매핑해서 원하는 결과를 쉽게 집계할 수 있다.
람다식은 "(매개변수) -> {실행코드}" 형태로 작성되는데, 마치 함수 정의 형태를 띠고 있지만
런타임 시에는 인터페이스의 익명 구현 객체로 생성된다. 어떤 인터페이스를 구현할 것인가는 대입되는
인터페이스가 무엇이냐에 달려있다.

[람다식 기본 문법]

(타입 매개변수, ...) -> {실행문; ...}
오른쪽 중괄호 블록을 실행하기 위해 필요한 값을 제공하는 역할 한다.
매개변수의 이름은 개발자가 자유롭게 줄 수 있다.

*/