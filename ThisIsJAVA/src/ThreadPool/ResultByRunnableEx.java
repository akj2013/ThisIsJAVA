package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 작업 처리 결과를 외부 객체에 저장하는 메인 클래스
 * 
 * @author akjak
 *
 */
public class ResultByRunnableEx {

	public static void main(String[] args) {
		// 스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);

		System.out.println("--- 작업 처리 요청 ---");

		class Task implements Runnable {
			Result result; // 외부로부터 주입받는 객체이다.

			Task(Result result) {
				this.result = result; // 외부 Result 객체를 필드에 저장한다.
			}

			@Override
			public void run() {
				int sum = 0;
				for (int i = 0; i<=10; i++) {
					sum += i;
				}
				result.addValue(sum); // Result 객체에 작업 결과를 저장한다.
			}
		}

		// 두 가지 작업 처리를 요청.
		Result result = new Result();
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		Future<Result> future1 = executorService.submit(task1, result);
		Future<Result> future2 = executorService.submit(task2, result);

		try {
			result = future1.get();
			result = future2.get();
			System.out.println("처리 결과 : " + result.accumValue);
			System.out.println("--- 작업 처리 완료 ---");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("실행 예외 발생 : " + e.getMessage());
		}

		// 스레드풀 종료
		executorService.shutdown();
	}
}

/**
 * 처리 결과를 저장하는 Result 클래스
 * 
 * @author akjak
 *
 */
class Result {
	int accumValue;
	synchronized void addValue(int value) {
		accumValue += value;
	}
}
