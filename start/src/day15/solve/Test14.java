package day15.solve;

import java.util.*;

public class Test14 {
	
/*
	
	TreeSet에 입력하는 데이터는 반드시 정렬 가능한 데이터여야 함
	
 */

	public Test14() {
		
		/*
		
		TresSet set = new TreeSset();
		Won w1= new Won(5);
		Won w2 = new Won(10);
		
		set.add(w1);
		set.add(w2);
		
		ArrayList list = new ArrayList(set);
		for(Object o : list) {
			System.out.println(o);
		}
		
		==> 에러 발생
			왜 ? Won은 정렬할 수 없는 데이터이기 때문에
			
			해결 방법
			
			1. TreeSet을 만들 때 정렬방식을 알려주면서 만드는 방법
			=> Comparator를 이용하는 방법
			
			2. Won을 정렬가능한 클래스로 만든 후 입력해주는 방법
			==> 정렬가능한 클래스로 만들어서 입력해주는 방법
			
			정렬가능한 클래스로 만드는 방법
			==> Comparable 인터페이스를 구현하는 클래스로 제작함
				소속 함수 중 compareTo(Object o) 함수를 오버라이드해서 만들어야함
				
		 */
		
		// 1번 방법
		TreeSet set = new TreeSet(new Comparator() {
			
			// 정렬 기준 정하기
			@Override
			public int compare(Object o1, Object o2) {
				Won w1 = (Won) o1;
				Won w2 = (Won) o2;
				
				int result = w1.getRad() - w2.getRad();
				
				return -result; // 내림차순
			}
		});
		
		// TreeSet을 만들어놨다고 데이터가 자동으로 채워지는 것 X
		// 데이터 채워넣기
		
		Won w1 = new Won(5);
		Won w2 = new Won(10);
		
		set.add(w1);
		set.add(w2);
		
		// 출력
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			Won w = (Won) itor.next();
			System.out.println(w);
		}
	}

	public static void main(String[] args) {
		new Test14();
	}

}
