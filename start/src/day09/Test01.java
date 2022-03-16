package day09;

public class Test01 {
	int no = 10;
	
	// abc라는 이름의 함수
	static void abc(int no) {
		
	}
	
	public static void main(String[] args) {
	// 진입점 함수
		abc(10);
	}

	void xyz() { // 무언가 기능이 필요한 경우 함수 제작
		int no = 10;
		abc(no);
		
		// 1, "숫자 : " ==> "숫자 : 1"
//		add("abc : ", 10); // 순서가 달라서 안됨 매개변수의 형태가 달라지게 입력했기 때문에
		add(10, "abc : ");
	}
	
	public String add(int no, String str) {
		String result = str + no; // 문자열 + 정수 = 문자열
		return result;
	}
}