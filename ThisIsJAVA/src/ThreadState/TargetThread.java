package ThreadState;

/**
 * 스레드의 상태를 확인하기 위한 타겟 클래스이다.
 * 처음 루핑으로 RUNNABLE 상태를 유지한 후
 * 1.5초간 TIMED_WAITING 상태를 유지한다.
 * 그리고 다시 RUNNABLE 상태로 전환한다.
 * 
 * 스레드의 상태 변화는 다음과 같다.
 * 
 * NEW / RUNNABLE / TIMED_WAITING / RUNNABLE / TERMINATED
 * 
 * @author akjak
 *
 */
public class TargetThread extends Thread {
	public void run() {
		for (long i=0; i<2000000000; i++) {
			// do Nothing
		}

		try {
			Thread.sleep(1500); // 1.5초간 일시정지
		} catch(Exception e) {
			e.printStackTrace();
		}

		for (long i=0; i<2000000000; i++) {
			// do Nothing
		}
	}

}
