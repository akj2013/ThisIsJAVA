package Thread;

/**
 * Thread 클래스를 상속받아 스레드의 이름을 변경한 클래스이다.
 * 변경된 스레드의 이름을 출력한다.
 * 
 * @author akjak
 *
 */
public class ThreadNameA extends Thread {
	public ThreadNameA() {
		setName("ThreadA"); // 스레드 이름 설정.
	}

	public void run() {
		for (int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용"); // 스레드 실행 내용.
		}
	}

}
