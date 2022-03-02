package day05;

public class Test10 {

	public static void main(String[] args) {
	// 진입점 함수
		
		int no = 10;
		
		do {
			System.out.println("no : " + no);
//			++no;
		} while(++no < 10); // 조건식에 맞지 않지만 do-while문이라서 한번은 실행
							// 어떤 상황이라도 한 번은 실행하는 것이 do-while문의 핵심

	}

}

/*

 do-while 명령 : 다른 반복문과 비교해서 최소 한번은 반드시 실행한다는 차이점
 while문과 비교해 조건이 맨 마지막에 온다는 점이 다름
 
 형식 ]
 	
 		카운터변수 선언;
 		do {
 			실행문;
 			카운터변수 증감식;
 		} while (반복조건);
 		
 */
