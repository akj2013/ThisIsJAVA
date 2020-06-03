package ThreadState;

/**
 * 상태 변화를 준 스레드를 받은 출력 스레드를 객체화하여 스레드를 실행시킨다.
 * 
 * @author akjak
 *
 */
public class ThreadStateEx {

	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}

}
