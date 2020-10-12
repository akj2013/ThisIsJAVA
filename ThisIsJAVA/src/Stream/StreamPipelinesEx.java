package Stream;

import java.util.Arrays;
import java.util.List;

/**
 * 스트림 파이프라인
 * 
 * 대량의 데이터를 가공해서 축소하는 것을 일반적으로 리덕션(Reduction)이라고 하는데,
 * 데이터의 합계, 평균값, 카운팅, 최대값, 최소값 등이 대표적인 리덕션의 결과물이다.
 * 그러나, 컬렉션의 요소를 리덕션의 결과물로 바로 집계할 수 없을 경우에는 집계하기 좋도록 필터링,
 * 매핑, 정렬, 그룹핑 등의 중간 처리가 필요하다.
 * 
 * 스트림은 데이터의 중간 처리와 합계, 평균, 카운팅 등의 최종 처리를 파이프라인으로 해결한다.
 * 파이프라인은 여러 개의 스트림이 연결되어 있는 구조를 말한다. 파이프라인에서 최종 처리를 제외하고는
 * 모두 중간 처리 스트림이다.
 * 
 * 중간 스트림이 생성될 때 요소들이 바로 중간 처리(필터링, 매핑, 정렬) 되는 것이 아니라 최종 처리가 시작되기
 * 전까지 중간 처리는 지연(lazy)된다. 최종 처리가 시작되면 비로소 컬렉션의 요소가 하나씩 중간 스트림에서 처리되고 최종 처리까지 오게 된다.
 * 
 * 중간 처리 메소드와 최종 처리 메소드는 리턴 타입으로 구분할 수 있다.
 * 리턴 타입이 스트림이라면 중간 처리 메소드이고,
 * 기본 타입이거나 OptionalXXX 라면 최종 처리 메소드이다.
 * 
 * @author akjak
 *
 */
public class StreamPipelinesEx {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("임꺽정", Member.MALE, 40),
				new Member("신사임당", Member.FEMALE, 50),
				new Member("이순신", Member.MALE, 35)
				);

		// 남성의 평균 나이를 구한다.
		double ageAvg = list.stream() 							// list의 스트림 객체를 가져온다. 									(오리지널 스트림)
				.filter(m -> m.getSex() == Member.MALE)	// 내부의 객체들 중 성별이 남성인 객체들만 필터링해서 구해온다.
				.mapToInt(Member :: getAge)						// 필터링한 객체들의 나이를 int 객체로 가져온다.
				.average()													// 나이의 평균값을 구한다. 											(여기까지 중간 처리 스트림)
				.getAsDouble();											// 평균값을 double로 반환한다. 									(최종 처리)

		System.out.println("남자 평균 나이 : " + ageAvg);

	}

}
