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
	
	// 숫자는 대소비교가 돼서 정렬 되므로 Comparable 안 만들어도 됨
	
	// 이 경우는 기존 가지고 있는 정렬기준을 바꾸는 작업이 되기 때문에
	// Comparator를 TreeSet을 만들 때 적용시켜서 만들면 됨
	
		TreeSet set = new TreeSet(new Comparator(){
			
		@Override
		public int compare(Object o1, Object o2){
		int result = 0;
		
		int no1 = (int) o1;
		int no2 = (int) o2;
		
		result = no1 - no2;
		
		return -result;
		}
		
		});
		
		while(true){ // 중복된 값이 들어갈 수도 있기 때문에 for문 보다는 while문
		set.add((int)(Math.random() * 99 + 1));
		if(set.size() == 10){
		break;
		}
		}
		
		Iterator itor = set.iterator();
		while(itor.hasNext()){
		System.out.println(itor.next());
		}
}
	
	/*
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

	 */
public static void main(String[] args) {
	new Ex02();
	
	}
}
