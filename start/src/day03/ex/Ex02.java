package day03.ex;

	/*
	 	문제 2 ]
	 		하나의 숫자를 입력받은 후 (원의 반지름)
	 		그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
	 		
	 		참고 ]
	 			원의 넓이 : 반지름 * 반지름 * 3.14
	 			원의 둘레 : 2 * 반지름 * 3.14
	 */
	import java.util.Scanner;
	public class Ex02 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("원의 반지름 : ");
			
			int ban = sc.nextInt();
			
			System.out.println("입력된 원의 반지름 : " + ban);
			
			double width = (ban * ban * 3.14);
			double dul = (2 * ban * 3.14);
			
			System.out.println("원의 넓이 : " + width);
			System.out.println("원의 둘레 : " + dul);
 }

	
	// 이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨
	// 이 예제의 경우는 Scanner 를 사용할 예정인데 직접 * 대신 Scanner 로 명시해도 됨

	// 적용 순서는 * 보다는 클래스 이름을 명시하는 방법을 우선 적용시킴

	/*
	 	A - abcd.txt
	 		efg.txt
	 	
	 	B - abcd.txt
	 		xyz.txt
	 		
	/* 강사님 풀이
	 * 
	 */
	// 할 일
	/*
	// 입력 도구 준비
	Scanner sc = new Scanner(System.in);
	// 입력 받기 전에 메세지 출력
	System.out.print("반지름 : ");
	// 입력 받는다. 변수에 기억
	int rad = sc.nextInt();
	// 계산하고
	double pi = 3.14;
	// 원의 넓이 계산 : 숫자 데이터의 연산은 항상 큰 데이터 타입으로 결과 도출
	double area = rad * rad *pi;
	// 원의 둘레 계산
	double around = 2 * rad * pi;
	// 출력하고
	System.out.println("반지름 : " + rad);
	System.out.println("넓  이 : " + area);
	System.out.println("둘  레 : " + around);
	
	
	/*
	 	참고 ]
	 		형변환에서 큰 타입의 데이터를 작은 타입으로 변환하면
	 		남는 부분은 버림 (소수점 이하 반올림 안하고 그냥 버림)
	 */
	/*
	int intArea = (int)area;
	int intDulle = (int)around;
	System.out.println(intArea);
	System.out.println(intDulle);
	*/
}	