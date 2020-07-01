package Lambda;

/**
 * [람다식에서의 this]
 * 
 * 일반적으로 익명 객체 내부에서 this는 익명 객체의 참조이지만,
 * 람다식에서 this는 내부적으로 생성되는 익명 객체의 참조가 아니라
 * 람다식을 실행한 객체의 참조이다.
 * 
 * @author akjak
 *
 */
public class UsingThis {
	public int outterField = 10;

	class Inner {
		int innerField = 20;
		
		void method() {
			// 람다식
			UsingThisInterface using = () -> {
				System.out.println("바깥 객체 : " + outterField);
				System.out.println("this를 사용한 바깥 객체 : " + UsingThis.this.outterField); // 바깥 객체의 참조를 얻기 위해서는 클래스명.this를 사용
				System.out.println("내부 객체 : " + innerField);
				System.out.println("this를 사용한 내부 객체 : " + this.innerField); // 람다식 내부에서 this는 Inner 객체를 참조
			};
			using.method();
		}
	}
}
