package ThreadDaemon;

public class DaemonThreadEx {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); // 데몬 스레드로 만듦.
		autoSaveThread.start();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// do Nothing
		}
		System.out.println("메인 스레드 종료");

	}

}
