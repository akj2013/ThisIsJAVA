package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * List 컬렉션은 저장 순서를 유지하지만, Set 컬렉션은 저장 순서가 유지되지 않는다.
 * 또한 객체를 중복해서 저장할 수 없고, 하나의 null만 저장할 수 있다.
 * 
 * @author akjak
 *
 */
public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); // HashSet 객체를 생성

		set.add("java");
		set.add("Jdbc");
		set.add("Servlet/JSP");
		// 동일한 객체는 한 번만 저장된다.
		if (set.add("java")) {
			
		} else {
			System.out.println("저장이 안 되면 false를 반환한다.");
		}
		set.add("iBatis");

		int size = set.size(); // 저장된 총 객체 수 얻기.
		System.out.println("총 객체 수 : " + size);

		Iterator<String> iterator = set.iterator(); // 반복자 얻기
		while (iterator.hasNext()) { // 객체 수 만큼 루핑
			String element = iterator.next(); // 한 개의 객체를 가져온다.
			System.out.println("\t" + element);
		}

		set.remove("Jdbc"); // 한 개의 객체 삭제.
		if (set.remove("Jdbc")) {
			
		} else {
			System.out.println("삭제가 안 되면 false를 반환한다.");
		}

		size = set.size(); // 저장된 총 객체 수 얻기.
		System.out.println("총 객체 수 : " + size);

		iterator = set.iterator(); // 반복자 얻기
		while (iterator.hasNext()) { // 객체 수 만큼 루핑
			String element = iterator.next(); // 한 개의 객체를 가져온다.
			System.out.println("\t" + element);
		}

		set.clear(); // 모든 객체를 제거하고 비운다.
		if (set.isEmpty()) { System.out.println("비어 있다."); }
		

	}

}
