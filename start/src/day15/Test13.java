package day15;

import java.util.*;

public class Test13 {
	
/*
	
	HashSet에 랜덤하게 숫자 6개를 채워보자.
	
	Set 계열의 특징
		1. 입력 순서 보장 안함
		2. 중복 데이터 입력 허락하지 않음
		
 */

	public Test13() {
		// HashSet 만들기
		HashSet set = new HashSet();
		int count = 1;
		while(true) {
			// 랜덤한 정수 만들기
			int no = (int)(Math.random() * 10 + 1);
			
			set.add(no);
			// 6개의 숫자만 입력할 예정이므로
			// 채워진 숫자의 개수를 꺼내오기
			int len = set.size();
			
			if(len == 6) {
				break;
			}
			count++;
		}
		
		// 출력
		// 반복횟수 출력
		System.out.println("1. 반복횟수 : " + count);
		
		// 내용 출력
		Iterator itor = set.iterator();
		while(itor.hasNext()) { // 다음꺼 있니?
			System.out.print((int) itor.next() + ", ");
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		new Test13();
	}

}
