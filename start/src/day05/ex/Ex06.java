package day05.ex;

/*

	문제 6 ]
	
		랜덤하게 정수를 컴퓨터가 만들어 내면
		그 수를 알아맞추는 게임을 만드세요.
	
	ex ]
		
		발생숫자 : 54
		
		사용자입력숫자 : 45
		
		==> "입력한 수가 더 작습니다."
		로 메세지를 출력해서 사용자가 숫자를 알아맞추는 게임
		
		횟수도 같이 출력되게 하세요.
		
		단, 입력횟수가 5번을 초과하는 순간 컴퓨터의 승리로 처리하고 프로그램이 종료되게 하세요.
		
*/

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
	// 진입점 함수
		
		/* 강사님 풀이 ]

		// 할 일
		// 1) 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 2) 랜덤으로 숫자 생성
		int num = (int)(Math.random() * (100 - 1 + 1) + 1);
		
		// 3) 반복해서 처리
		for(int i = 0 ; i < 5 ; i++) { // 횟수 제한 있으므로 카운터변수가 있는 for문 사용
			
		}
		
			// 3 - 1 ) 사용자가 숫자를 입력함
			System.out.print("숫자 입력 : ");
			int no = sc.nextInt();
			
			// 3 - 2 ) 비교해서 결과 보여줌
			if(no == num) {
				System.out.println("입력한 수 " + no + " 맞습니다.");
				// 정답을 맞췄으므로 반복 종료
				// if(no == num) 이 아니면 실행조차 하지 않음
				break;
			} else if(i != 4 && no > num) {
				System.out.println("큰 수를 입력했습니다.");
				continue; // continue 만나면 증감식으로 감
			} else if(i != 4 && no < num) {
				System.out.println("작은 수를 입력했습니다.");
			}
			
			if(i == 4) {
				System.out.println("##### 게임에서 졌습니다. #####");
			}
			
			*/
	}
	}
