package GenericWildCardType;

public class HighStudent extends Student{
	String name;
	public HighStudent(String name) {
		super(name); // 기본 생성자가 없는 클래스를 상속받을 때는 피상속 클래스의 생성자를 호출해야 한다.
		this.name = name;
	}
}
