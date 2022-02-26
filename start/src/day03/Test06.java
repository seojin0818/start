package day03;

/*
 	문자열 데이터의 비교는
 	equals() 사용해서 비교
 	
 		형식 ]
 			
 			문자열.equals(비교할 문자열)
			
 */
public class Test06 {
	public static void main(String[] args) {
	// 진입점 함수
		
		String name1 = "홍길동";
		String name2 = new String("홍길동");
		
		// 비교연산자로 비교
		boolean bool1 = name1 == name2; 
		// 변수가 기억하는 주소를 비교한다.
		
		// equals()로 비교
		boolean bool2 = name1.equals(name2);
		
		System.out.println("name1 == name2 : " + bool1);
		System.out.println("name1.equals(name2) : " + bool2);
		// System.out.println(내용);
		// 내용 출력 + 줄 바꿈
		
		
	}
}
