package day02;

/**
 *  자신의 정보를 기억하고 출력하는 기능의 클래스
 * @author 백서진
 * @since 2022.02.23
 * @version v.1.0
 * 
 */
public class Test04 {
	/*
	 	 문제 ] 자신의 이름, 나이, 이름 첫문자, 키를 변수에 기억시키고 출력하세요.
	 */
	public static void main(String[] args) {
		// 진입점 함수
		
		// 할 일
		// 1) 이름, 나이, 이름 첫문자, 키의 데이터 타입 정하기
		// 2) 이름은 문자열이므로 String, 나이는 숫자이므로 정수형 (기본 타입 int), 이름 첫문자는 문자이므로 char, 키는 숫자이므로 정수형도 되지만 실수형으로 만들어보기
		// 3) 변수를 만들고 변수 초기화로 데이터 기억 시키기
		
		String name = "백서진";
		int age = 27;
		char sijak = '백';
		double height = 165.;
		// double형은 소수점이 있는 실수형에서 쓰기 때문에 .
		
		// 4) 최종 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("첫문자 : " + sijak);
		System.out.println("키 : " + height);
		// System.out.println(내용);
		// 내용 출력 + 줄 바꿈
		
		System.out.println("'가' > '나' : " + ('가' > '나'));
	}
	
}
