package ThreadState;

public class WaitNotifyEx {

	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject(); // 공유 객체 생성

		WorkThreadA threadA = new WorkThreadA(sharedObject);
		WorkThreadB threadB = new WorkThreadB(sharedObject);

		threadA.start();
		threadB.start();

	}

}
