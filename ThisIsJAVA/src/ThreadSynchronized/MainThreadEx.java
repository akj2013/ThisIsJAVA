package ThreadSynchronized;

/**
 * 공유 객체를 사용할 때 주의할 점
 * 
 * 
 * @author akjak
 *
 */
public class MainThreadEx {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		User1 user1 = new User1();
		user1.setCalculator(cal); // 공유 객체 설정
		user1.start(); // 스레드 시작

		User2 user2 = new User2();
		user2.setCalculator(cal); // 공유 객체 설정
		user2.run(); // 스레드 시작.

	}

}
