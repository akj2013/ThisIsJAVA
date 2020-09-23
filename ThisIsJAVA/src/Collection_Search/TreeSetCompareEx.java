package Collection_Search;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 사용자 정의 객체를 나이 순으로 정렬하기
 * 
 * @author akjak
 *
 */
public class TreeSetCompareEx {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>(); // Person 객체는 Comparable 인터페이스를 구현하고 있으므로 자동 정렬이 가능하다.

		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));

		Iterator<Person> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " : " + person.age); // 왼쪽 마지막 노드에서 오른쪽 마지막 노드까지 반복해서 가져오기 (오름차순)
		}

	}

}
