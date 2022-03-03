package day07;

/*
 
 	6개의 메모리를 배열로 만들고
 	그 안에 1 ~ 45 사이의 랜덤한 숫자(정수)를 입력한 후 출력하세요.
 	
 */

public class Test02 {
	
	public static void main(String[] args) {
		
		// 할 일
		// 1) 배열의 주소를 기억할 변수 만들기
		int[] lotto;
		// 2) 배열 만들기
		lotto = new int[6];
		
		int len = lotto.length;
		
		loop:
		for(int i = 0 ; i < len ; i++ ) {
			// 3) 랜덤으로 정수 만들기
			int no = (int)(Math.random() * 45 + 1);
			
			// 중복검사
			// 만약 지금 만든 번호가 이전에 이미 만들어진 번호면
			// 지금 회차를 다시 반복함
			for(int j = 0 ; j < i ; j++) {
				// 이전에 만든 번호 추출
				int tmp = lotto[j];
				
				if(no == tmp) {
					// 이 경우는 지금 만든 번호가 이전 회차에서 이미 만든 번호이므로
					// 지금 회차를 다시 반복함
					
					// 회차를 1 감소시켜줌
					i--;
					// 다음 회차를 진행함
					continue loop;
				}
			}
			
		// 4) 배열에 채워넣기
			lotto[i] = no;
		}
		// 5) 하나씩 꺼내서 출력
		/*
		System.out.println(lotto[0]);
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		System.out.println(lotto[3]);
		System.out.println(lotto[4]);
		System.out.println(lotto[5]);
		*/
		for(int i = 0 ; i < len ; i++) {
			System.out.print(lotto[i] + " | ");
		}
		System.out.println();
	}
}