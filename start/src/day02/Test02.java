package day02;

public class Test02 {
	public static void main(String[] args) {
	// 진입점 함수
		
		// 문자열 변수를 만드는 방법
		
		// 1) 데이터를 직접 입력해서 만드는 방법
		String name1 = "홍길동";
		// 2) 클래스를 new 시켜서 만드는 방법
		String name2 = new String("홍길동");
		
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		System.out.println("name1 == name2 : " + (name1 == name2));
		//System.out.println(내용);
		// 내용 출력 + 줄 바꿈
		
		// 클래스를 new 시키면 주소가 다르기 때문에 name1과 naem2는 다름
		
	}	
}
