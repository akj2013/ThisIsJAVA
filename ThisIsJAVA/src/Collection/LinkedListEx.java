package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList와 ArrayList의 실행 성능 비교
 * 
 * LinkedList는 인접 참조를 링크해서 체인처럼 관리한다. 특정 인덱스의 객체를 제거하면 앞뒤 링크만 변경되고,
 * 나머지 링크는 변경되지 않는다. 따라서 빈번한 객체 삭제와 삽입이 이뤄지는 곳에서는 ArrayList보다 더 좋은 성능을 발휘한다.
 * 끝에서부터 순차적으로 추가/삭제하는 경우는 ArrayList가 더 빠르지만, 중간에 추가 또는 삭제할 경우는 앞뒤 링크 정보만
 * 변경하면 되는 LinkedList가 더 빠르다.
 * 
 * 
 * @author akjak
 *
 */
public class LinkedListEx {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i)); // 1부터 10000까지 삽입.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i)); // 1부터 10000까지 삽입.
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (endTime - startTime) + "ns");

		

	}

}
