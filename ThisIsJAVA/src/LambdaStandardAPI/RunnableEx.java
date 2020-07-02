package LambdaStandardAPI;

/**
 * 함수적 인터페이스와 람다식
 * 
 * @author akjak
 *
 */
public class RunnableEx {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i=0; i<10; i++) {
				System.out.println(i);
			}
		};

		Thread thread = new Thread(runnable);
		thread.start();

		// Thread 생성자를 호출할 떄 다음과 같이 람다식을 매개값으로 대입해도 된다.
		Thread thread2 = new Thread(() -> {
			for (int i=0; i<10; i++) {
				System.out.println(i);
			}
		});

	}

}
/*
[표준 API]
자바에서 제공되는 표준 API에서 한 개의 추상 메소드를 가지는 인터페이스들은
모두 람다식을 이용해서 익명 구현 객체로 표현이 가능하다.
자바8부터는 빈번하게 사용되는 함수적 이너페이스는 java.util.function 표준 API 패키지에서 제공한다.
이 패키지에서 제공하는 함수적 인터페이스의 목적은 메소드 또는 생성자의 매개 타입으로 사용되어
람다식을 대입할 수 있도록 하기 위함이다. 자바 8부터 추가되거나 변경된 API에서 이 함수적 인터페이스들을
매개 타입으로 많이 사용한다.
Consumer : 매개값은 있고 리턴값은 없음
Supplier : 매개값은 없고 리턴값은 있음
Function : 매개값도 있고 리턴값도 있음 / 주로 매개값을 리턴값으로 매핑(타입 변환)
Operator : 매개값도 있고 리턴값도 있음 / 주로 매개값을 연산하고 결과를 리턴
Predicate : 매개값은 있고 리턴값은 boolean / 매개값을 조사해서 boolean을 리턴
*/