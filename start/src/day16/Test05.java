package day16;

import java.util.*;

public class Test05 {

	public Test05() {
		TreeMap map = new TreeMap();
		// 맵에 이름을 키값으로 하고 나이를 데이터로 입력해보자.
		map.put("제니", 27); // a < ab, a < aA 
		map.put("리사", 28);
		map.put("로제", 26);
		map.put("지수", 27);
		
		// 출력
		Set keys = map.keySet();
		for(Object key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		
		// 이름 기준으로 내림차순 정렬해서 맵에 넣어보자.
		TreeMap map1 = new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String name1 = (String) o1;
				String name2 = (String) o2;
				
				int result = name1.compareTo(name2);
				// java.lang - String 클래스 - Comparable 인터페이스 구현 중 - 소속함수에 compareTo
				
				return -result;
			}
			
		});
		
		// 맵에 이름을 키값으로 하고 나이를 데이터로 입력해보자.
		map1.put("제니", 27); // a < ab, a < aA 
		map1.put("리사", 28);
		map1.put("로제", 26);
		map1.put("지수", 27);
		
		// 출력
		Set keys1 = map1.keySet();
		for(Object key : keys1) {
			System.out.println(key + " : " + map1.get(key));
		}
		
		System.out.println("--------------------");
		
		// Map.Entry로 꺼내서 처리하는 방법
		Set set = map1.entrySet();  // set에는 데이터 객체가 맵에 쌓아둔 개수만큼 있음
		// Map.Entry는 VO
		// 추가된 데이터 개수만큼 Map.Entry를 만들어서 Set에 추가해서 반환해줌
		// Map.Entry 안의 변수는 2개 (키, 밸류)
		Iterator itor = set.iterator();
		// Iterator는 버퍼메모리에 기억되므로 한번 꺼내면 사라짐
		// Set을 순차적으로 꺼낼 목적으로 Iterator로 변환시켜놓은 것
		while(itor.hasNext()) {
			Object obj = itor.next();
			Object key = ((Map.Entry) obj).getKey();
			Object value = ((Map.Entry) obj).getValue();
			
			String name = (String) key;
			int age = (int) value;
			
			// 출력
			System.out.println(name + " : " + age);
		}
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
