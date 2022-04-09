package day02;

/**
 * 
 * 이 클래스는 변수 제작 연습용 클래스
 * @author 백서진
 * @since 2022.02.23
 * @version v.1.0
 * 
 * 			변경이력 ]
 * 				2022.02.23 - 클래스 제작
 * 								담당자 : 백서진
 * 				2022.02.23 - 데이터 수정
 * 								담당자 : 홍길동
 * 
 */

/*
 
 문제 ] 곰돌이의 나이를 기억하는 변수 age를 만들어서 26이라는 데이터로 기억시키세요.

*/

public class Test03 {
	// 클래스의 접근지정자는 public 혹은 생략만 가능
	// 클래스 이름의 첫 글자는 대문자
	// 특수문자는 _, $ 두 가지만 가능 (첫 글자로도 가능)
	// 두 단어 이상으로 구성될 때는 각 단어의 첫 글자를 대문자로 표기하는 Camel 표기법
	
	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 데이터타입 정하기
		//		나이는 정수형이므로 정수로 기억시키기
		// 		정수의 기본 사용타입은 int이므로 int 사용
		int age; // 변수 선언
		
		// 2) 데이터 기억시키기
		age = 26; // 변수 초기화
		
		/*
		  
		  참고 ]
		  
		  	변수를 만들 때 같은 영역 안에서 같은 이름의 변수는 두 번 만들 수 없음
		  	
		  	예 ]
		  	
		  		int no;
			  	no = 100;
			  	....
			  	int no = 200; (x) 
			  	==> no = 200; or int num = 200;
		  	
		  참고 ]
		  
		  	같은 이름의 변수는 데이터타입이 달라져도 다시 만들 수 없음
		  	
		  	예 ]
		  		
		  		int age;
		  		age = 10;
		  		...
		  		String age = "10"; (x)
		  		
		 */
		
		/*
		 
		  참고 ]
		  
		  	변수의 진정한 의미는
		  	만들어진 변수가 기억하는 데이터를 재사용하는 것
		  	
		 */
		
		// 3) 최종 출력
		System.out.println("곰돌이의 나이 : " + age);
		// System.out.println(내용);
		// 내용 출력 + 줄 바꿈
		
	}
}
