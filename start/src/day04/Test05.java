package day04;

/*
 	1 ~ 25 사이의 정수를 랜덤하게 발생시켜서
 	그 숫자가 짝수인지 홀수인지를 판별해서
 	출력하세요.
 	
 	참고 ] 
 	
 		특정 범위의 랜덤한 숫자 발생시키는 방법
 		
 			Math 클래스 내에 0 이상 1 미만 실수를 발생시켜주는 함수
 				0 <= Math.random() < 1	x	T
 				0 <= Math.random() * T < T
 				
 	형식 ]
 		
 		a ~ b 사이의 랜덤한 정수 ( a < b )
 		(int) Math.random() * (b - a + 1) + a)
 			
 */
public class Test05 {
	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 랜덤으로 숫자 생성
		
		int no = (int)(Math.random() * (25 - 1 + 1) + 1);
		
		// 2) 숫자 판별
		String result = (no % 2 == 0) ? "짝수" : "홀수";
		// () ? () : ();
		
		// 3) 최종 출력
		System.out.println("1 ~ 25 사이의 랜덤하게 발생된 숫자 " + no + " 는 " + result + " 입니다.");
		// String은 변경이 많이 없는 데이터를 쓰는게 좋음 - 메모리를 많이 차지하기 때문에
		// System.out.println(내용);
		// 내용 출력 + 줄 바꿈		
	}
}
