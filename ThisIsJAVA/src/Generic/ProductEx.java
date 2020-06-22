package Generic;

/**
 * 멀티 타입 파라미터를 가진 클래스의 객체 생성
 * 
 * @author akjak
 *
 */
public class ProductEx {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		Tv tv = product1.getKind(); // 위에서 이미 Tv로 전환해 주었으므로 형변환이 없다.

		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind(); // 위에서 이미 Car로 전환해 주었으므로 형변환이 없다.
		
		// ------------ 자바 7부터 ---------------
		/**
		 *  
		 * 제네릭 타입 변수 선언과 객체 생성을 동시에 할 때 타입 파라미터 자리에 구체적인
		 * 타입을 지정하는 코드가 중복해서 나와 다소 복잡해질 수 있다. 자바 7부터 제네릭 타입
		 * 파라미터의 중복 기술을 줄이기 위해 다이아몬드 연산자를 제공한다. 자바 컴파일러는 타입
		 * 파라미터 부분에 <> 연산자를 사용하면 타입 파라미터를 유추해서 자동으로 설정해준다. 
		 */
		Product<Tv, String> product3 = new Product<>();
		Product<Car, String> product4 = new Product<>();
	}

}
