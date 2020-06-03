package ThreadSynchronized;

/**
 * Runnable 클래스의 구현 클래스이다.
 * 
 * @author akjak
 *
 */
public class User2 implements Runnable {
	private Calculator cal;

	public void setCalculator(Calculator cal) {
		this.cal = cal; // 공유 객체인 cal을 필드에 저장.
	}

	@Override
	public void run() {
		cal.setMemory(50); // 공유 객체인 cal의 메모리에 50을 저장.
		cal.setMemory2(300); // 동기화된 메소드를 호출한다.
	}

}
