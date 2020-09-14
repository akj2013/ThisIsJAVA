package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 이름을 키로 점수를 값으로 저장하기
 * 
 * HashMap의 키로 사용할 객체는 hashCode()와 equals() 메소드를 재정의해서 동등 객체가 될 조건을 정해야 한다.
 * 동등 객체, 즉 동일한 키가 될 조건은 hashCode()의 리턴값이 같아야 하고, equals() 메소드가 true를 리턴해야 한다.
 * 
 * 키와 값의 타입은 기본 타입(byte, short, int, float, double, boolean, char)을 사용할 수 없고,
 * 클래스 및 인터페이스 타입만 가능하다.
 * 
 * @author akjak
 *
 */
public class HashMapEx1 {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체 저장
		map.put("홍길동", 90);
		map.put("임꺽정", 98);
		map.put("동장군", 70);
		map.put("이순신", 50);
		System.out.println("총 Entry 수 : " + map.size()); // 저장된 총 Entry 수 얻기

		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();

		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value); // 반복해서 키를 얻고 값을 map에서 얻어냄
		}
		System.out.println();

		// 객체 삭제
		map.remove("홍길동"); // 키로 Map.Entry 제거
		System.out.println("총 Entry 수 : " + map.size());

		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.EntrySet 얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value); // 반복해서 Map.Entry를 얻고 키와 값을 얻어냄.
		}
		System.out.println();

		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());

	}

}
