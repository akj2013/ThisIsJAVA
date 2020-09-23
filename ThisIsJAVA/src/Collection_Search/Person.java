package Collection_Search;

/**
 * TreeSet의 객체와 TreeMap의 키는 저장과 동시에 자동 오름차순으로 정렬되는데,
 * 숫자 타입일 경우에는 값으로 정렬하고, 문자열 타입일 경우에는 유니코드로 정렬한다.
 * TreeSet과 TreeMap은 정렬을 위해 Comparable을 구현한 객체를 요구하는데,
 * 사용자 정의 클래스도 Comparable을 구현한다면 자동 정렬이 가능하다.
 * 
 * @author akjak
 *
 */
public class Person implements Comparable<Person> {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * 이 메소드를 오버라이딩하여 사용자 정의 클래스도 자동 정렬이 가능하도록 만든다.
	 */
	@Override
	public int compareTo(Person o) {
		if (age < o.age) return -1;
		else if (age == o.age) return 0;
		else return 1;
	}

}
