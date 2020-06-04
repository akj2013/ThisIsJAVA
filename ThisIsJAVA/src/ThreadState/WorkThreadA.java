package ThreadState;

public class WorkThreadA extends Thread {
	private WorkObject workObject;

	public WorkThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			workObject.methodA(); // 공유 객체의 메소드A를 10번 호출 시킨다.
		}
	}
}
