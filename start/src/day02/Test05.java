package day02;

/*

	문제 ] 3.14를 float 타입 변수 pi에 기억해보자.
	
*/

public class Test05 {
	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 데이터타입 정하기
		float pi ;
		
		// 2) 데이터 기억시키기
//		pi = 3.14;
		// 3.14는 소수점이 있는 실수형이므로 float, double 둘 다 가능하지만 실수형은 리터럴 영역에 double로 자동 저장
		// 그러나 문제에서는 float 타입을 사용해야 하므로 형변환 이용
		
		// 3) 리터럴 형변환
		pi = 3.14f;
	}
	
	/*
	 
	 형변환 : 값의 자료형을 원하는 자료형으로 변환하는 작업
	 
	 리터럴 형변환
	 ==> 데이터를 입력하면 리터럴 영역에 먼저 저장
	 	 이 때 데이터의 타입이 자동으로 결정되고 크기도 정해짐 (이것이 리터럴 타입)
	 	 정수는 int로 자동 결정, 실수는 double로 자동 결정
	 	 
	 	 메모리의 크기를 정해줄 수도 있는데 이 때 쓰는 것이 리터럴 형변환
	 	 
	 	 예 ]
	 	 
	 	 	데이터L; ==> long 타입
	 	 	데이터F; ==> float 타입
	 	 
	 */
	
	/*
	 
	 	참고 ]
	 	
	 		개발자가 입력하는 정수형 데이터는
	 		특별한 조작 없이 모든 데이터형이 기억될 수 있음
	 		==> 정수형 데이터는 리터럴 형변환 없이 사용 가능
	 		
	 		예 ]
	 		
	 			int a = 100;
	 			byte b = 100;
	 			short c = 100;
	 			long d = 100;
	 			
	 */
	
}
