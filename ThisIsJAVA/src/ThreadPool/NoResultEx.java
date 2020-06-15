package ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService; // 스레드풀 인터페이스
import java.util.concurrent.Executors; // 정적 메소드를 이용해 ExecutorService의 구현 객체를 만든다. 이것이 스레드풀이 된다.
import java.util.concurrent.Future; // 작업 결과가 아니라 작업이 완료될 때까지 기다렸다가 최종 결과를 얻는데 사용된다. 지연 완료 객체라고 한다.(pending completion)

/**
 * 리턴값이 없는 작업 완료 통보하는 메인 클래스
 * 
 * 리턴값이 없는 작업일 경우는 Runnable 객체로 생성하면 된다.
 * 
 * @author akjak
 *
 */
public class NoResultEx {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);
		System.out.println("최대 스레드 갯수 : " + Runtime.getRuntime().availableProcessors());

		System.out.println("--- 작업 처리 요청 ---");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for (int i = 0; i<=10; i++) {
					sum += i;
				}
				System.out.println("작업 처리 결과 : " + sum);
			}
		};

		/**
		 * 결과값이 없음에도 불구하고 Future 객체를 리턴하는데, 이는 스레드가 작업 처리를 정상적으로
		 * 완료했는지, 아니면 작업 처리 도중에 예외가 발생했는지 확인하기 위해서다.
		 */
		Future future = executorService.submit(runnable);

		try {
			future.get(); // 스레드가 작업을 완료할 때까지 블로킹되었다가 작업을 완료하면 처리 결과를 리턴한다.
			System.out.println("--- 작업 처리 완료 ---");
		} catch (InterruptedException e) {
			// 작업 처리 도중 스레드가 interrupt 될 경우 실행할 코드
		} catch (ExecutionException e) {
			// 작업 처리 도중 예외가 발생된 경우 실행할 코드
		}

		executorService.shutdown(); // 스레드풀 종료.
	}

}
