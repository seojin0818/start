package day02;

/**
 * 
 * 자신의 정보를 기억하고 출력하는 기능의 클래스
 * @author 백서진
 * @since 2022.02.23
 * @version v.1.0
 * 
 */

/*

 문제 ] 자신의 이름, 나이, 이름 첫 문자, 키를 변수에 기억시키고 출력하세요.
 
*/

public class Test04 {
	// 클래스의 접근지정자는 public 혹은 생략만 가능
	// 클래스 이름의 첫 글자는 대문자
	// 특수문자는 _, $ 두 가지만 가능 (첫 글자로도 가능)
	// 두 단어 이상으로 구성될 때는 각 단어의 첫 글자를 대문자로 표기하는 Camel 표기법
	
	public static void main(String[] args) {
	// 진입점 함수
		
		/*
		
		// 할 일
		// 1) 데이터타입 정하기
		String name;
		int age;
		char start;
		double height;
		// 이름은 문자열, 나이는 숫자, 이름 첫 문자는 문자, 키는 숫자이므로 정수형도 가능하지만 실수형으로 만들어보기
		
		// 2) 데이터 기억시키기
		name = "백서진";
		age = 27;
		start = '백';
		height = 165.; // double형은 소수점이 있는 실수형이므로 . 을 붙이기
		
		*/
		
		// 변수 선언 & 변수 초기화
		String name = "백서진";
		int age = 27; // 정수형 기본 타입 int
		char start = '백';
		double height = 165.;
		
		// 최종 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("이름 첫 문자 : " + start);
		System.out.println("키 : " + height);
		// System.out.println(내용);
		// 내용 출력 + 줄 바꿈
		// 문자열을 표시할 때는 ""
		
		System.out.println("'가' > '나' : " + ('가' > '나'));
		// 문자는 정수를 사용하고 있으므로 대소비교 가능
	}
	
}
