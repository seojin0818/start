package day04;

import java.util.*; // 이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨
// 이 예제의 경우는 Scanner 를 사용할 예정인데 직접 * 대신 Scanner 로 명시해도 됨

// 적용 순서는 * 보다는 클래스 이름을 명시하는 방법을 우선 적용시킴

/*
 	A - abcd.txt
 		efg.txt
 	
 	B - abcd.txt
 		xyz.txt
 */

public class Test02 {
	public static void main(String[] args) {
		// 할 일
		
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
		int intArea = (int)area;
		int intDulle = (int)around;
		System.out.println(intArea);
		System.out.println(intDulle);
		
}	
}
