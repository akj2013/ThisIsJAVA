package Collection_Search;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * TreeSet의 정렬
 * 
 * @author akjak
 *
 */
public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		/**
		 * 내림차순으로 정렬된 Set을 반환한다.
		 */
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for (Integer score : descendingSet) {
			System.out.print(score + "\t"); // 내림차순으로 출력
		}

		System.out.println();

		// 내림차순을 다시 내림차순해주면 오름차순의 Set을 반환한다.
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for (Integer score : ascendingSet) {
			System.out.print(score + "\t"); // 오름차순으로 출력
		}
	}

}
