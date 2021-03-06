package day02;

// 문제 ] 'a'의 다섯번째 이후 문자를 출력하세요.

public class Test07 {
	// 클래스의 접근지정자는 public 혹은 생략만 가능
	// 클래스 이름의 첫 글자는 대문자
	// 특수문자는 _, $ 두 가지만 가능 (첫 글자로도 가능)
	// 두 단어 이상으로 구성될 때는 각 단어의 첫 글자를 대문자로 표기하는 Camel 표기법
	
	public static void main(String[] args) {
	// 진입점 함수
		
		// 타입이 다른 두 데이터의 연산의 결과는 항상 큰 타입 쪽을 따름 ==> 자동 형변환
		
		double no = 3.14 + 10;
		// 3.14는 소수점이 있는 실수형, 10은 정수형이지만 더 큰 데이터 타입을 따르는 자동 형변환으로 연산 가능
		
		// 할 일
		// 1) 변수 선언 및 변수 초기화하기
		char ch = 'a';
		
		// 2) 'a'의 다섯번째 이후 문자 구하기
		int num = ch + 5;
		// 'a'는 문자형, 5는 정수형이지만 자동 형변환으로 연산 가능
		
		// 3) 강제 형변환하기
		char ch1 = (char)num;
		// 정수형으로 출력된 결과를 문자로 출력해야 하므로 강제 형변환 이용
		// 같은 영역 안에서 같은 이름의 변수는 쓸 수 없으므로 ch1으로 만들기
		
		// 4) 최종 출력하기
		System.out.println("'a'보다 5번째 이후 문자 : " + ch1);
		// System.out.println(내용);
		// 내용 출력 + 줄 바꿈
		// 문자열을 표시할 때는 ""
		
	}
	
}
