package Collection_Search;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * TreeMap 키로 정렬하고 범위 검색하기
 * 
 * @author akjak
 *
 */
public class TreeMapEx3 {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("apple", new Integer(10));
		treeMap.put("forever", new Integer(60));
		treeMap.put("desc", new Integer(40));
		treeMap.put("zoo", new Integer(50));
		treeMap.put("base", new Integer(10));
		treeMap.put("guess", new Integer(20));
		treeMap.put("cherry", new Integer(70));
		treeMap.put("bell", new Integer(30)); // 같은 b로 시작하면 어떻게 될까?

		System.out.println("b~f 사이의 단어 검색");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("b", true, "f", true); // 시작, 끝값을 포함하면 true
		for (Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}

	}

}
