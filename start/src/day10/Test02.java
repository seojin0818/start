package day10;

/*
 
	블랙핑크 친구들의 정보를 기억시키고 출력하세요.
	
 */

public class Test02 {
	public Test02() {
		Friend f1 = new Friend();
//		f1.name = "제니"; // name이 private이니까 Friend class에서만 수정 가능
		// 제니 정보 세팅
		f1.setName("제니");
		f1.setAddr("ygM");
		f1.setBirth("1996/03/08");
		f1.setMail("jennie@githrd.com");
		f1.setTel("010-1111-1111");
		f1.setAge(27);
		f1.setGen('F');
		
		// 출력
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
			
		// 로제 객체
		Friend f2 = new Friend();
		f2.setName("로제");
		f2.setAddr("ygM");
		f2.setBirth("1998/05/05");
		f2.setMail("rose@githrd.com");
		f2.setTel("010-3333-3333");
		f2.setAge(26);
		f2.setGen('F');
		
		System.out.println(f2.toString());
		
		// 리사 객체
		Friend f3 = new Friend();
		f3.setName("리사");
		f3.setAddr("ygM");
		f3.setBirth("1996/04/05");
		f3.setTel("010-2222-2222");
		f3.setAge(28);
		f3.setGen('F');
		
		System.out.println(f3.toString());
		
		// 지수 객체
		Friend f4 = new Friend();
		f4.setName("지수");
		f4.setAddr("ygM");
		f4.setBirth("1997/07/07)");
		f4.setTel("010-4444-4444");
		f4.setAge(27);
		f4.setGen('F');
		
		System.out.println(f4.toString())
		;
		// 네 멤버를 하나의 변수로 관리해보자.
		Friend[] black = new Friend[4];
		// 이렇게 하면 Friend 타입의 데이터를 기억할 공간 4개를 확보한 상태이기만 함
		// 아직 각 공간에는 아무런 데이터가 들어있지 않음
		
		Friend tmp1= black[0];
		
//		System.out.println("name : " + tmp1.getName());
		
		/*
		 	
		 	아직 Friend 의 객체가 배열의 각 방에 채워지지 않았음
		 	따라서 멤버함수를 호출할 수 없음
		 	
		 */
		
		// 위에서 만든 Friend 객체를 순서대로 배열에 채워주기
		black[0] = f1;
		black[1] = f2;
		black[2] = f3;
		black[3] = f4;
		
	}
	public static void main(String[] args) {
		// 진입점 함수
		new Test02();
	}

}
