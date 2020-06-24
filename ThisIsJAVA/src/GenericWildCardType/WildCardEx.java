package GenericWildCardType;

import java.util.Arrays;

public class WildCardEx {
	// 모든 과정
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}

	// 학생 과정
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}

	// 직장인과 일반인 과정
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		// 와일드카드 타입이 Person
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));

		// 와일드카드 타입이 Worker
		Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인"));

		// 와일드카드 타입이 Student
		Course<Student> studentCourse = new Course<Student>("학생 과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));

		// 와일드카드 타입이 HighStudent
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생 과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));

		// 모든 과정 등록 가능
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println(); // 개행

		// 학생 과정만 등록 가능
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();

		// 직장인과 일반인 과정만 등록 가능
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
	}
}
