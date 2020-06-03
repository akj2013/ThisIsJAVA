package ThreadSynchronized;

/**
 * 매개변수를 받은 메소드에서 필드에 매개변수를 공유 객체로서 저장한다.
 * 스레드가 실행되면 매개변수의 memory 값을 100으로 저장한다.
 * 
 * @author akjak
 *
 */
public class User1 extends Thread{
	private Calculator cal;

	public void setCalculator(Calculator cal) {
		this.setName("User1"); // 스레드 이름을 설정.
		this.cal = cal; // 공유 객체인 cal을 필드에 저장.
	}

	public void run() {
		cal.setMemory(100); // 공유 객체인 cal의 메모리에 100을 저장한다.
		cal.setMemory2(200); // 동기화된 메소드를 호출한다.
	}
}
