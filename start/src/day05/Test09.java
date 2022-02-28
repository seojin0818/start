package day05;

public class Test09 {
	/*
	 	참고 ]
	 		for 명령문에 증감식, 조건식, 카운터변수 선언 초기화 부분은
	 		모두 기술하지 않아도 무방함
	 		이 때 무한반복으로 처리됨
	 		
	 		for(;;){
	 			// 이 때 이 반복문 내에서 종료시점 조건문을 기술해줘야함
	 			// 이 때 종료시점에 break 명령 기술
	 		}
	 */

	public static void main(String[] args) {
	// 진입점 함수
		
		// 1부터 숫자를 만들어서 출력하고 50이 되면 반복을 종료하세요.
		
		for(int i = 0 ; ; i++ ) {
			/*
			 	참고 ]
			 		for 명령에서 조건식에 아무것도 기술하지 않은 경우는
			 		조건식의 결과를 true로 실행하게 됨
			 */
			
			int no = i + 1;
			
			if(no > 50) {
				break;
			}
			System.out.print(no + ", ");
		}
		System.out.println();
		
		int no = 1;
		while(true) {
			/*
			if(no > 50) {
				break;
			}
				참고 ]
					블럭의 내용이 명령 하나만 기술되는 경우는
					블러기호({})를 생략할 수 있음
					
			 */
			if(no > 50) break;
			System.out.print(no + ", ");
			// 증감식
			++no;
		}
		System.out.println();
	}

}
