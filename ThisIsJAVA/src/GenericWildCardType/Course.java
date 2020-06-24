package GenericWildCardType;

public class Course<T> { // 제네릭 타입 : 타입을 파라미터로 가지는 클래스나 인터페이스이다.
	private String name;
	private T[] students;

	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]); // 타입 파라미터로 배열을 생성.
	}

	public String getName() { return name; }
	public T[] getStudents() { return students; }

	/**
	 * 배열에 비어있는 부분을 찾아서
	 * 수강생을 추가하는 메소드이다.
	 * 
	 * @param t
	 */
	public void add(T t) {
		for (int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break; 
			}
		}
	}
}

/*
 * 수강생이 될 수있는 타입 클래스의 계층 구조
 *               Person
 *     ________|___________
 *     |                                  |
 * Worker                        Student
 *                                        |
 *                                   HighStudent
 * 
 * Course<?> : 모든 타입이 가능하다.
 * Course<? extends Student> : Student와 HighStudent만 가능하다.
 * Course<? super Worker> : Worker와 Person만 가능하다.
 * 
 * 
 */
