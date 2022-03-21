package day16;

import java.util.*;

public class Test02 {

// HashTable에 친구의 정보를 기억시켜보자.
	
	public Test02() {
		Hashtable table = new Hashtable();
		// 데이터 추가
		table.put("이름", "제니");
		// 이처럼 Map 계열은 데이터를 입력할 때
		// 그 데이터를 구분할 키값과 데이터를 한쌍으로 만들어서 입력해야만 함
		table.put("나이", 27);
		table.put("전화", "010-1111-1111");
		
		// 데이터를 꺼내서 출력
		System.out.println("이름 : " + table.get("이름"));
		System.out.println("나이 : " + table.get("나이"));
		System.out.println("전화 : " + table.get("전화"));
		System.out.println("----------------------------");
		
		// 데이터 수정
		table.put("전화", "010-1234-5678");
		
		/*
		 
		 	같은 키값으로 데이터가 입력되면
		 	먼저 온 데이터를 삭제한 후
		 	새로운 데이터로 교체함
		 	즉, 같은 키값은 한개의 데이터만 기억할 수 있음
		 	==> 데이터는 중복될 수 있지만
		 		키값은 중복되어서 사용될 수 없음
		 		
		 */
		
		table.put("name", "제니");
		System.out.println("이름 : " + table.get("이름"));
		System.out.println("나이 : " + table.get("나이"));
		System.out.println("name : " + table.get("name"));
		
		int len = table.size(); // 저장된 데이터의 개수 반환해주는 함수
		
		// 데이터만 추출
		Collection col = table.values();
		Iterator itor = col.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		// 키값만 추출
		Enumeration en = table.keys();
		while(en.hasMoreElements()) {
			Object o = en.nextElement();
			
			System.out.println(o);
			System.out.println("\t : " + table.get(o));
		}
		
		// 키값만 추출 2
		Set set = table.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			Object data = table.get(o);
			
			// 출력
			System.out.println(o + " - " + data);
		}
		
		Set entry = table.entrySet();
		// 키와 밸류가 한쌍으로 묶어진 Map.Entry 
		// 이것이 여러개 있는것이 Set
		Iterator it3 = entry.iterator();
		while(it3.hasNext()) {
			Map.Entry en1 = (Map.Entry) it3.next();
			Object key = en1.getKey();
			Object value = en1.getValue();
			System.out.println(key + " : " + value);
		}
	}
	

	public static void main(String[] args) {
		new Test02();

	}

}
