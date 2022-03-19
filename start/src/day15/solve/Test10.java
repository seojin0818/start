package day15.solve;

import java.util.*;

public class Test10 {
	
	// ArrayList 타입의 list 에 1 ~ 25 사이의 정수 10를 랜덤하게 만들어서 채워주세요.

	public Test10() {
		
		ArrayList list = new ArrayList();
		
		for(int i = 0 ; i < 10 ; i++) {
			list.add((int)(Math.random() * 25 + 1));
		}
		
		// 출력
		System.out.println("1. 정렬 전 : ");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print((int)(list.get(i)) + " | ");
		}
		System.out.println();
		
		// 내림차순 정렬
	
		Collections.sort(list, new DownSort());
		System.out.println("2. 내림차순 정렬 후 : ");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print((int)(list.get(i)) + " | ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test10();
	}

}

class DownSort implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		// 입력된 데이터를 원래 형태로 강제 형변환
		int no1 = (int) o1;
		int no2 = (int) o2;
		
		result = no1 - no2;
		
		return -result;
	}
}
