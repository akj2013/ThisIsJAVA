package ThreadState;

public class YieldEx {

	public static void main(String[] args) {
		YieldThreadA threadA = new YieldThreadA();
		YieldThreadB threadB = new YieldThreadB();

		// 스레드를 모두 실행시킨다.
		threadA.start();
		threadB.start();

		try { Thread.sleep(1000); } catch (InterruptedException e) { } // 1초간 일시정지
		threadA.work = false; // A 스레드를 양보시킨다. B 스레드만 실행 상태를 유지하고, A 스레드는 실행 대기 상태가 된다.

		try { Thread.sleep(1000); } catch (InterruptedException e) { } // 1초간 일시정지
		threadA.work = true; // A 스레드를 실행 상태로 변경시킨다.

		// 스레드를 모두 종료시킨다.
		try { Thread.sleep(1000); } catch (InterruptedException e) { } // 1초간 일시정지
		threadA.stop = true;
		threadB.stop = true;
	}

}
