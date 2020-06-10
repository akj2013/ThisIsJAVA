package ThreadGroup;

import java.util.Map;
import java.util.Set;

import ThreadDaemon.AutoSaveThread;

/**
 * 스레드의 그룹 정보를 확인한다.
 * 오토 세이브 스레드 객체를 생성한 후에 스레드를 실행시키고
 * 현재 프로세스의 모든 스레드에 대한 정보를 가져와서
 * 출력시킨다.
 * 
 * @author akjak
 *
 */
public class ThreadInfoEx {

	public static void main(String[] args) {
		// 오토 세이브 스레드 객체 생성.
		// 스레드 그룹을 명시하지 않으면 자신을 생성한 그룹과 같은 스레드 그룹으로 생성된다.
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("오토 세이브 스레드"); // 스레드의 이름을 명시한다.
		autoSaveThread.setDaemon(true); // 주 스레드의 보조역할을 하는 데몬 스레드로 만든다.

		// 스레드 실행.
		autoSaveThread.start();

		// 프로세스에서 실행하는 모든 스레드를 가져온다.
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();

		// 스레드를 하나씩 가져와서 루핑시킨다.
		for (Thread thread : threads) {
			System.out.println("스레드 이름 : " + thread.getName() + ((thread.isDaemon()) ? "(데몬)" : "(주)"));
			System.out.println("\t" + "소속 그룹 : " + thread.getThreadGroup().getName());
			System.out.println(); // 개행
		}

	}

}

/*
[스레드 그룹]
스레드 그룹은 관련된 스레드를 묶어서 관리할 목적으로 이용된다.
JVM이 실행되면 system 스레드 그룹을 만들고, JVM 운영에 필요한 스레드들을 생성해서 system 스레드 그룹에 포함시킨다.
그리고 system의 하위 스레드 그룹으로 main을 만들고 메인 스레드를 main 스레드 그룹에 포함시킨다.
스레드는 반드시 하나의 스레드 그룹에 포함되는데, 명시적으로 스레드 그룹에 포함시키지 않으면 기본적으로 자신을 생성한 스레드와
같은 스레드 그룹에 속하게 된다.
*/