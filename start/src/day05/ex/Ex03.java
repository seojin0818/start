package day05.ex;

/*
 	
 	문제 3 ]
 		
 		문자열을 입력 받아서
 		문자를 한 글자씩 추출해서 출력하세요.
 		
 	참고 ]
 		
 		문자열의 길이를 알아내는 방법
 		int 변수 = 문자열.length();
 		
 */

import javax.swing.*;

public class Ex03 {

	public static void main(String[] args) {
	// 진입점 함수
		
		/*
		// 할 일
		// 1) 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력 받기 전 입력 메세지 출력
		System.out.print("문자열 입력 : ");
		// System.out.print(내용);
		// 내용 출력 + 줄 바꿈 x
		
		// 3) 입력 받은 문자열 저장
		String str = sc.nextLine();
		
		// 4) 문자열 길이 구하기
		int no = str.length();
		
		// 5) 문자열에서 문자 추출
		// char ch = str.charAt(0);
		// for(char j = 0 ; j < ch ; j++) {
			
			for(int i = 0 ; i < no ; i++) {
			System.out.println((i + 1) + " 번째 문자 추출 : ");
		*/
		
		// 강사님 풀이 ]
			
			// 문자열에서 문자를 한 글자씩 추출하려면
			// 전체 문자열의 길이를 알아내고
			// 그 길이만큼 반복해서 추출
		
			// 할 일
			// 1) 문자열 입력 받아서 저장하기
			String str = JOptionPane.showInputDialog("문자열을 입력하세요!");
			
			// 2) 입력 받은 문자열의 길이 알아내기
			int len = str.length();
			
			// 3) 길이만큼 반복해서 한 글자씩 추출 후 출력
			for(int i = 0 ; i < len ; i++) {
				char ch = str.charAt(i);
				// 문자열에서 한 글자를 꺼내면 문자 => 해당 위치의 문자를 꺼내주는 함수			
				// 위치값 계속 증가						
				// 길이에서 1을 빼주면 index 값 출력 (index는 0부터 시작)					
				// 이미 카운터변수 i가 하나씩 더하는 역할 중
				
				System.out.println((i + 1) + " 번째 문자 : [" + ch + "]");
			}
	}
}
