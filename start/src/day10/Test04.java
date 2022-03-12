package day10;

// Friend[] black 이 전역변수일 경우

public class Test04 {
	
	// 변수 선언 (1번)
	String[] names;
	String[] tels;
	String[] email;
	String[] birthday;
	int[] nai;
	char gen;
	String addrs;
	
	Friend[] black;
	
	public Test04() {
		// 데이터 변수들 세팅하고
		setData(); // (3번)
		// 배열 완성하고
		setBlack(); // (5번)
		// 출력
		toPrint(); // (6번)
	}
	
	// Friend 배열 내용 출력해주는 함수
	public void toPrint() { // (7번)
	// 이 함수가 호출되면 전역변수 black의 내용을 출력할 일이 있을 때이므로
	// 별도로 데이터를 입력받지 않아도 배열에 접근 가능
		for(int i = 0 ; i < black.length ; i++) {
			String name = black[i].getName();
			String addr = black[i].getAddr();
			String tel = black[i].getTel();
			String mail = black[i].getMail();
			String birth = black[i].getBirth();
			int age = black[i].getAge();
			char gen = black[i].getGen();
			
			System.out.println("이름 : " + name);
			System.out.println("주소 : " + addr);
			System.out.println("전화 : " + tel);
			System.out.println("메일 : " + mail);
			System.out.println("생일 : " + birth);
			System.out.println("나이 : " + age);
			System.out.println("성별 : " + ((gen == 'M') ? "남자" : "여자"));
			System.out.println("+++++++++++++++++++++++");
		}
	}
	
	public void setBlack() { // (4번)
		// 이미 있는 변수이므로 반환값 없음
		// 데이터 기억할 공간 확보하고
		black = new Friend[4];
		
		// 확보된 공간에 데이터 채워주고
		for(int i = 0 ; i < black.length ; i++) {
			black[i] = new Friend();
		}
		
		// 각 방의 객체에 데이터 채워주고
		for(int i = 0 ; i < black.length ; i++) {
			Friend f = black[i];
			
			f.setName(names[i]);;
			f.setTel(tels[i]);
			f.setAddr(addrs);;
			f.setMail(email[i]);;
			f.setBirth(birthday[i]);
			f.setGen(gen);
			f.setAge(nai[i]);
			
//			black[i] = f; // 주소를 인덱스위치의 내용과 변수가 공유하기 때문에 의미 없음
		}
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
		new Test04();
	}
}
