package day05;

/*
	
나이를 입력 받아서

	유년기
	10대 : 10 ~ 19		==> 10 ~ 19를 모두 10으로 만들기 ==> age / 10 * 10
	20대 : 20 ~ 29
	30대 : 30 ~ 39
	40대 : 40 ~ 49
	장년층				==> 나머지는 default에서 처리
	
으로 구분해서 출력하세요.

*/

import java.util.*;
//이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨

public class Test05 {
	public static void main(String[] args) {
	// 진입점 함수
		
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
		
		int gen = age / 10 * 10;
		
		switch(gen) {
		case 0:
			sage = "유년기";
			break;
		case 10:
			sage = "10대";
			break;
		case 20:
			sage = "20대";
			break;
		case 30:
			sage = "30대";
			break;
		case 40:
			sage = "40대";
			break;
		default:
			sage = "장년층";
		}
		
		/*
		 
		switch문 : 인자값의 경우에 따라 실행문장을 만들어두는 조건문
		수행문장 다음에 반드시 break; 문 기술
		
		switch(인자값){
			case 조건값1:
				실행문;
				break;
			case 조건값2:
				실행문;
				break;
			case 조건값3:
				실행문;
				break;
			break;
			...
			default:
				실행문;
			}
			
		 */
		
		// 5) 최종 출력
		System.out.println("입력한 나이 " + age + " 는 " + sage + " 입니다.");
	}
}
