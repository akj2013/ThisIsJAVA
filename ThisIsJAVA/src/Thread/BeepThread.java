package Thread;

import java.awt.Toolkit;

/**
 * Thread 클래스를 상속받고 run() 메소드를 재정의하여 스레드 내용을 만든다.
 * 
 * @author akjak
 *
 */
public class BeepThread extends Thread{ // Runnable 인터페이스를 구현하는 것이 아니라, Thread 클래스를 상속 받는 방법을 이용한다.
	@Override
	public void run() {
		System.out.println("작업 스레드 시작");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("작업 스레드 종료");
	}
}
