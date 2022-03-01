package day04.ex;
// 이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨

/*
 	문제 5 ]
 		
 		3자리 숫자(100~999)를 입력 받아서
 		이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
 		얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요.
 		
 		ex ]
 		
 			241		은 200에 가까우므로 41을 빼야함
 			777		은 800에 가까우므로 23을 더해야함
 			
 */

public class Ex05 {
	public static void main(String[] args) {
	// 진입점 함수

			
/* 강사님 풀이 ]
 
 	public static void main(String[] args){
 	진입점 함수
 	
 	1) 세 자리 정수를 입력받기
 	String sno = JOptionPane.showInputDialog("세자리 정수 입력 : ");
 	정수 형태의 문자열 - 산술 연산을 할 수 있는 건 아님
 	
 	2) 입력 받은 데이터는 정수 형태의 문자열이므로 정수로 변환해주기
 	정수형태의 문자열을 정수로 변환해주는 기능을 가지고 있는 함수는 Integer.parseInt(문자열);
 	int no = Integer.parseInt(sno);
 	
 	3) 마지막 두 자리만 얻어내면 끝나므로 10단위 이하만 추출하기
 	int num = no - (no / 100 * 100); ==> 이건 별로
 	int num = no % 100; ==> 100으로 나눈 나머지면 10단위 이하만 나오니까
 	
 	4) num이 50보다 큰지 판별하기
 	int hap = 0;
 	int result = 0;
 	
 	5) 141은 41을 빼야하고 891은 9를 더해야함
 	hap = num > 50 ? 100 - num // 76이라면 100 - 76을 더해줘야함
 			: num ;
 			
 	result = num > 50 ? no + hap : no - hap;
 		
 */

/* 
 	다른 방법
 	result = num > 50 ? (no / 100 + 1) * 100 : (no / 100) * 100;
 	
 	String str = num > 50 ? "더해줘야한다. " : "빼줘야한다.";
 	
 	출력
 	System.out.println("입력한 정수 " + no + " 는 " + result + " 가까우므로 " + hap + " 을 " + str);
 	
 */
		
	}
}
