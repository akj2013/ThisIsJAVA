package Thread;

import java.awt.Toolkit;

/**
 * 비프음을 들려주는 작업을 정의한다.
 * 인터페이스인 Runnable을 구현하는 클래스이다.
 * run() 내부의 내용이 스레드가 실행할 코드가 된다.
 * 
 * @author akjak
 *
 */
public class BeepTask implements Runnable {

	@Override
	public void run() {
		System.out.println("BeepTask 객체의 내용이 시작됩니다.");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); // 0.5초간 일시정지
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("BeepTask 객체의 내용이 완료되었습니다.");
	}

}
