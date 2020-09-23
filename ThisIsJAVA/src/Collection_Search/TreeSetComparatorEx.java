package Collection_Search;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 내림차순 정렬자를 사용하는 TreeSet
 * 
 * Comparable을 구현하지 않은 사용자 정의 객체를 Comparator 정렬자를 사용하여 내림차순으로 정렬해서
 * 출력한다.
 * 
 * @author akjak
 *
 */
public class TreeSetComparatorEx {

	public static void main(String[] args) {
//		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
//		// Fruit이 Comparable을 구현하지 않았기 때문에 예외 발생
//		try {
//			treeSet.add(new Fruit("수박", 3000));
//			treeSet.add(new Fruit("딸기", 1500));
//			treeSet.add(new Fruit("포도", 5000));
//		} catch (ClassCastException e) {
//			System.out.println("Comparable을 구현하지 않아서 예외가 발생 : " + e.getLocalizedMessage());
//			System.out.println(e.toString());
//		}

		// 내림차순 정렬자를 제공해줘서 예외가 발생하지 않는다.
		TreeSet<Fruit> treeSet2 = new TreeSet<Fruit>(new DescendingComparator());
		treeSet2.add(new Fruit("수박", 3000));
		treeSet2.add(new Fruit("딸기", 1500));
		treeSet2.add(new Fruit("포도", 5000));

		Iterator<Fruit> iterator = treeSet2.iterator();
		while (iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + " : " + fruit.price);
		}
	}

}
