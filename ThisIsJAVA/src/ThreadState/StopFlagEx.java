package ThreadState;

public class StopFlagEx {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// do Nothing
		}

		printThread.setStop(true); // 스레드를 종료시키기 위해 stop 필드를 true로 변경한다.
	}

}
