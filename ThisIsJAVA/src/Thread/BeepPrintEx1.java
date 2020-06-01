package Thread;

import java.awt.Toolkit;

/**
 * 스레드를 사용하지 않고 테스트 소스를 작성한다.
 * 비프음이 모두 들리고 난 후에 문자가 입력된다.
 * 
 * @author akjak
 *
 */
public class BeepPrintEx1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기

		for (int i=0; i<5; i++) {
			toolkit.beep(); // 비프음 발생
			try {
				Thread.sleep(500); // 0.5초간 일시정지
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		for (int i=0; i<5; i++) {
			System.out.println("띵"); // 문자열 출력
			try {
				Thread.sleep(500); // 0.5초간 일시정지
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
