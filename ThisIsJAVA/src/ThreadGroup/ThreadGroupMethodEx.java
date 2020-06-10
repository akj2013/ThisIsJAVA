package ThreadGroup;

/**
 * 스레드 그룹이 갖고 있는 메소드들을 실행시켜 보는 클래스이다.
 * 
 * @author akjak
 *
 */
public class ThreadGroupMethodEx {

	public static void main(String[] args) {
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup(); // 메인 스레드 그룹
		ThreadGroup testGroup = new ThreadGroup("테스트 스레드 그룹");
		WorkThread testThread = new WorkThread(testGroup, "테스트 스레드");

		// 현재 그룹 및 하위 그룹에서 활동 중인 모든 스레드의 수를 리턴한다.
		System.out.println("활동 중인 스레드의 수 : " + mainGroup.activeCount());

		// 현재 그룹에서 활동 중인 모든 하위 그룹의 수를 리턴한다.
		System.out.println("활동 중인 하위 스레드 그룹 수 : " + mainGroup.activeGroupCount());

		// 현재 스레드가 스레드 그룹을 변경할 권한이 있는지 체크한다. 만약 없으면 SecurityException을 발생시킨다.
		try {
			mainGroup.checkAccess();
			System.out.println("권한 있음");
		} catch (SecurityException e) {
			System.out.println("권한 없음");
		}

		// 현재 그룹 및 하위 그룹을 모두 삭제한다. 단, 그룹 내에 포함된 모든 스레드들이 종료 상태가 되어야 한다.
		testThread.start();
		System.out.println("삭제 전 스레드 갯수 : " + testGroup.activeCount());
		testThread.interrupt();
		try {
			testGroup.destroy();
		} catch (IllegalThreadStateException e) {
			// do Nothing
		}
		System.out.println("삭제 후 스레드 갯수 : " + testGroup.activeCount());
	}

}
