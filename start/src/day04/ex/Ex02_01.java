package day04.ex;
/*
 
 문제 2 ]
 		
 		문자를 임의로 랜덤하게 입력한 후
 		그 문자가 대문자이면 소문자로
 		소문자이면 대문자로 변환하고
 		만약 특수문자이면 그 문자 그대로 
 		출력하는 프로그램을 작성하세요.
 		
 		단, if 문을 사용해서 처리하세요.
 		
 */
import java.util.*;
public class Ex02_01 {

	public static void main(String[] args) {
	// 진입점 함수
		
			// 할 일
			// 1) 입력 도구 준비
			Scanner sc = new Scanner(System.in);
			
			// 2) 입력 받기 전 입력 메세지 출력
			System.out.print("문자 입력 : ");
			
			// 3) 입력 받은 문자열 저장
			String str = sc.nextLine();
			
			// 4) 문자열에서 문자 추출
			char ch = str.charAt(0);
			System.out.println("문자 : ");
			
			// 5) 판별
			char result;
			if(ch < 'A') {
				result = ch;
			}
			

	}

}
