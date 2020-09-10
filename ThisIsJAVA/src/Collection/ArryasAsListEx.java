package Collection;

import java.util.Arrays;
import java.util.List;

/**
 * ArrayList를 생성하고 런타임 시 필요에 의해 객체들을 추가하는 것이 일반적이지만,
 * 고정된 객체들로 구성된 List를 생성할 때도 있다.
 * 
 * T 타입 파라미터에 맞게 asList()의 매개값을 순차적으로 입력하거나, T[] 배열을 매개값으로 주면 된다.
 * 
 * @author akjak
 *
 */
public class ArryasAsListEx {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "임꺽정", "황진이"); // String 변수들을 매개값으로 순차적으로 입력한다.
		for (String name : list1) {
			System.out.println(name);
		}

		List<Integer> list2 = Arrays.asList(1, 2, 3); // Integer 변수들을 매개값으로 순차적으로 입력한다.
		for (int value : list2) {
			System.out.println(value);
		}

		String[] stringArray = { "하나", "둘", "셋" };
		List<String> list3 = Arrays.asList(stringArray); // String배열을 매개값으로 넣어준다.
		for (String count : list3) {
			System.out.println(count);
		}
		
	}

}
