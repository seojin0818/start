package day05.ex;

/*

	문제 13 ]
		
		랜덤한 두 수를 입력한 후
		두 수의 최대 공약수를 구하는 프로그램을 작성하세요.
	
	최대 공약수 :
		두 수의 약수중 제일 큰 수.
		두 수를 나눌 수 있는 수중 제일 큰 수
		
		
		
	extra ]
		위 문제가 해결되면 최소공배수를 구하는 문제로 풀어보세요.
		
*/

import java.util.*;

public class Ex13 {

	public static void main(String[] args) {
	// 진입점 함수
		
		Scanner sc = new Scanner(System.in);
		
		// 1번 입력 메세지
		System.out.print("첫번째 숫자 : ");
		
		// 1번 데이터 기억
		int no1 = sc.nextInt();
		
		// 2번 입력 메세지
		System.out.print("두번째 숫자 : ");
		
		// 2번 데이터 기억
		int no2 = sc.nextInt();
		
		// 두 수 중 작은 수를 찾음
		int min = (no1 < no2) ? no1 : no2;
		
		int result = 1;
		
		// 공약수 찾기
		for(int i = min ; i > 1 ; i--) {
			if(no1 % i == 0 && no2 % i == 0) {
				result = i; // 원하는 숫자를 찾았으므로 더 이상 반복작업을 할 이유 x
							// 따라서 즉시 반복문 종료
				break;	// if 문이 아닌 바깥의 for문에 적용되는 것
		}
		// 결과 출력하기
		
		System.out.println("입력 받은 두 수 " + no1 + " | " + no2 + " 의 최대 공약수는 " + result + " 입니다.");

			/*
			 
			 for(int i = 1 ; i < num ; i++){
			 	if(num % i == 0){
			 		System.out.println(num + " x " + i + " = " + num * i);
			 		
			 */
	}

	}
}
