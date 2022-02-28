package day05;

/*
  "하리보 만세 !" 를 열 번 출력하세요.
 */

public class Test06 {

	public static void main(String[] args) {
	// 진입점 함수

		String str = "하리보 만세!";
	
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println((i + 1) + " ] 번째 : " + str);
		}

	}
	/*
	 
	 반복문 : 실행문을 반복 수행하게 할 때 사용하는 제어문
	 
	 카운터변수 : 반복횟수를 기록할 변수
	 조건식 : 반복을 종료할 조건식
	 증감식 : 반복될때마다 카운터변수를 증감해주는 명령
	 
	 for 반복문 : 카운터변수와 반복이 종료될 조건식이 있는 반복 명령
	 
	 for(카운터변수 초기화 ; 조건식 ; 카운터변수 증감식){
	 	실행문
	 }
	
	 */

}
