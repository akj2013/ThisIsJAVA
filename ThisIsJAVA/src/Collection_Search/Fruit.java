package Collection_Search;

/**
 * Comparable을 구현하지 않은 클래스
 * 
 * @author akjak
 *
 */
public class Fruit {
	public String name;
	public double price; // 숫자 타입의 경우, 값으로 정렬된다.

	public Fruit(String name, double price) {
		this.name = name;
		this.price = price;
	}
}
