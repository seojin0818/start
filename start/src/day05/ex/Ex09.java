package day05.ex;

/*

	문제 9 ]
		
		1 - 2 + 3 - 4 + 5 - 6 .... 했을 경우
		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
		
*/

public class Ex09 {

	public static void main(String[] args) {
	// 진입점 함수

		int num = 0;
		for(int i = 1 ; i < 101 ; i++) {
			if(i % 2 == 0) {
				num -= i ;
			} else {
				num += i;
				
			}
		}
	}

}
