package day15;

import java.util.*;

public class Test14 {
	
/*
	
	TreeSet에 입력하는 데이터는 반드시 정렬가능한 데이터여야 함
	
 */

	public Test14() {
		
		/*
		
		TreeSet set = new TreeSet();
		Won w1 = new Won(5);
		Won w2 = new Won(10);
		
		set.add(w1);
		set.add(w2);
		
		ArrayList list = new ArrayList(set);
		for(Object o : list) {
			System.out.println(o);
		}
		
		==> 이 작업은 에러가 발생하는데
			원인은 Won이 정렬할 수 없는 데이터이기 때문
			
			해결방법
				1. TreeSet을 만들 때 정렬방식을 알려주면서 만드는 방법 ==> Comparator 이용하는 방법
				2. Won을 정렬가능한 클래스로 만든 후 입력해주는 방법 ==> 정렬가능한 클래스로 만들어서 입력하는 방법
					
					==> 정렬가능한 클래스로 만드는 방법
						
						Comparable 인터페이스를 구현하는 클래스로 제작함
						소속 함수 중 compareTo(Object o) 함수를 오버라이드해서 만들어야함
						
	*/
		
	// 1번 방법
	TreeSet set = new TreeSet(new Comparator() {
		
		@Override
		public int compare(Object o1, Object o2) {
			Won w1 = (Won) o1;
			Won w2 = (Won) o2;
			
			int result = w1.getRad() - w2.getRad();
			// 내림차순 정렬 예정이므로 부호를 반전시켜서 반환
			return -result;
			
			}
		});
	
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
