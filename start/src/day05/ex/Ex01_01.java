package day05.ex;

public class Ex01_01 {

	public static void main(String[] args) {
	// 진입점 함수
		
		/*
		
		1부터 정수를 더해갔을때 그 합이 5000을 초과하는 수는 몇부터인지 출력하세요.
		
		힌트 ]
		
			처음 합이 5000이 넘는 순간 반복문을 종료한다.
		
		 */
		
		// 할 일
		for(int i = 0 ; ; i++) {
		int no = i + 1;
		if (no > 5000){
			break;
		}
		
		System.out.print(no + ",");
		System.out.println();

		// 3) 합이 5000을 넘는 순간 ?
		// int no = (i + 1)
		// int hap;
		// hap = hap + (i + 1);
		
		// 초과하는 수가 몇부터인지 어떻게 구하지?
		
		//
		}
	}
}

