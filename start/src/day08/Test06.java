package day08;

/*
	
	문제 ]
	
		하리보 멤버들의 이름을 기억할 배열을 만들고
		이름을 입력해서 출력하세요.
	
 */

public class Test06 {

	public static void main(String[] args) {
	// 진입점 함수
		
		// 이름을 기억할 배열 만들기
		String[] haribo;
//		System.out.println(Arrays.toString(haribo)); ==> 아직 변수만 준비한 상태
		
		haribo = new String[4];
		// 문자열 데이터를 기억할 공간만 확보한 상태
		// 각 방은 null 상태
		
		// 이름 입력
		haribo[0] = "곰";
		haribo[1] = "돌";
		haribo[2] = "이";
		haribo[3] = "짱";
		
		// 출력
		for(int i = 0 ; i < haribo.length ; i++) {
			System.out.println(haribo[i]);
		}

	}

}
