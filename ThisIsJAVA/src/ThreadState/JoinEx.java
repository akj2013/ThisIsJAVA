package ThreadState;

public class JoinEx {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();

		try {
			sumThread.join(); // sumThread가 종료할 때까지 메인 스레드를 일시 정지시킨다.
		} catch (Exception e) {
			// do Nothing
		}

		System.out.println("합계 : " + sumThread.getSum());
	}

}
