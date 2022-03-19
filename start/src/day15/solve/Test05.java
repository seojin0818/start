package day15.solve;

import java.util.*;

public class Test05 {

	public Test05() {
		
		Vector v1 = new Vector(10, 5);
		int cap1 = v1.capacity(); // 현재 확보한 공간의 수를 알려주는 함수
		System.out.println("처음 공간 : " + cap1);
		for(int i = 0 ; i < 16 ; i++) {
			v1.add(i + 1);
		}
		
		cap1 = v1.capacity();
		System.out.println("확보한 공간 : " + cap1);
		
		System.out.println("---------------");
		
		Vector v2 = new Vector();
		int cap2 = v2.capacity(); // 현재 확보한 공간의 수를 알려주는 함수
		System.out.println("1. v2.capacity : " + cap2);
		for(int i = 0 ; i < 21 ; i++) {
			v2.add(i + 1);
		}
		
		cap2 = v2.capacity();
		System.out.println("2. v2.capacity : " + cap2);
	}
	public static void main(String[] args) {
		new Test05();
	}

}
