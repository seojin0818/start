package day16.solve;

import java.util.*;

public class Test01 {
	
	/*
	
		HashSet은 해쉬코드로 내부적 정렬
		Nemo 클래스를 만들고 가로가 같은 네모면 같은 네모로 처리되도록 하세요.
		
	 */

	public Test01() {
		Nemo n1 = new Nemo(5, 3);
		Nemo n2 = new Nemo(5, 5);
		Nemo n3 = new Nemo(5, 6);
		Nemo n4 = new Nemo(5, 7);
		
		// HashSet 만들기
		HashSet set = new HashSet();
		
		// 위에 만든 네모를 넣어보기
		set.add(n1);
		set.add(n2);
		set.add(n3);
		set.add(n4);
		
		// 네모가 같다면 HashSet에 넣어지지 않음
		ArrayList list = new ArrayList(set);
		
		for(Object o : list) {
			System.out.println(o);
			// 출력이 목적이면 최종적으로 오버라이드 된
			// Nemo의 toString()가 호출되므로 강제 형변환 필요 X
			
			/*
			 
			 for(Object o : new ArrayList(set)){
			 	System.out.println(o)
			 	
			 */
		}
	}

	public static void main(String[] args) {
		new Test01();
	}
	
}
