package day07;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		
		/*
		
			정수 6개를 관리할 배열 arr 을 만들고
			1 ~ 6까지 채워서 
			한개씩 꺼내서 출력하세요.
			
		 */
		
		// 할 일
		// 1) 배열 변수 선언
		
		/*
		 	
		 	배열 변수의 선언 형식 : 데이터타입[] 변수;
		 	
		 */
		
		int[] arr;
		
		// 2) 배열 변수 초기화
		arr = new int[6];
		
		// 3) 배열의 길이 구하기
		// 참고 ] 배열의 길이를 알아내는 방법 : 배열.length
		int len = arr.length;
		
		// 4) 데이터 입력
		// Heap에 만들어지는 기본데이터타입은 변수들은 모두 자동 초기화 됨
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		
		// 5) 최종 출력
		for(int i = 0 ; i < len ; i++) {
			// 배열에 기억된 데이터를 꺼내는 방법 : 배열변수[위치값]
			int no = arr[i];
			System.out.println(no);
		}
		
		/*
		 
	 	Heap에 만들어지는 기본데이터타입 변수들은 모두
	 	자동 초기화 됨
	 		boolean : false
	 		char	: 아스키코드값 0에 해당하는 문자
	 		byte	:	0
	 		short	:	0
	 		int		:	0
	 		long	:	0
	 		float	:	0.0f
	 		double	:	0.0
	 		
	 		나머지는 null
	 		
	 */
		// 하리보 젤리의 색상을 기억할 배열을 만들어서 출력하세요.
		// 하리보 젤리의 색상은 4개로 구성되어 있습니다.
		// 흰색, 주황색, 연두색, 파란색
		
		// 할 일
		// 1) 배열 변수 선언 및 배열 변수 초기화
		String[] haribo = new String[4];
		
		// 2) 출력
		for(int i = 0 ; i < haribo.length ; i++) {
					// int len = haribo.length;
			System.out.println(haribo[i]);
		} // 기본데이터타입이 아니라서 null 출력됨
		
		// 3) 데이터 입력
		haribo[0] = "흰색";
		haribo[1] = "주황색";
		haribo[2] = "연두색";
		haribo[3] = "파란색";
		
		// 4) 내용 확인용 출력
		System.out.println(Arrays.toString(haribo));
		
		// 5) 데이터를 하나씩 꺼내서 출력
		for(int i = 0 ; i < haribo.length ; i++) {
			
			/*
			
		 	참고 ]
		 	
		 		여러개의 데이터를 관리하는 데이터타입들은
		 		데이터 한개를 꺼냈을 때의 그 데이터의 타입을
		 		먼저 생각해봐야 함
		 		
			 */
			
			String name = haribo[i];
			// i번째의 색상의 이름을 꺼내서 변수에 기억시킴
			System.out.println(name);
			// 변수에 기억된 데이터 출력
		}
		
		// 보라색을 추가해서 출력하세요.
		
		/*
		
	 	참고 ]
	 		
	 		배열은 한 번 만들어지면 크기와 타입 수정 불가
	 		따라서 데이터의 개수가 수정이 필요하면
	 		배열을 다시 만들어서 변수에 기억시키기
	 		
		 */
		
		// 배열 다시 만들기
		String[] tmp = new String[5];
		for(int i = 0 ; i < 4 ; i++) {
			tmp[i] = haribo[i];
		}
		
		// 이렇게 하면 다섯번째 방은 아직 비어있음
		tmp[4] = "보라색";
		// 위치값은 1 작으니까
		
		haribo = tmp;
		
		// 데이터를 하나씩 꺼내서 출력
		// 배열과 같은 데이터는 향상된 for 명령(forEach 명령)이 데이터를 꺼내기 편함
		for(String name : haribo) {
		// 의미 ] "haribo의 데이터를 순차적으로 하나씩 꺼내서 name 변수에 기억시키세요."
			
			System.out.print(name + " ");
		}
		
	}
}
