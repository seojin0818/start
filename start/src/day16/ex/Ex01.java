package day16.ex;

import java.util.*;

public class Ex01 {

/*
	
	5 ~ 10 사이의 정수를 랜덤하게 발생시켜서
	그 수만큼의 학생의 점수를 기억하는
	HashMap을 만들어서 데이터를 기억시키고
	꺼내서 출력하세요.
	데이터를 꺼낼때 키를 모두 추출해서 꺼내는 방식으로 출력하세요.
	
 */
	public Ex01() {
		
		// HashMap 만들기
		HashMap map = new HashMap();
		
		// 정수 랜덤 발생
		// int no = (int)(Math.random() * (10 - 5 + 1) + 5);
		
		// 키를 모두 추출
		Set keys = map.keySet();
		for(Object key : keys) {
			Object value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
