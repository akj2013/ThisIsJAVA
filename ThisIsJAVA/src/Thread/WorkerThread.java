package Thread;

/**
 * 작업 스레드가 실행할 작업을 Runnable로 만들지 않고, Thread의 하위 클래스로 작업 스레드를 정의하면서
 * 작업 내용을 포함시킬 수도 있다.
 * Thread 클래스를 상속한 후 run 메소드를 재정의해서 스레드를 실행할 코드를 작성하면 된다.
 * 
 * @author akjak
 *
 */
public class WorkerThread extends Thread {
	@Override
	public void run() {
		// 스레드 실행 내용.
	}
	Thread thread = new WorkerThread();

	// -------------------------------------
	// 익명 객체를 이용한다.
	Thread thread2 = new Thread() {
		public void run() {
			// 스레드 실행 내용.
		}
	};
}
