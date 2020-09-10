package Collection;

/**
 * 게시판 VO
 * 
 * @author akjak
 *
 */
public class Board {
	String subject;
	String content;
	String writer;

	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}
