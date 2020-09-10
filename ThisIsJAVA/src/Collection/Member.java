package Collection;

/**
 *  hashCode()와 equals()를 재정의한 클래스
 * 
 * @author akjak
 *
 */
public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() { // name과 age 값이 같으면 동일한 hashCode가 리턴된다.
		return name.hashCode() + age; // String의 해쉬코드를 이용한다.
	}
}
