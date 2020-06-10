package ThreadPool;

import java.util.concurrent.ExecutorService; // 스레드풀 인터페이스
import java.util.concurrent.Executors; // 정적 메소드를 이용해 ExecutorService의 구현 객체를 만든다. 이것이 스레드풀이 된다.
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecuteEx {

	public static void main(String[] args) {

		// 스레드풀 생성
		/**
		 * ThreadPoolExecutor
		 * 직접 코어 스레드 개수와 최대 스레드 개수를 설정할 수 있는 스레드풀 객체를 생성한다.
		 */
		ExecutorService threadPool = new ThreadPoolExecutor(
				3, // 코어 스레드 개수
				100, // 최대 스레드 개수
				120L, // 놀고 있는 시간
				TimeUnit.SECONDS, // 놀고 있는 시간의 단위
				new SynchronousQueue<Runnable>() // 작업 큐
				);

		/**
		 * newFixedThreadPool(nThreads)
		 * 생성된 스레드풀의 초기 스레드 개수는 0개이고, 코어 스레드 수는 nThreads이다.
		 * 스레드 개수보다 작업 개수가 많으면 새 스레드를 생성시키고 작업을 처리한다.
		 * 최대 스레드 개수는 매개값으로 준 nThreads이다.
		 * 이 스레드풀은 스레드가 작업을 처리하지 않고 놀고 있어도 스레드 개수가 줄지 않는다.
		 */
		ExecutorService executorService = Executors.newFixedThreadPool(2); // 최대 스레드 가 2개인 스레드풀 생성한다.

		// 스레드풀의 작업 정의
		for (int i=0; i<10; i++) {
			/**
			 * Runnable
			 * 하나의 작업을 구현하는 클래스이다.
			 * Runnable의 run() 메소드는 리턴값이 없다.
			 */
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					// 스레드 총 개수 및 작업 스레드 이름을 출력시킨다.
					/**
					 * newFixedThreadPool() 메소드도 내부적으로 ThreadPoolExecutor 객체를 생성해서 리턴하기 때문에
					 * 형변환이 가능하다.
					 */
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize(); // 총 스레드 개수
					String threadName = Thread.currentThread().getName(); // 작업 스레드 이름
					System.out.println("총 스레드 개수 : " + poolSize + ", 작업 스레드 이름 : " + threadName);

					// 인위적으로 예외를 발생시킨다.
					int error = Integer.parseInt("삼");
				}
			};

			// 작업 처리 요청
			/**
			 * execute()는 작업 처리 결과를 받지 못하고 작업 처리 도중 예외가 발생하면 스레드가 종료되고 해당 스레드는 스레드풀에서 제거된다.
			 * submit()은 작업 결과를 받을 수 있고 예외가 발생하더라도 스레드는 종료되지 않고 다음 작업을 위해 재사용된다.
			 * 따라서 스레드의 생성 오버헤더를 줄이기 위해서 submit()을 사용하는 것이 좋다.
			 */
			executorService.execute(runnable);
			Future<?> result = executorService.submit(runnable); 
			
			try {
				Thread.sleep(10); // 콘솔에 출력 시간을 주기 위해 0.01초 일시 정지 시킨다.
			} catch (InterruptedException e) {
				// do Nothing
			}
		}

		executorService.shutdown(); // 스레드풀 종료.
//		executorService.shutdownNow(); // 남아있는 작업과 상관없이 강제 종료할 수 있다.
	}

}

/*
 *[스레드풀 정의]
 *병렬 작업 처리가 많아지면 스레드 개수가 증가되고 그에 따른 스레드 생성과 스케줄링으로 인해 CPU가 바빠져 메모리 사용량이 늘어난다.
 *따라서 어플리케이션의 성능이 저하된다. 갑작스런 병렬 작업의 폭증으로 인한 스레드의 폭증을 막으려면 스레드풀을 사용해야 한다.
 *스레드풀은 작업 처리에 사용되는 스레드를 제한된 개수만큼 정해 놓고 작업 큐에 들어오는 작업들을 하나씩 스레드가 맡아 처리한다.
 *작업 처리가 끝난 스레드는 다시 작업 큐에서 새로운 작업을 가져와 처리한다.
 *그렇기 때문에 작업 처리 요청이 폭증되어도 스레드의 전체 개수가 늘어나지 않으므로 어플리케이션의 성능이 급격히 저하되지 않는다.
 * 
 * [스레드풀 종료]
 * 스레드풀의 스레드는 기본적으로 데몬 스레드가 아니기 때문에 main 스레드가 종료되더라도 작업을 처리하기 위해 계속 실행 상태로 남아있다.
 * 그래서 main() 메소드가 실행이 끝나도 어플리케이션 프로세스는 종료되지 않는다.
 * 남아있는 작업을 마무리하고 스레드풀을 종료할 때에는 shutdown()을 일반적으로 호출하고,
 * 남아있는 작업과는 상관없이 강제로 종료할 때에는 shutdownNow()를 호출한다.
*/
