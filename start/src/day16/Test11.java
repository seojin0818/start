package day16;

import java.util.*;

public class Test11 {

/*

	blackpink 멤버들의 이름을 기억하는 Set 만들어서 출력해보자.
	이 때 문자열만 입력되도록 처리하세요.
	
 */
	
	public Test11() {
		HashSet<String> set = new HashSet<String>();
		// 이 Set은 문자열만 입력 받도록 조치해놓은 Set
		// 따라서 꺼낼때는 꺼낸 데이터는 당연히 문자열
		
		set.add("제니");
		set.add("리사");
		set.add("로제");
		set.add("지수");
		
		// 향상된 for 명령으로 꺼내는 방법
		for(String name : set) {
			System.out.println(name);
		}
		
		// 제너릭스는 전파되지 않음
		ArrayList blackpink = new ArrayList(set);
		
		// 따라서 제너릭스 다시 선언
		/*
		ArrayList<String> blackpink = new ArrayList<String>(set);
		for(int i = 0 ; i < blackpink.size(); i++) {
			System.out.println(blackpink.get(i));
		}
		*/
		
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			String name = itor.next();
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
