package Collection_Search;

import java.util.Comparator;

/**
 * TreeSet의 객체와 TreeMap의 키가 Comparable을 구현하고 있지 않을 경우,
 * 저장하는 순간 ClassCastException이 발생한다.
 * 
 * 그래서,
 * 
 * TreeSet 또는 TreeMap 생성자의 매개값으로 정렬자(Comparator)를 제공하면
 * Comparable 비구현 객체도 정렬시킬 수 있다.
 * 
 * @author akjak
 *
 */
public class DescendingComparator implements Comparator<Fruit>{
	// 두 객체가 동등하면 0, 비교하는 값보다 앞에 오게 하려면 음수, 뒤에 오게 하려면 양수를 리턴하도록 한다.
	@Override
	public int compare(Fruit f1, Fruit f2) {
		if (f1.price < f2.price) 			return 1; // 가격이 적을 경우 뒤에 오게 함
		else if (f1.price == f2.price) 	return 0;
		else 										return -1; // 가격이 클 경우 앞에 오게 함
	}
}
