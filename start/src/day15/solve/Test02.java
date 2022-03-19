package day15.solve;

import java.util.*;

public class Test02 {

	public Test02() {
		
		Random rd = new Random();
		System.out.print(rd.nextInt());
		
		Random r1 = new Random(10);
		
		for(int i = 0 ; i < 10 ; i++) {
			int no = r1.nextInt(100);
			
			System.out.println(no + "|");
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
