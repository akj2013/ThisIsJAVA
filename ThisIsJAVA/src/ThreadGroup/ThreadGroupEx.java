package ThreadGroup;

/**
 * 스레드 그룹을 이용하여 일괄적으로 종료시킨다.
 * 
 * 
 * @author akjak
 *
 */
public class ThreadGroupEx {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup"); // 스레드 그룹의 이름을 명시하여 객체를 생성시킨다.

		// 스레드 객체를 생성한다.
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");

		// 스레드를 실행시킨다.
		workThreadA.start();
		workThreadB.start();

		System.out.println("메인 스레드 그룹의 list() 메소드 출력 내용입니다.");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup(); // 현재 스레드의 스레드 그룹을 객체로 만든다.
		mainGroup.list(); // [스레드 이름, 우선순위, 소속 그룹명] 순으로 콘솔창에 출력된다.
		System.out.println(); // 개행

		try {
			Thread.sleep(3000); // 3초간 일시정지 시킨다.
		} catch (InterruptedException e) {
			// do Nothing
		}

		System.out.println("myGroup 스레드 그룹의 interrupt() 메소드를 호출합니다.");
		myGroup.interrupt(); // 인터럽트 시키면 예외가 발생하여 스레드들이 종료된다.
	}

}
