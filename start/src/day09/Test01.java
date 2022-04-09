package day09;

public class Test01 {
	
	int no = 10;
	
	static void abc(int no) {
	// abc라는 이름의 함수
	}
	
	public static void main(String[] args) {
	// 진입점 함수
		abc(10);
	}

	void xyz() { 
	// xyz라는 이름의 함수
	// 무언가 기능이 필요한 경우 함수 제작
		int no = 10;
		abc(no);
		
// 		1, "숫자 : " ==> "숫자 : 1"
//		add("abc : ", 10); ==> 매개변수의 순서가 다르므로 X
		add(10, "abc : ");
	}
	
	public String add(int no, String str) {
	// add라는 이름의 함수
	// 반환값은 String 타입
		String result = str + no; 
		// 문자열 + 정수 = 문자열
		return result;
	}
}
