package day02;

public class Test02 {
	// 클래스의 접근지정자는 public 혹은 생략만 가능
	// 클래스 이름의 첫 글자는 대문자
	// 특수문자는 _, $ 두 가지만 가능 (첫 글자로도 가능)
	// 두 단어 이상으로 구성될 때는 각 단어의 첫 글자를 대문자로 표기하는 Camel 표기법
	
	public static void main(String[] args) {
	// 진입점 함수
		
		// 문자열 변수를 만드는 방법
		
		// 1. 데이터를 직접 입력해서 만드는 방법
		String name1 = "홍길동";
		// 2. 클래스를 new 시켜서 만드는 방법
		String name2 = new String("홍길동");
		
		// 최종 출력하기
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		System.out.println("name1 == name2 : " + (name1 == name2));
		//System.out.println(내용);
		// 내용 출력 + 줄 바꿈
		// 문자열을 표시할 때는 ""
		
		// 클래스를 new 시키면 주소가 다르기 때문에 name1과 name2는 같지 않음
		
	}	
}
