package ThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 작업 완료 순으로 통보받는 메인 클래스.
 * 
 * @author akjak
 *
 */
public class CompletionSeviceEx {

	public static void main(String[] args) {
		// 스레드풀 생성.
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);

		/**
		 * 스레드풀에서 작업 처리가 완료된 것만 통보받는 방법으로 CompletionService를 이용할 수 있다.
		 * 
		 */
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);

		System.out.println("작업 처리 요청");
		for (int i=0; i<3; i++) {
			// 스레드풀에게 작업 처리를 요청한다.
			completionService.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for (int i=0; i<=10; i++) {
						sum += i;
					}
					return sum;
				}
			});
		}

		System.out.println("처리 완료된 작업 확인");
		executorService.submit(new Runnable() {
			// 스레드풀의 스레드에서 실행하도록 한다.
			@Override
			public void run() {
				while(true) {
					try {
						/**
						 * poll() : 완료된 작업의 Future를 가져옴. 완료된 작업이 없다면 즉시 null을 리턴함.
						 * take() : 완료된 작업의 Future를 가져옴. 완료된 작업이 없다면 있을 때까지 블로킹됨.
						 * 
						 */
						Future<Integer> future = completionService.take(); // 완료된 작업을 가져온다.
						int value = future.get();
						System.out.println("처리 결과 : " + value);
					} catch (Exception e) {
						break;
					}
				}
			}
		});

		// 3초 후 스레드풀을 종료.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			executorService.shutdown();
		}
	}

}
