package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList
 * 
 * List 인터페이스의 구현 클래스로, ArrayList에 객체를 추가하면 객체가 인덱스로 관리된다.
 * 일반 배열은 생성할 때 크기가 고정되고 사용 중에 변경할 수 없지만,
 * ArrayList는 저장 용량을 초과한 객체들이 들어오면 자동적으로 저장 용량이 늘어난다.
 * ArrayList를 생성하기 위해서는 저장할 객체 타입을 타입 파라미터로 표기하고 기본 생성자를 호출하면 된다.
 * 
 * @author akjak
 *
 */
public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // String을 타입 파라미터로 받는 객체 생성.
		
		list.add("Java"); // String 객체 저장.
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 인덱스를 명시하여 저장.
		list.add("iBATIS");

		int size = list.size(); // 저장된 총 객체 수 얻기.
		System.out.println("총 객체 수 : " + size);
		System.out.println();

		String skill = list.get(2); // 2번 인덱스의 객체 얻기
		System.out.println("2번 인덱스 객체 : " + skill);
		System.out.println();

		for (String str : list) {
			System.out.println(str); // 저장된 총 객체 수만큼 루핑
		}
		System.out.println();

		list.remove(2); // 2번 인덱스의 객체 삭제.
		list.remove(2); // 위에서 3번이었던 객체가 2번으로 바뀌면서 삭제.
		list.remove("iBATIS"); // 객체 내용을 명시하여 삭제.

		for (String str : list) {
			System.out.println(str); // 저장된 총 객체 수만큼 루핑
		}
	}
}
