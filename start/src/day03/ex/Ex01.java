package day03.ex;

	/*
	
 	문제 1 ]
	
 		두개의 숫자를 입력 받은 후 (가로, 세로)
 		그 숫자를 이용해서 
 		사각형의 넓이와 ==> 가로 X 세로
 		삼각형의 넓이를 구해서 ==> 밑변 X 높이 X 1/2
 		결과를 출력하세요.
 		
 	출력형식 ]
 		
 		가로 : XXXXX
 		세로 : XXXXX
 		사각형 넓이 : XXXXXX
 		삼각형 넓이 : XXXX.X
			
 	참고 ]
	
 		자바에서 * 기호의 의미
 			1) 연산자로서 곱하기의 의미
 			2) 모든 것
 */
import java.util.*;
// 이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨
// 이 예제의 경우는 Scanner 를 사용할 예정인데 직접 * 대신 Scanner 로 명시해도 됨
// 적용 순서는 * 보다는 클래스 이름을 명시하는 방법을 우선 적용시킴

public class Ex01 {
	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력 받기 전 입력 메세지 출력
		System.out.print("가로 : ");
		// System.out.print(내용);
		// 내용 출력 + 줄 바꿈 x
		
		/*
		
		문자열로 입력받아서 처리하는 방법
		
		String garo = sc.nextLine(); 
		// 문자열로 입력받는 방법
		// Integer.parseInt(문자열);
		// 정수 형태의 문자열을 정수로 변환하는 방법
		int width = Integer.parseInt(garo);
		
		*/
		
		/*
		 
		 정수로 입력 받는 방법
		 int 변수이름 = sc.nextInt();
		 
		 */
		
		int width = sc.nextInt();
		
		// 3) 가로 먼저 출력
		// System.out.println("입력된 가로 : " + garo);
		System.out.println("입력된 정수 가로 : " + width);
		// System.out.println(내용)
		// 내용 출력 + 줄 바꿈
		
		// 4) 세로 출력
		System.out.print("세로 : ");
		// 입력 도구에 입력한 메세지 출력
		// System.out.print(내용);
		// 내용 출력 + 줄 바꿈 x
		int sero = sc.nextInt();
		// 정수로 입력 받는 방법
		// int 변수이름 = sc.nextInt();
		System.out.println("입력된 정수 세로 : " + sero);
		
		// 5) 계산
		// 삼각형은 2분의 1 (=0.5) 이므로 소수점 형식의 double형 사용 ! 이 때 .을 붙여줌
		int sagak = width * sero;
		double samgak = width * sero / 2.0;
		// 혹은 double samgak = width * sero * 0.5;
		// 혹은 double samgak = width * sero / (double)2;
		
		// 6) 최종 출력
		System.out.println("사각형 넓이 : " + sagak);
		System.out.println("삼각형 넓이 : " + samgak);
		
/* 강사님 풀이 ]
 
 사각형 넓이
 int sagak = width * sero;
 
 사각형 넓이 출력
 System.out.println("사각형 넓이 : " + sagak);
 
 삼각형 넓이
 double samgak = width * sero * 0.5
 double sagmak = width * sero / 2 
 ==> 정수 나누기 정수는 정수인데
 double 형태로 나와야하니까 .만 써도 double 형태가 됨
 double samgak = width * sero / (double)2;
 double samgak = width * sero * 2.0;
 
 삼각형 넓이 출력
 System.out.println("삼각형 넓이 : " + samgak);
 
	*/	
	}
	
}
