package Collection_Search;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap 정렬하기
 * 
 * @author akjak
 *
 */
public class TreeMapEx2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");

		// 내림차순으로 정렬된 map을 반환한다.
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		// 내림차순으로 정렬된 map의 EntrySet을 반환한다.
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		for (Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.println(entry.getKey() + "," + entry.getValue());
		}

		System.out.println();

		// 내림차순으로 정렬된 map의 내림차순을 반환한다. (오름차순)
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		for (Map.Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.println(entry.getKey() + "," + entry.getValue());
		}

	}

}
