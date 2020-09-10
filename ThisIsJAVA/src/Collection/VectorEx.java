package Collection;

import java.util.List;
import java.util.Vector;

/**
 * Board 객체를 저장하는 Vector
 * 
 * Vector는 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 이 메소드들을 실행할 수 없고,
 * 하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다. (Thread Safe)
 * 
 * @author akjak
 *
 */

public class VectorEx {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>(); // Board 객체를 타입 파라미터로 받는 벡터 생성.

		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

		list.remove(2); // 2번 인덱스 객체 삭제 (뒤의 인덱스는 1씩 앞으로 당겨짐)
		list.remove(2); // 위에서 3번이었던 객체가 삭제된다.

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}

	}

}
