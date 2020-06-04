package ThreadState;

public class DataBox {
	private String data;

	public synchronized String getData() {
		if (this.data == null) {
			try {
				wait(); // 스레드를 일시 정지 상태로 만듦.
			} catch (InterruptedException e) {
				// do Nothing
			}
		}
		String returnValue = data;
		System.out.println("소비자 스레드가 읽은 데이터 : " + returnValue);

		data = null; // 데이터 초기화
		notify(); // 스레드를 실행 대기 상태로 만듦.
		return returnValue;
	}

	public synchronized void setData(String data) {
		if (this.data != null) {
			try {
				wait(); // 스레드를 일시 정지 상태로 만듦.
			} catch (InterruptedException e) {
				// do Nothing
			}
		this.data = data;
		System.out.println("생산자 스레드가 생성한 데이터 : " + data);
		notify(); // 스레드를 실행 대기 상태로 만듦.
		}
	}
}
