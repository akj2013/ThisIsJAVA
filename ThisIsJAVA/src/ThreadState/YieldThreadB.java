package ThreadState;

/**
 * 실행양보 테스트 스레드이다.
 * 외부에서 플래그를 설정하여 실행 양보 시키거나, 종료시킬 수 있다.
 * 실행 양보 플래그 : work
 * 종료 플래그 : stop
 * 
 * @author akjak
 *
 */
public class YieldThreadB extends Thread {
	public boolean stop = false; // 종료 플래그
	public boolean work = true; // 작업 진행 여부 플래그

	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("B 스레드가 실행 중입니다.");
			} else {
				Thread.yield(); // 다른 스레드에게 실행 양보
			}
		}
		System.out.println("B 스레드를 종료합니다.");
	}
}
