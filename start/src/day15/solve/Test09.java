package day15.solve;

import java.util.*;

public class Test09 {

	// ArrayList 타입의 list에 1 ~ 25 사이의 정수 10개를 랜덤하게 만들어서 채워주세요.
	
	public Test09() {
		
		// 리스트 만들기
		ArrayList list = new ArrayList();
		
		// 데이터 채우기
		for(int i = 0 ; i < 10 ; i++) {
			list.add((int)(Math.random() * 25 + 1));
		}
		
		// 출력
		System.out.println("1. 정렬 전 : ");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print((int)list.get(i) + " | " );
		}
		System.out.println();
		
		Collections.reverse(list);
		System.out.println("1-1. 역순 정렬 후 : ");
		// 출력
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print((int)(list.get(i)) + " | ");
		}
		System.out.println();
		
		// 오름차순 정렬
		Collections.sort(list);
		System.out.println("2. 오름차순 정렬 후 : ");
		// 출력
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print((int)(list.get(i)) + " | ");
		}
		System.out.println();
		
		// 내림차순 정렬
		Collections.reverse(list);
		System.out.println("3. 내림차순 정렬 후 : ");
		// 출력
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print((int)(list.get(i)) + " | ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test09();
	}

}
