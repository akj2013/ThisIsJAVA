package Thread;

/**
 * 메인 스레드와 작업 스레드가 동시에 실행되는 메인 클래스이다.
 * 스레드 내용을 구현한 클래스의 객체로 작업 스레드를 생성한다.
 * 
 * 
 * @author akjak
 *
 */
public class BeepPrintEx2 {

	public static void main(String[] args) {
		System.out.println("메인 스레드가 시작됩니다.");
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); // 작업 스레드 객체를 직접 생성하려면 Runnable을 매개값으로 갖는 생성자를 호출해야 한다.
		// 작업 스레드의 시작
		thread.start(); // beppTask 객체의 run() 내용이 실행된다.

		// 메인 스레드는 계속 진행된다.
		for (int i=0; i<5; i++) {
			System.out.println("땡");
			try {
				Thread.sleep(500); // 0.5 초간 일시정지.
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("메인 스레드가 종료됩니다.");
		// --------------------------------------------------------------------------
		// Runnable 익명 객체 이용
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// 스레드 실행 내용
			}
		});

		// 람다식 이용
		Thread thread3 = new Thread(() -> {
			// 스레드 실행 내용.
		});
	}

}
