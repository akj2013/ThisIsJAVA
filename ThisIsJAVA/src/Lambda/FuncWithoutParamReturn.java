package Lambda;

/** 
 * [함수적 인터페이스]
 * 모든 인터페이스를 람다식의 타겟 타입을 사용할 수는 없다.
 * 람다식이 하나의 메소드를 정의하기 때문에 두 개 이상의 추상 메소드가 선언된 인터페이스는
 * 람다식을 이용해서 구현 객체를 생성할 수 없다.
 * 하나의 추상 메소드가 선언된 인터페이스만이 람다식의 타겟 타입이 될 수 있는데, 
 * 이러한 인터페이스를 함수적 인터페이스라고 한다.
 * 
 * 어노테이션을 붙여주면 두 개 이상의 추상 메소드를 선언했을 때 컴파일 오류를 발생시킨다.
 * 이 어노테이션이 없더라도 하나의 추상 메소드만 있다면 모두 함수적 인터페이스이다.
 * 
 * */
@FunctionalInterface
public interface FuncWithoutParamReturn {
	/**
	 * 매개 변수와 리턴값이 없는 람다식
	 * 
	 * FuncWithoutParamReturn func = () -> { ... }
	 * func.funcWithoutParamReturn();
	 */
	public void funcWithoutParamReturn();
}

