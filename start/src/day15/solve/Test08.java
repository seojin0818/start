package day15.solve;

import java.util.LinkedList;

public class Test08 {

	public Test08() {
		
		LinkedList member = new LinkedList();
		
		member.add("곰");
		member.add("돌");
		member.add("이");
		member.add("짱");
		
		
		// 위와 같이 한가지 형태의 데이터만 입력하면
		// 꺼내서 사용할 때 한가지 방식으로 처리할 수 있기 때문에 편함
		
		int len = member.size(); // 컬렉션에 추가된 데이터의 개수를 알려주는 함수
		for(int i = 0 ; i < len ; i++) {
			String name = (String) member.get(i);
			
			System.out.println(name);
		}
		
		System.out.println(member); // 데이터 꺼내는 용도가 아닌 내용 확인용
		
	}
	public static void main(String[] args) {
		new Test08();
	}

}
