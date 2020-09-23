package Collection_Search;

/**
 * 큐에 넣을 메세지 클래스
 * 
 * @author akjak
 *
 */
public class Message {
	public String command;
	public String to;

	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}

}
