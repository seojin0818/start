package day16.solve;

import java.util.*;

public class Test05 {

// 맵에 이름을 키값으로 하고 나이를 데이터로 입력해보자.
	
	public Test05() {
		// TreeMap 만들기
		TreeMap map = new TreeMap();
		
		map.put("제니", 27);
		map.put("리사", 28);
		map.put("로제", 26);
		map.put("지수", 27);
		
		// 출력
		Set keys = map.keySet();
		for(Object key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
	
		// 이름 기준으로 내림차순 정렬해서 맵에 넣어보자.
		// String을 어떻게 정렬할까?
		// String 클래스 내에 Comparable 인터페이스 구현 중
		// 소속함수 compareTo 오버라이딩하기
		
		TreeMap map1 = new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				
				String name1 = (String) o1;
				String name2= (String) o2;
				
				int result = name1.compareTo(name2);
				
				return -result;
				
			}
			
		
		});
		
		// 맵에 이름을 키값으로 하고 나이를 데이터로 입력해보자.
		map1.put("제니",  27);
		map1.put("리사",  28);
		map1.put("로제",  26);
		map1.put("지수",  27);
		
		// 출력
		Set keys1 = map1.keySet();
		for(Object key : keys1) {
			System.out.println(key + " : " + map1.get(key));
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
