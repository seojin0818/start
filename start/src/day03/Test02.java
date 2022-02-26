package day03;

public class Test02 {
	public static void main(String[] args) {
	// 진입점 함수
		
		System.out.println("3.14 + 10 : " + 3.14 + 10);
		// System.out.println(내용);
		// 내용 출력 + 줄 바꿈
		
		// ==> 3.14 + 10 : 3.1410
		
		// 괄호가 없는 경우
		// 1) "3.14 + 10 : " + 3.14 ==> 3.14 + 10 : 3.14
		// 2) "3.14 + 10 : 3.14" + 10 ==> 3.14 + 10 : 3.1410
		
		System.out.println("3.14 + 10 : " + (3.14 +10));
		// System.out.println(내용);
		// 내용 출력 + 줄 바꿈
		
		// => 3.14 + 10 : 13.14
	}
}
