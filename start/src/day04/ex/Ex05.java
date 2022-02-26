package day04.ex;
import java.util.*;
// // 이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨
/*
 	문제 5 ]
 		
 		3자리 숫자(100~999)를 입력 받아서
 		이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
 		얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요.
 		
 		ex ]
 		
 			241		은 200에 가까우므로 41을 빼야함
 			777		은 800에 가까우므로 23을 더해야함
 			
 */
public class Ex05 {
	public static void main(String[] args) {
	// 진입점 함수
		
			// 할 일
			// 1) 입력 도구 준비
			Scanner sc = new Scanner(System.in);
			
			// 2) 입력 받기 전 입력 메세지 출력
			System.out.print("3자리 숫자(100 ~ 999) 입력 : ");
			// System.out.print(내용);
			// 내용 출력 + 줄 바꿈 x
			
			// 3) 정수형으로 입력 받기
			int no = sc.nextInt();
		
	}
}
