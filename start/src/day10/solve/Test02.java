package day10.solve;

/*

	블랙핑크 친구들의 정보를 기억시키고 출력하세요.

*/

public class Test02 {
	public Test02() {
		Friend f1 = new Friend();
		// 제니 정보 세팅
		f1.setName("제니");
		f1.setAddr("ygM");
		f1.setBirth("1996/03/08");
		f1.setMail("jennie@githrd.com");
		f1.setTel("010-1111-1111");
		f1.setAge(27);
		f1.setGen('F');
		
		// f1.name 은 안되는 이유?
		// name이 private 이니까 Friend class에서만 수정 가능
		
	/*
	 System.out.println("제니의 이름 : " + f1.getName());
	 System.out.println("제니의 주소 : " + f1.getAddr());
	 System.out.println("제니의 생일 : " + f1.getBirth());
	 System.out.println("제니의 메일 : " + f1.getMail());
	 System.out.println("제니의 전화 : " + f1.getTel());
	 System.out.println("제니의 나이 : " + f1.getAge());
	 System.out.println("제니의 성별 : " + f1.getGen());
	 */
		
		System.out.println(f1.toString());
		
		//로제 객체
		Friend f2 = new Friend();
		
		// 리사 객체
		Friend f3 = new Friend();
		
		// 지수 객체
		Friend f4 = new Friend();
		
		// 네 멤버를 하나의 변수로 관리
		Friend[] black = new Friend[4];
		// 이렇게 하면 Friend 타입의 데이터를 기억할 공간 4개를 확보만 해놓은 상태
		// 아직 각 공간에는 아무런 데이터가 들어있지 않음
		
		Friend tmp1 = black[0];
		
		black[0] = f1;
		black[1] = f2;
		black[2] = f3;
		black[3] = f4;
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
