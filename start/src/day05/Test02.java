package day05;

/*
 	정수를 입력 받아서

 	그 숫자가 짝수인지 홀수인지를 판별해서 출력하세요.
 	
 	단, 0인 경우는 0으로 출력하세요.
 	
 */
import java.util.*;

public class Test02 {

	public static void main(String[] args) {
	// 진입점 함수
		
		//할 일
		// 1) 입력 받을 준비
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력 받기 전 입력 메세지 출력
		System.out.print("정수 입력 : ");
		// System.out.print(내용);
		// 내용 출력 + 줄 바꿈 x
		
		// 3) 입력 받아서 변수에 기억시키기
		int no = sc.nextInt();
		
		// 4) 판별
		String result = "정수"; // 짝수인지 홀수인지를 기억할 변수
		
		if(no == 0) { // == 동등연산자는 논리값 발생
			result = "0"; // no == 0 이 아닐 경우의 조건은 실행되지 않음
			
		}
		
		/*
		
		if(no != 0 && no % 2 == 0) { // 짝수인 경우
			result = "짝수";
		
		}
		
		if(no != 0 && no % 2 != 0) { // 홀수인 경우
			result = "홀수";
			
		}
		*/
		
		if(no != 0) { 
			// 짝수인 경우
			if(no % 2 == 0) {
				result = "짝수";
			
			}
		if(no % 2 == 1) { // 홀수인 경우
			result = "홀수";
			}
		}
		
		// 5) 최종 출력
		System.out.println("입력한 정수 " + no + " 는 " + result + " 입니다.");
	
	}

}
