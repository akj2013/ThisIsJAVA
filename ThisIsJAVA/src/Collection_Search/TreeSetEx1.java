package Collection_Search;

import java.util.TreeSet;

/**
 * TreeSet으로 특정 객체 찾기
 * 
 * TreeSet은 이진 트리 (binary tree)를 기반으로한 Set 컬렉션이다.
 * 하나의 노드는 노드값인 value와 왼쪽, 오른쪽 자식 노드를 참조하기 위한 두 개의 변수로 구성된다.
 * 
 * TreeSet에 객체를 저장하면 자동으로 정렬되는데 부모값과 비교해서 낮은 것은 왼쪽 자식 노드에,
 * 높은 것은 오른쪽 자식 노드에 저장한다.
 * 
 * @author akjak
 *
 */
public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		if (scores.add(new Integer(75))) {
			
		} else {
			System.out.println("중복된 값은 저장되지 않는다.");
		}

		Integer score = null;

		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);

		score = scores.last();
		System.out.println("가장 높은 점수 : " + score);

		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수 : " + score);

		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수 : " + score);

		score = scores.floor(new Integer(95));
		System.out.println("95점 이거나 바로 아래 점수 : " + score);

		score = scores.ceiling(new Integer(95));
		System.out.println("95점 이거나 바로 위의 점수 : " + score);

		while(!scores.isEmpty()) {
			score = scores.pollFirst(); // 제일 낮은 객체를 꺼내오고 컬렉션에서 제거함
			System.out.println("남은 객체 수 : " + scores.size());
		}
	}

}
