package LambdaStandardAPI;

/**
 * 계산기
 * 두 수의 더한 값을 리턴한다.
 * 정적 메소드와 인스턴스 메소드를 갖고 있다.
 * 메소드 참조용
 * 
 * @author akjak
 *
 */
public class Calculator {

	// 정적 메소드
	public static int staticMethod(int x, int y) {
		return x + y;
	}

	// 인스턴스 메소드
	public int instanceMethod(int x, int y) {
		return x + y;
	}
}
