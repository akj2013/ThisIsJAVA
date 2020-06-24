package GenericBoundedType;
/**
 * Number클래스로 정의되어 있는 메소드로
 * 숫자를 double 타입으로 변환한다.
 * 두 매개변수의 숫자의 크기를 비교하여
 * 첫 번째 매개값이 작으면 -1, 같으면 0, 크면 1을 리턴한다.
 * 
 * @author akjak
 *
 */
public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}
