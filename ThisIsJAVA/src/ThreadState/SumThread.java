package ThreadState;

/**
 * 스레드가 실행되면 1부터 100까지 더해서 저장한다.
 * 
 * @author akjak
 *
 */
public class SumThread extends Thread {
	private long sum; // 총 합계

	public void run() {
		// 1부터 100까지 더해서 sum에 저장한다.
		for(int i=0; i<=100; i++) {
			sum += i;
		}
	}

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
}
