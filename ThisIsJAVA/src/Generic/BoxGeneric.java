package Generic;

/**
 * 제네릭 타입을 이용한 클래스
 * 
 * 제네릭 타입은 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다.
 * 제네릭 타입은 클래스 또는 인터페이스 이름 뒤에 <> 부호가 붙고,
 * 사이에 타입 파라미터가 위치한다.
 * 
 * 기본 Box 클래스의 Object 타입을 모두 T로 대체했다.
 * T는 Box 클래스로 객체를 생성할 때 구체적인 타입으로 변경된다.
 * 
 * @author akjak
 *
 * @param <T>
 */
public class BoxGeneric<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
