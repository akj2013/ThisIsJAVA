package Thread;

/**
 * Runnable 인터페이스를 구현한 클래스이다.
 * 스레드의 기본 이름을 출력한다.
 * 
 * @author akjak
 *
 */
public class ThreadNameB implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "가 출력한 내용"); // 스레드 실행 내용.
		
	}

}
