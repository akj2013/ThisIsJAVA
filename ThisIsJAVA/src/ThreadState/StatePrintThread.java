package ThreadState;

/**
 * 스레드의 상태를 출력하는 클래스이다.
 * 매개변수로 받은 스레드의 상태를 0.5초 간격으로 출력한다.
 * 
 * @author akjak
 *
 */
public class StatePrintThread extends Thread {

	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); // 스레드 상태 얻기
			System.out.println("타겟 스레드 상태 : " + state);

			// 객체 생성 상태일 경우, 실행 대기 상태로 만듦.
			if (state == Thread.State.NEW) {
				targetThread.start(); 
			}

			// 종료 상태일 경우, while문을 종료한다.
			if (state == Thread.State.TERMINATED) {
				break;
			}

			try {
				Thread.sleep(500); // 0.5초간 일시 정지
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
