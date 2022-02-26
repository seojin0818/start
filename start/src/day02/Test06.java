package day02;

public class Test06 {
/*
  	문제 ] 
  
  		3.14를 강제 형변환을 이용해서
 		float 타입 변수 pi에 기억시키고 출력하세요.
		
 */
	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 변수 선언
		// 2) 3.14는 소수점이 있으므로 실수형이고 실수형은 float, double 두가지 타입이 있으나 리터럴 영역에 자동 저장되는 것은 double형
		// 3) float형으로 바꾸기 위해서 강제 형변환 이용 -> (변환할 데이터형) 데이터; 
		
		// 변수 선언
		float pi;
		
		// 강제 형변환을 이용한 초기화
		pi = (float) 3.14;
		
	}
}
