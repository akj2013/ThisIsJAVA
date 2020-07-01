package Lambda;

/**
 * 로컬 변수 사용
 * Final 특성을 가지는 로컬 변수
 * 
 * 람다식은 메소드 내부에서 주로 작성되기 때문에 로컬 익명 구현 객체를 생성시킨다고 봐야 한다.
 * 람다식에서 바깥 클래스의 필드나 메소드는 제한 없이 사용할 수 있으나,
 * 메소드의 매개 변수 또는 로컬 변수를 사용하면 이 두 변수는 final 특성을 가져야 한다.
 * 매개 변수 또는 로컬 변수를 람다식에서 읽는 것은 허용되지만, 람다식 내부 또는 외부에서
 * 변경할 수 없다.
 * 
 * @author akjak
 *
 */
public class UsingLocalVariable {
	void method(int arg) { // arg는 final 특성을 가짐
		int localVal = 40; // localVal은 final 특성을 가짐
		
		// arg = 31; // final 특성 때문에 수정 불가
		// localVal = 41; // final 특성 때문에 수정 불가

		// 람다식
		UsingThisInterface func = () -> {
			// 로컬 변수 읽기
			System.out.println("arg : " + arg);
			System.out.println("localVal : " + localVal);
		};
		func.method();
		
	}
}
