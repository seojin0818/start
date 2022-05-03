package ex;

/*
	
	1 ~ 50 사이의 정수를 랜덤하게 10개를 발생시켜서
	발생된 수가 짝수인지 홀수인지 소수인지를 판별해서 출력하는 프로그램을 작성하세요!
	짝수이면서 소수인 경우는 짝수와 소수라는 것을 모두 출력하세요.
	
*/

public class test01 {
	public static void main(String[] args) {
		// 할 일
		// 1) 랜덤으로 숫자 생성
		int no = (int)(Math.random() * (50 - 1 + 1) + 1);
		
		// 2) 숫자 판별
		String result = (no % 2 == 0) ? "짝수" : "홀수";
		
		// 3) 최종 출력
		System.out.println("입력한 정수 " + no + " 는 " + result + " 입니다.");
	}
}
