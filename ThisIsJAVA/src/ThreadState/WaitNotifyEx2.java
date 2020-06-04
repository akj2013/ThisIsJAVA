package ThreadState;

/**
 * 생산자와 소비자 스레드를 이용하여 번갈아가며 작업하는 메인 스레드이다.
 * 공유 객체의 data 필드가 null인지에 따라 서로의 스레드가 일시 정지 상태로 가거나 실행 상태로 가도록 만든다.
 * 
 * @author akjak
 *
 */
public class WaitNotifyEx2 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox(); // 공유 객체 생성

		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);

		producerThread.start();
		consumerThread.start();

	}

}
