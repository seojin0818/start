package day05;

/*
 	정수를 입력 받아서

 	그 숫자가 짝수인지 홀수인지를 판별해서 출력하세요.
 	
 	단, 0인 경우는 0으로 출력하세요.
 	
 	if ~ else 구문으로 처리
 	
 */

import java.util.*;
//이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨

public class Test03 {
	public static void main(String[] args) {
	// 진입점 함수
			
		// 할 일
		// 1) 입력 도구 준비
		Scanner sc = new Scanner(System.in);
			
		// 2) 입력 받기 전 입력 메세지 출력
		System.out.print("정수 입력 : ");
		// System.out.print(내용);
		// 내용 출력 + 줄 바꿈 x
			
		// 3) 입력 받아서 변수에 기억시키기
		int no = sc.nextInt();
			
		// 4) 결과 변수 만들고 판별하기
		String result = "정수";
		// 짝수인지 홀수인지를 기억할 변수
			
		if(no == 0) { // no가 0인 경우
			result = "0"; // String result = "0" 안되는 이유 ==> 블록 안에서 만든 변수는 블록을 빠져나가면 사라지는 변수
		} else { // no가 0이 아닌 경우
			if(no % 2 == 0) {
				result = "짝수";
			} else {
				result = "홀수";
				}
			}
		
		/* 
		if ~ else 문 : 조건이 맞았을때와 맞지 않았을때의 실행문을 지정해 놓은 조건문
		
		if(조건식){
			조건 일치시 실행문
		} else {
			조건 불일치시 실행문
		*/
		
		// 5) 최종 출력
		System.out.println("입력한 정수 " + no + " 는 " + result + " 입니다.");
		
	}
}