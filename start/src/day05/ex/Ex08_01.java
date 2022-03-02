package day05.ex;

/*

문제 08_01 ]

	1바이트로 기억되는 2진수를 랜덤하게 만들어
	그숫자가 10진수로 몇인지 출력하는 프로그램을 작성하세요.
	
	참고 ]
	
		문자열 2진수를 10진수 정수로 변환해주는 방법
			
			Integer.valueOf("문자열 2진수", 2);
			Integer.parseInt("문자열 2진수", 2);
	
	힌트 ]
	
		이진수 는 0과 1을 랜덤하게 발생시켜서 문자열에 덧붙여서 만든다.
		
 */

public class Ex08_01 {

	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 이진수 기억할 변수 생성
		String bno = ""; // 뭘 붙이더라도 문자열로 처리 -> 문자열은 기본 데이터타입이라서
		
		// 2) 반복해서 0 또는 1을 만들어서 위 변수의 왼쪽에 덧붙여주기 ==> 2진수는 오른쪽에서 왼쪽으로 읽어나감
		for(int i = 0 ; i < 8 ; i++) { // 1바이트가 8비트니까
			int no = (int)(Math.random() * 2); // Math.random() * 2 는 1.99999999~
			
			// 이진수 변수에 덧붙임
			bno = no + bno;
			
		// 3) 문자열 형태의 2진수를 10진수로 변환해주기
		int num = Integer.valueOf(bno, 2);
		
		// 4) 최종 출력
		System.out.println("랜덤하게 만들어진 2진수 : " + bno);
		System.out.println("10진수로 변환한 2진수 : " + num);
		
		}
		

	}

}
