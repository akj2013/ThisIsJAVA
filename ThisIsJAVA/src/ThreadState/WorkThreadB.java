package ThreadState;

public class WorkThreadB extends Thread {
	private WorkObject workObject;

	public WorkThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}

	public void run() {
		for (int i=0; i<10; i++) {
			workObject.methodB(); // 공유 객체의 메소드B를 10번 호출시킨다.
		}
	}

}
