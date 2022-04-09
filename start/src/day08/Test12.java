package day08;

/*
	
	문제 ]
	
		문자와 출현수를 기억한 배열들 10개를 관리하는 배열을 만들고
		'A' - 'J'를 랜덤하게 100번 반복해서 만들고
		배열에 카운트를 기억시켜서 결과를 출력하세요.
	
 */

public class Test12 {

	public static void main(String[] args) {
	// 진입점 함수
		
	int[][] munja = new int[10][2]; // 문자 10개의 데이터 2개를 관리할 배열
	
	// 문자 입력해보기
	
			/*
			
			munja[0][0] = 'A';
			munja[1][0] = 'B';
			munja[2][0] = 'C';
			
			'A' + 0 ==> 'A'
			'A' + 1 ==> 'B'
			
			*/
	
	// 첫번째 칸 문자 구하기
	for(int i = 0 ; i < munja.length ; i++) {
		munja[i][0] = 'A' + i;
	}
	
	// 랜덤으로 문자를 100번 발생시켜서 카운트 올려주기
	// 두번째 칸 카운트횟수 구하기
	for(int i = 0 ; i < 100 ; i++) {
		char ch = (char)(Math.random() * ('J' - 'A' + 1) + 'A');
		
		/*
		
		switch(ch) {
		case 'A':
			munja[0][1] += 1;
			break;
		case 'B':
			munja[1][1] += 1;
			break;
		case 'C':
			munja[2][1] += 1;
			break;
		case 'D':
			munja[3][1] += 1;
			break;
		case 'E':
			munja[4][1] += 1;
			break;
		case 'F':
			munja[5][1] += 1;
			break;
		case 'G':
			munja[6][1] += 1;
			break;
		case 'H':
			munja[7][1] += 1;
			break;
		case 'I':
			munja[8][1] += 1;
			break;
		case 'J':
			munja[9][1] += 1;
			break;
		}
		
		*/
		
		int idx = ch - 'A';
		
		/*
		
		int oldCount = munja[idx][1];
		int newCount = oldCount + 1;
		
		munja[idx][1] = newCount;
		
		*/
		
		munja[idx][1] += 1;
	}
	
	// 출력
	for(int i = 0 ; i < munja.length ; i++) {
		// 타이틀 출력
		System.out.println((char)munja[i][0] + " ");
		
		for(int j = 0 ; j < munja[i][1] ; j++) {
			System.out.println("*");
		}
		System.out.println();
		}
	
		/*
		
		for(int i = 0 ; i < munja.length ; i++ ) {
		
		int[] arr = munja[i];
		
		char ch = (char) arr[0] ; // 문자의 아스키 코드값을 꺼내서 문자로 강제 형변환
		int count = arr[1]; // 카운트 수
		
		// 타이틀 출력
		System.out.print(ch + " : ");
		
		for(int j = 0 ; j < count ; j++ ) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	
		 */
	
	}
}