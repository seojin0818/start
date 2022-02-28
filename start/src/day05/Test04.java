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
public class Test04 {

	public static void main(String[] args) {
	// 진입점 함수
		
		// 조건이 여러가지인 경우는 if ~ else if 구문으로 처리하는 것이 편함
		// 좁은 범위부터 설정하는 것이 좋음 (위에서부터 아래로 읽어나가면 필터되니까)
	
		// 할 일
		// 1) 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력 받기 전 입력 메세지 출력
		System.out.print("나이 입력 : ");
		// System.out.print(내용);
		// 내용 출력 + 줄 바꿈 x
		
		// 3) 입력 받아 변수에 기억시키기
		int age = sc.nextInt();
		
		// 4) 판별해서 결과 기억하기
		// 결과 변수 만들기
		String sage = "장년층";
		
		if(age < 10) {
			sage = "유년기";
		} else if(age < 20) { // age >= 10 & age < 20 라는 의미
			sage = "10대";
		} else if(age < 30) {
			sage = "20대";
		} else if(age < 40) {
			sage = "30대";
		} else if (age < 50) {
			sage = "40대";
		} else {
			sage = "장년층";
			
		}
		
		// 5) 최종 결과 출력
		System.out.println("입력나이 " + age + " 는 " + sage + " 입니다.");

	}

}
