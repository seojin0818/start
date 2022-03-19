package day15;

/*

1 ~ 99 사이의 정수를 랜덤하게 발생시켜서 
10개를 TreeSet에 입력한 후
내림차순으로 정렬해서 출력하세요.

*/

import java.util.*;

public class Ex02 {

public Ex02() {
	
	// TreeSet에 입력하는 데이터는 반드시 정렬가능한 데이터여야 함
	
	// TreeSet 만들기
	TreeSet set = new TreeSet();
	
	// 데이터 채우기
	for(int i = 0 ; i < 10 ; i++) {
		set.add((int)(Math.random() * (99 - 1 + 1) + 1));
	}
	
	// Set 계열 컬렉션은 데이터를 꺼내는 함수 X
	
	// 1. Iterator로 변환 후 꺼내는 방법
	System.out.println("1. Iterator 사용하는 방법");
	Iterator itor = set.iterator();
	while(itor.hasNext()) {
		int no = (int) itor.next();
		
		// 출력
		System.out.print(no + " | ");
		
		// 내림차순 정렬
	}
	System.out.println();

	
	// 2. List 계열로 변환 후 꺼내는 방법
	System.out.println("2. List 계열 변환 후 사용하는 방법");
	Vector vec = new Vector(set);
	for(int i = 0 ; i < vec.size() ; i++) {
		int no1 = (int) vec.get(i);
	
		// 출력
		System.out.print(no1 + " | ");
		
		// 내림차순 정렬
	}
	System.out.println();
	
	}

public static void main(String[] args) {
	new Ex02();
	
	}
}
