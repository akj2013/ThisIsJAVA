package Generic;

/**
 * 두 개의 Pair 객체를 가져와 매개값을 받는다.
 * K와 V값이 동일한지 검사하고 boolean 값을 리턴한다.
 * 
 * @author akjak
 *
 */

public class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
