package Collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * 아아디와 비밀번호 검사하기
 * 
 * Hashtable은 HashMap과 동일한 내부 구조를 가지고 있다. Hashtable도 키로 사용할 객체는
 * hashCode()와 equals() 메소드를 재정의해서 동등 객체가 될 조건을 정해야 한다. HashMap과
 * 차이점은 Hashtable은 동기화된 메소드로 구성되어 있기 때문에 멀티  스레드가 동시에 실행할 수는 없고,
 * 하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다.
 * 
 * @author akjak
 *
 */
public class HashtableEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scanner = new Scanner(System.in); // 키보드로부터 입력된 내용을 받기 위해 생성

		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = scanner.nextLine(); // 키보드로 입력한 아이디를 읽는다.

			System.out.println("비밀번호 : ");
			String password = scanner.nextLine(); // 키보드로 입력한 비밀번호를 읽는다.
			System.out.println();

			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				} 
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}

}
