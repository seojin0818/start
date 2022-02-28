package day05;
/*
	
나이를 입력 받아서

	유년기
	10대 : 10 ~ 19		==> 10 ~ 19를 모두 10으로 만들기 ? <-- age / 10 * 10
	20대
	30대
	40대 : 40 ~ 49
	장년층				==> 나머지는 default에서 처리
	
으로 구분해서 출력하세요.
	
*/
import java.util.*;

public class Test05 {
	public static void main(String[] args) {
	// 진입점 함수
		
		// 1) 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력 받기 전 입력 메세지 출력
		System.out.print("나이 입력 : ");
		
		// 3) 입력 받아서 변수에 기억시키기
		int age = sc.nextInt();
		
		// 4) 판별해서 결과값을 변수에 기억시키기
		// 결과값 변수
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
		
		// 5) 최종 출력
		System.out.println("입력한 나이 " + age + " 는 " + sage + " 입니다.");
	}
}
