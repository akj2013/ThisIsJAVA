package ThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService; // 스레드풀 인터페이스
import java.util.concurrent.Executors; // 스레드풀 구현 객체
import java.util.concurrent.Future;

/**
 * 리턴값이 있는 작업 완료 통보 메인 클래스
 * 
 * 스레드풀의 스레드가 작업을 완료한 후에 애플리케이션이 처리 결과를 얻어야 된다면,
 * 작업 객체를 Callable로 생성하면 된다.
 * 
 * @author akjak
 *
 */
public class ResultByCallableEx {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);

		System.out.println("--- 작업 처리 요청 ---");

		Callable<Integer> task = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 0; i<=10; i++) {
					sum += i;
				}
				System.out.println("작업 처리 결과 : " + sum);
				return sum; // 작업 처리 결과를 리턴한다.
			}
		};

		Future<Integer> future = executorService.submit(task); // 작업 큐에 Callable 객체를 저장하고 즉시 Future 객체를 리턴한다.

		try {
			int sum = future.get();
			System.out.println("future 객체의 처리 결과 : " + sum);
			System.out.println("--- 작업 처리 완료 ---");
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}

		executorService.shutdown(); // 스레드풀 종료.
	}

}
