package ThreadGroup;

/**
 * InterruptedException이 발생할 때 종료되는 스레드이다.
 * 명시된 생성자로 스레드 그룹과 스레드 이름을 받아서 객체를 생성한다.
 * 
 * @author akjak
 *
 */
public class WorkThread extends Thread {
	
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName); // 스레드 그룹과 이름 설정한다.
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000); // 1초간 일시정지 시킨다.
			} catch(InterruptedException e) {
				// 예외가 발생하면 루핑을 종료한다.
				System.out.println(getName() + " 객체에 interruptedException이 발생하였습니다.");
				break;
			}
		}
		System.out.println(getName() + " 객체 스레드가 종료됩니다.");
	}
}
