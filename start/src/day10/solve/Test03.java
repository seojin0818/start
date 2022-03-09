package day10.solve;

/*

Black Pink 멤버의 정보를 기억할 배열을 만들고
데이터를 입력한 후
완성이 되면 내용을 출력하세요.

단, 각 멤버의 정보는 Friend 클래스에 기억시키도록 함

*/

public class Test03 {
	
	// 변수 선언 (1번)
	String[] names;
	String[] tels;
	String[] email;
	String[] birthday;
	int[] nai;
	char gen;
	String addrs;
	
	public Test03() {
		// 멤버변수들 초기화 (3번)
		setData(); // 필요한 데이터들이 준비된 상태
		
	// 각 멤버를 배열 하나로 관리 (4번)
	Friend[] black = getBlack();
	// getBlack() 이라는 함수 = Friend 타입의 배열을 반환시켜서 black에 저장되도록 하는 함수
	
	// 내용 출력 (8번)
	for(Friend f : black) {
		System.out.println(f);
		// 이렇게 하면 Friend 클래스에 재정의한 toString() 함수가 자동호출됨
	}
	
	}
	// 준비된 데이터를 Friend[] 타입의 데이터로 만들어서 변환해주는 함수
	// 왜 ? Heap 타입이 같아야 변수에 담을 수 있으니까
	public Friend[] getBlack() { // (5번)
		// 이 함수는 Friend[] 배열을 만들고
		Friend[] anne = new Friend[4]; // 아직 방만 만들어지고 Friend[] 객체는 들어가있지 않음
		for(int i = 0; i< 4 ; i++) { // 각 방에 Friend 객체들 채워넣기
			anne[i] = new Friend(); // ♥♥♥♥
			// anne의 i번째 방에는 네번 new Friend 해줌
		}
		
		// 위의 반복문이 종료되면 각 방에 있는 객체의 변수에 데이터를 입력할 수 있는 상태가 됨
		
		// 데이터를 채우고 (6번)
		for(int i = 0 ; i < anne.length ; i++) {
			Friend f = anne[i];
			String name = names[i];
			f.setName(name);
			f.setAddr(addrs);
			f.setTel(tels[i]);
			f.setMail(email[i]);
			f.setBirth(birthday[i]);
			f.setGen(gen);
		}
		// 채워진 채의 배열을 반환함 (7번)
		return anne;
	
	}
	// 각 데이터를 초기화 시켜주는 함수 (2번)
	public void setData() {
		names = new String[] {"제니", "리사", "로제", "지수"};
		tels = new String[] {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444"};
		email = new String[] {
				"jennie@githrd.com", "lisa@githrd.com", "rose@githrd.com", "jisoo@githrd.com"
				};
		birthday = new String[] {
				"1996/03/08", "1996/04/05", "1998/05/05", "1996/07/07"
		};
		nai = new int[] {27, 28, 26, 27};
		gen = 'F';
		addrs = "ygM";
	}

	public static void main(String[] args) {
		new Test03();
	}
}
