package Collection_Search;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap
 * 
 * TreeMap은 이진 트리를 기반으로 한 Map 컬렉션이다.
 * TreeSet과의 차이점은 키와 값이 저장된 Map.Entry를 저장한다는 점이다.
 * TreeMap에 객체를 저장하면 자동으로 정렬되는데, 기본적으로 부모 키값과 비교해서 키 값이 낮은 것은 왼쪽 자식 노드에,
 * 키 값이 높은 것은 오른쪽 자식 노드에 Map.Entry 객체를 저장한다.
 * 
 * @author akjak
 *
 */
public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");

		Map.Entry<Integer, String> entry = null;

		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getKey() + ", " + entry.getValue());

		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + ", " + entry.getValue());

		entry = scores.higherEntry(new Integer(95));
		System.out.println("95점 위의 점수 : " + entry.getKey() + ", " + entry.getValue());

		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95점 아래 점수 : " + entry.getKey() + ", " + entry.getValue());

		entry = scores.floorEntry(new Integer(95));
		System.out.println("95점 이거나 바로 아래 점수 : " + entry.getKey() + ", " + entry.getValue());

		entry = scores.ceilingEntry(new Integer(95));
		System.out.println("95점 이거나 바로 위의 점수 : " + entry.getKey() + ", " + entry.getValue());

		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry(); // 제일 낮은 Map.Entry를 꺼내오고 컬렉션에서 제거함
			System.out.println("남은 객체 수 : " + scores.size());
		}

		

	}

}
