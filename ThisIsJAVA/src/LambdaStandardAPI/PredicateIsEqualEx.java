package LambdaStandardAPI;

import java.util.function.Predicate;

/**
 * Predicate의 isEqual() 정적 메소드
 * 두 개의 매개변수를 받아 Objects 클래스의 equals(sourceObjcet, targetObject)의 리턴값을 얻어
 * 새로운 Predicate<T>를 생성한다.
 * 
 * @author akjak
 *
 */
public class PredicateIsEqualEx {

	public static void main(String[] args) {
		Predicate<String> predicate;

		// null, null : true
		predicate = Predicate.isEqual(null); // 타겟
		System.out.println("null, null : " + predicate.test(null)); // 소스

		// not null, null : false
		predicate = Predicate.isEqual("Java8"); // 타겟
		System.out.println("소스 : null, 타겟 : Java8 : " + predicate.test(null)); // 소스

		// null, not null : false
		predicate = Predicate.isEqual(null); // 타겟
		System.out.println("소스 : Java8, 타겟 : null : " + predicate.test("Java8")); // 소스

		// not null, not null : true
		predicate = Predicate.isEqual("Java8"); // 타겟
		System.out.println("소스 : Java8, 타겟 : Java8 : " + predicate.test("Java8")); // 소스

		// not null, not null : false
		predicate = Predicate.isEqual("Java8"); // 타겟
		System.out.println("소스 : Java7, 타겟 : Java8 : " + predicate.test("Java7")); // 소스

	}

}
