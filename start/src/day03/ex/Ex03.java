package day03.ex;

public class Ex03 {
	/*
	
 	문제 3] 
		
		84232원을 지불하려고 한다.
 		우리나라 화폐 단위별로 이 금액을 지불하려면
 		각 단위가 몇개씩 필요한지 계산해서 출력하세요.
 	
 	화폐단위
 		50000원권
 		10000원권
 		5000원권
 		1000원권
 		500원권
 		100원권
 		50원권
 		10원권
 		1원권
 		
 */
	public static void main(String[] args) {
	// 진입점 함수
		
/* 강사님 풀이 ]

  1) 기준 데이터 잡기
	84232 ==> 정수형 int 이므로
	int total = 84232;
 
 2) 연산을 위한 변수 생성
 	int tmp = total;
 	
 3) 각 화폐 단위로 나누고 나머지 값으로 다시 연산 반복
 	따라서 / 와 % 필요
 	
 	50000원권
 	int oman = tmp / 50000;
 	50000원권을 제외한 금액 기억
 	tmp = tmp % 50000;
 	(왼쪽 tmp는 34232, 오른쪽 tmp는 84232)
 	
 	10000원권
 	int man = tmp / 10000;
 	10000원권을 제외한 금액 기억
 	tmp = tmp % 10000;
 	(왼쪽 tmp는 4232, 오른쪽 tmp는 34232)
 	
 	5000원권
 	int ocheon = tmp / 5000;
 	5000원권을 제외한 금액 기억
 	tmp = tmp % 5000;
 	(왼쪽 tmp는 4232, 오른쪽 tmp는 4232)
 	
 	1000원권
 	int cheon = tmp / 1000;
 	1000원권을 제외한 금액 기억
 	tmp = tmp % 1000;
 	(왼쪽 tmp는 232, 오른쪽 tmp는 4232)
 	
 	500원권
 	int obaek = tmp / 500;
 	500원권을 제외한 금액 기억
 	tmp = tmp % 500;
 	(왼쪽 tmp는 232, 오른쪽 tmp는 232)
 	
 	100원권
 	int baek = tmp / 100;
 	100원권을 제외한 금액 기억
 	tmp = tmp % 100;
 	(왼쪽 tmp는 32, 오른쪽 tmp는 232)
 	
 	50원권
 	int osip = tmp / 50;
 	50원권을 제외한 금액 기억
 	tmp = tmp % 50;
 	(왼쪽 tmp는 32, 오른쪽 tmp는 32)
 	
 	10원권
 	int sip = tmp / 10;
 	10원권을 제외한 금액 기억
 	tmp = tmp % 10;
 	(왼쪽 tmp는 2, 오른쪽 tmp는 32)
 	
 	1원권
 	int il = tmp % 10;
 	
 	System.out.println("총 금액 " + total + "원은");
 	System.out.println("오만원권 : " + oman + "장");
 	System.out.println("만원권 : " + man + "장");
 	System.out.println("오천원권 : " + ocheon + "장");
 	System.out.println("천원권 : " + cheon + "장");
 	System.out.println("오백원권 : " + obaek + "장");
 	System.out.println("백원권 : " + baek + "장");
 	System.out.println("오십원권 : " + osip + "장");
 	System.out.println("십원권 : " + sip + "장");
 	System.out.println("일원권 : " + il + "장");

 */
	}
}
