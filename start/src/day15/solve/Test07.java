package day15.solve;

import java.util.*;

public class Test07 {

	public Test07() {
		
		ArrayList vec = new ArrayList();
		
		vec.add("하리보");
		vec.add('F');
		vec.add(27);
		vec.add(165.5);
		vec.add(false);
		
		// 자동화 처리
		for(int i = 0 ; i < vec.size(); i++) {
			// 데이터 꺼내기
			Object o = vec.get(i);
			
			if(o instanceof String) {
				String str = (String) o;
				System.out.println("이름 : " + str);
			} else if(o instanceof Character){
				char gen = (char) o;
				System.out.println("성별 : " + gen);
			} else if(o instanceof Integer) {
				int age = (int) o;
				System.out.println("나이 : " + age);
			} else if(o instanceof Double) {
				double height = (double) o ;
				System.out.println("신장 : " + height);
			} else if(o instanceof Boolean) {
				boolean bool = (boolean) o;
				System.out.println("학원 : " + bool);
			}
		}
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}
