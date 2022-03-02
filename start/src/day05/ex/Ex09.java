package day05.ex;

/*

	문제 9 ]
		
		1 - 2 + 3 - 4 + 5 - 6 .... 했을 경우
		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
		
		
		힌트 ]
			
			1 + (-2) + 3 + (-4) + ......
			
			no * -1
		
*/

public class Ex09 {

	public static void main(String[] args) {
	// 진입점 함수

		int no = -1; // 처음이 1이니까
		int sum = 0; 
		int i = 1;
		
		for(i = 1 ; ; i++) { // 어디까지 반복되는지 모르니까 비워두고
			no = no * -1;
			sum = sum + i * no;
			if(sum > 100) { // 100을 넘기게 되면 종료해야 하므로
				break;
			}
	}
		System.out.println("1부터 " + (i * no) + " 까지의 합이 " + sum + " 으로 처음 100을 넘기게 된다.");
		
}
}