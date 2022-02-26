package day04;

public class Test03 {
	public static void main(String[] args) {
	// 진입점 함수
		
		int no = 20;
		
		int result = 20 >> 2; 
		// 2의 2승으로 나눈 값
		// ==> 5
		
		System.out.println("result : " + result);
		// System.out.println(내용);
		// 내용 출력 + 줄 바꿈
		
		result = result << 3; 
		// 2의 3승을 곱한 값
		// ==> 40
		System.out.println("result : " + result);
		
		System.out.println(">> 1 : " + (-64 >> 1));
		System.out.println(">>> 1 : " + (-64 >>> 1));
		// ==> >> 1 : -32
		// ==> >>> 1 : 2147483616
		
		// 시프트 연산 : 대상 필드의 값을 비트로 바꾼 후 비트수만큼 이동시켜서 값을 얻는 연산
		// boolean,float,double형의 경우는 사용 불가
		// 많은 CPU에서는 상수곱셈 등의 연산을 시프트 연산자로 처리하는것이
		// 산술논리장치를 거치는것보다 빠르기 때문에, 컴파일러에서는 곱셈/나눗셈연산을 자동적으로 산술시프트 명령어로 변환
		
		// >> : 비트 값을 오른쪽으로 이동 (빈 자리는 부호값으로 대입)
		// << : 비트 값을 왼쪽으로 이동 (빈 자리는 0으로 대입)
		// >>> : 비트 값을 오른쪽으로 이동 (빈 자리는 0으로 대입)
	}
}
