package day05;

/*
 	
 	나이를 입력 받아서

 		유년기
 		10대 : 10 ~ 19
 		20대
 		30대
 		40대 : 40 ~ 49
 		장년층
 		
 	으로 구분해서 출력하세요.
 	
 */

import java.util.*;
//이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨

public class Test04 {

	public static void main(String[] args) {
	// 진입점 함수
		
		// 조건이 여러가지인 경우는 if ~ else if 구문으로 처리하는 것이 편함
		// 좁은 범위부터 설정하는 것이 좋음 (위에서부터 아래로 읽어나가며 필터되기 때문에)
	
		// 할 일
		// 1) 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력 받기 전 입력 메세지 출력
		System.out.print("나이 입력 : ");
		// System.out.print(내용);
		// 내용 출력 + 줄 바꿈 x
		
		// 3) 입력 받아 변수에 기억시키기
		int age = sc.nextInt();
		
		// 4) 결과 변수 만들고 판별하기
		String sage = "장년층";
		
		if (age < 10) {
			sage = "유년기";
		} else if(age < 20) { // age >= 10 & age < 20 이라는 의미
			sage = "10대";
		} else if(age < 30) {
			sage = "20대";
		} else if(age < 40) {
			sage = "30대";
		} else if(age < 50) {
			sage = "40대";
		} else {
			sage = "장년층";
		}
		/*
		
		다중 if(if-else if)문 : 조건이 두 개 이상일 경우 각 경우에 따라 실행 명령을 지정해 놓은 조건문
		
		if(조건식 1){
			조건식1 일치시 실행문
		} else if(조건식 2){
			조건식2 일치시 실행문
		} else if(조건식 3){
			조건식3 일치시 실행문
		}
		...
		else {
			모든 조건에 맞지 않을때 실행문
		}
		
		 */
		
		// 5) 최종 출력
		System.out.println("입력한 나이 " + age + " 는 " + sage + " 입니다.");
		
	}

}
