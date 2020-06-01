package Thread;

/**
 * 스레드의 이름을 가져오거나 변경하는 내용이다.
 * 메인 스레드의 이름을 출력하고,
 * 객체로 받아온 두 개의 스레드의 이름을 출력한다.
 * 
 * @author akjak
 *
 */
public class ThreadNameEx {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); // 이 코드를 실행하는 스레드 객체 얻기.
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName()); // 스레드 이름 출력.

		// Thread 상속 객체
		Thread threadA = new ThreadNameA();
		System.out.println("Thread 상속 객체 : " + threadA.getName()); // 스레드 이름 출력.

		// Runnable 구현 객체
		Runnable runnable = new ThreadNameB(); // Runnable 객체를 생성한다.
		Thread threadB = new Thread(runnable);
		System.out.println("Runnable 구현 객체 : " + threadB.getName()); // 스레드 이름 출력.

		// Runnable 익명 구현 객체
		Thread threadC = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.print("Runnable 익명 구현 객체 : ");
			}
		});
		threadC.setName("Runnable을 구현한 익명 객체의 이름");
		System.out.print(threadC.getName());

		System.out.println(); // 개행

		// 람다식 이용
		Thread threadD = new Thread(() -> {
			Thread.currentThread().setName("람다식을 이용한 객체의 이름");
			System.out.print("람다식 이용 객체 : ");
		});
		threadD.setName("threadD");
		System.out.println(threadD.getName());
		
	}

}
