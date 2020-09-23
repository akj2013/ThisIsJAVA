package Collection_Search;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue를 이용한 메세지 큐
 * 
 * Queue 인터페이스는 FIFO 자료구조에서 사용되는 메소드를 정의하고 있다.
 * FIFO : First In , First Out
 * Queue 인터페이스를 구현한 대표적인 클래스는 LinkedList이다. LinkedList는 List 인터페이스를
 * 구현했기 때문에 List 컬렉션이기도 하다. 
 * 
 * offer(E e) : 주어진 객체를 넣는다.
 * peek() : 객체 하나를 가져온다. 객체를 큐에서 제거하지 않는다.
 * poll() : 객체 하나를 가져온다. 객체를 큐에서 제거한다.
 * @author akjak
 *
 */
public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();

		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); // 메세지 큐에서 한 개의 메세지 꺼내고, 객체를 큐에서 제거한다.
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk" :
				System.out.println(message.to + "님에게 카톡을 보냅니다.");
				break;
			}
		}

	}

}
