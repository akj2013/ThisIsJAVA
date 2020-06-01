package Thread;

/**
 * Thread 클래스를 상속받은 클래스 객체를 이용하여 작업 스레드를 실행한다.
 * 
 * @author akjak
 *
 */
public class BeepPrintEx3 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		Thread thread = new BeepThread();
		thread.start(); // 재정의한 run() 메소드의 스레드 내용을 시작시킨다.

		for (int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("메인 종료");

	}

}
