package day15.solve;

import java.util.*;

public class Test13 {

/*
	
	HashSet에 랜덤으로 숫자 6개를 채워보자.
	
	Set 계열의 특징
		1. 입력 순서 보장 안함
		2. 중복 데이터 입력 허락하지 않음
		
 */
	
	public Test13() {
		
		// HashSet 만들기
		HashSet set = new HashSet();
		
		int count = 1; // 0회차는 없을것이기 때문에
		
		while(true) {
			// 랜덤으로 정수 만들기
			int no = (int)(Math.random() * 10 +1);
			
			set.add(no);
			// 6개의 숫자만 입력할 예정이므로
			// 채워진 숫자의 개수를 꺼내오기
		}
	}

	public static void main(String[] args) {
		new Test13();
	}

}
