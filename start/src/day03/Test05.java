package day03;

public class Test05 {
	public static void main(String[] args) {
	// 진입점 함수
		
		int no1 = 10;
		int no2 = 20;
		// 같은 영역 안에서 변수의 이름은 같을 수 없음
		
		int no3 = no1++ + no2;
		
		// 증감 연산자 = 증가 연산자와 감소 연산자
		// 증가 연산자 (++) 피연산자의 값을 1 증가 (딱 한번만)
		// 감소 연산자 (--) 피연산자의 값을 1 감소 (딱 한번만)
		
		// 증가 연산자의 종류
		// 1) 전위형(++변수) : 먼저 증가시킴
		// 2) 후위형(변수++) : 나중에 증가시킴
		// 증감 연산자가 독립적으로 사용된 경우, 전위형과 후위형의 차이가 없음
		
		// 참고 ]
		// 모든 연산은 중앙처리장치에서 처리되는 것이 원칙이지만 
		// 증감연산자, 시프트연산자는 중앙처리장치를 거치지 않고 메모리 상에서 연산 처리됨
		
		System.out.println("no1 : " + no1);
		System.out.println("no2 : " + no2);
		System.out.println("no3 : " + no3);
		// System.out.println(내용);
		// 내용 출력 + 줄 바꿈
		 
		// ==>  no1 : 11
		// ==>  no2 : 20
		// ==>	no3 : 30
	}
}
