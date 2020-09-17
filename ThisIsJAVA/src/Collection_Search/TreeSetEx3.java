package Collection_Search;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * TreeSet으로 영어 단어를 정렬하고, 범위 검색
 * 
 * @author akjak
 *
 */
public class TreeSetEx3 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		System.out.println("c~f 사이의 단어 검색");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true); // 시작, 끝값을 포함하면 true
		Iterator<String> itr = rangeSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
