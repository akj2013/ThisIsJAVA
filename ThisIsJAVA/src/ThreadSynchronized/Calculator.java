package ThreadSynchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	/**
	 * 계산기 메모리에 값을 저장하는 메소드
	 * 동기화가 되어 있지 않기 때문에 여러 스레드들이 들어올 수 있다.
	 * 이에 따라 공유 객체의 값을 여러 스레드에서 변경할 수 있게 된다.
	 * 
	 * @param memory
	 */
	public void setMemory(int memory) {
		this.memory = memory; // 매개값을 memory 필드에 저장.
		try {
			Thread.sleep(2000); // 2초간 일시정지
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

	/**
	 * 동기화 된 메소드
	 * 하나의 스레드만 접근할 수 있으므로, 먼저 접근한 스레드가 사용을 종료할 때까지
	 * 다른 스레드가 접근할 수 없다.
	 * 
	 * @param memory
	 */
	public synchronized void setMemory2(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); // 2초간 일시정지
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

	/**
	 * 동기화 블록을 갖고 있는 메소드이다.
	 * 
	 * @param memory
	 */
	public void setMemory3(int memory) {
		synchronized(this) { // 공유 객체인 Calculator의 참조(잠금 대상)
			this.memory = memory;
			try {
				Thread.sleep(2000); // 2초간 일시정지
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}
	}
}
