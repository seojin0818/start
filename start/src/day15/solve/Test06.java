package day15.solve;

import java.util.*;

public class Test06 {
	
/*
	
	다양한 형태의 데이터를 벡터에 채워보고 꺼내서 출력하자.
	
 */

	public Test06() {
		
		Vector vec = new Vector();
		
		vec.add("하리보");
		vec.add('F'); // 자동 Boxing // char - Character - Object
		vec.add(27); // 자동 Boxing // int - Integer - Object
		vec.add(165.5); // 자동 Boxing // double - Double - Object
		vec.add(false); // 자동 Boxing // boolean - Boolean - Object
		
		// 벡터 안의 데이터를 꺼내서 출력해보자. get(int index)
		String name = (String) vec.get(0);
		char gen = (char) vec.get(1);
		int age = (int) vec.get(2);
		double height = (double) vec.get(3);
		boolean bool = (boolean) vec.get(4);
		
		// 출력
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gen);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("학원 : " + bool);
	}

	public static void main(String[] args) {
		new Test06();
	}

}
