package Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Member 객체를 중복없이 저장하는 HashSet
 * 
 * @author akjak
 *
 */
public class HashSetEx2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30)); // 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장

		System.out.println("총 객체 수 : " + set.size());

		Set<innerBoard> set2 = new HashSet<innerBoard>();
		set2.add(new innerBoard("주제1", "내용1"));
		set2.add(new innerBoard("주제1", "내용1")); // 인스턴스가 다르기 때문에 객체가 저장된다.

		System.out.println("총 객체 수 : " + set2.size());
	}

}

// 테스트를 위한 이너 클래스
class innerBoard {
	String subject;
	String content;

	public innerBoard(String subject, String content) {
		this.subject = subject;
		this.content = content;
	}
}