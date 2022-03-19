package day15.solve;

import java.util.*;

public class Test12 {

/*
	 
 	하리보 멤버를 HashSet에 저장한 후 꺼내서 출력해보자.
 	
 */
	
	public Test12() {
		
		HashSet set = new HashSet();
		
		set.add("곰");
		set.add("돌");
		set.add("이");
		set.add("짱");
		
		// 입력된 개수 꺼내오기
		int len = set.size();
		System.out.println("채워진 멤버 수 : " + len);
		
		/*
		
			Set 계열 컬렉션은 데이터를 꺼내는 함수가 없음
			따라서 데이터를 꺼내서 사용해야 할 경우에는
				1. Iterator로 변환 후 꺼내서 사용하거나
				2. List 계열로 변환 후 하나씩 꺼내서 사용하거나
	
		 */
		
		System.out.println("1. Iterator 를 사용하는 방법");
		
		Iterator itor = set.iterator();
		
		while(itor.hasNext()) {
			// hasNext() : 꺼낼 데이터가 남아있는지 알려주는 함수 / 반환값은 Boolean Type
			
			// 데이터 꺼내기
			String name = (String) itor.next(); // next() : 데이터를 꺼내오는 함수
			
			// 출력
			System.out.println(name);
		}
		
		System.out.println();
		
		System.out.println("2. List 계열로 변환 후 사용하는 방법");
		
		Vector vec = new Vector(set);
		
		// 데이터 꺼내기
		for(int i = 0 ; i < vec.size() ; i++) {
			String name = (String) vec.get(i);
			
			// 출력
			System.out.println(name);
		}
		
	}

public static void main(String[] args) {
	new Test12();
	
	}
}