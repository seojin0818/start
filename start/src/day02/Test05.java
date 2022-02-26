package day02;

public class Test05 {
	public static void main(String[] args) {
	// 진입점 함수
		
		// 문제 ] 3.14를 float 타입 변수 pi에 기억해보자.
		
		// 할 일
		// 1) 3.14는 소수점이 있는 실수형이므로 float, double 둘 다 가능하지만 실수형은 리터럴 영역에 double형으로 자동 저장된다.
		// 2) 그런데 문제에서는 float 타입을 사용해야 하므로 형변환을 시켜줘야한다.
		// 3) 리터럴 형변환을 이용한다. (데이터f; -> float타입)
		
		float pi ; // 변수 선언
		
		pi = 3.14f; // 리터럴 형변환
	}
	
	
	
	/*
	 	참고 ]
	 		개발자가 입력하는 정수형 데이터는
	 		특별한 조작 없이 모든 데이터형이 기억될 수 있음
	 		
	 		ex ]
	 			int a = 100;
	 			byte b = 100;
	 			short c = 100;
	 			long d = 100;
	 			
	 */
}
