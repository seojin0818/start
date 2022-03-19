package day15.solve;

/*

5 ~ 25 사이의 랜덤한 정수를 반지름으로 하는 원을 기억할 클래스를 만들고
원 10개를 리스트에 채워서
넓이가 넓은 원부터 내림차순으로 정렬해서
내용을 출력하세요.

*/

import java.util.*;

public class Test11 {

	public Test11() {
		
		// 리스트 만들기
		ArrayList list = new ArrayList();
		
		// 데이터 채워넣기
		for(int i = 0 ; i < 10 ; i++) {
			Won w = new Won((int)(Math.random() * 21 + 5));
			// 리스트의 각 방에 만들어진 원을 채워넣기
			list.add(w);
		}
		
		// 정렬하기
		// 상속 받아서 new 시키는 순간 바로 들어가도록 무명 내부 클래스
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				int result = 0;
				
				// 원래 데이터로 강제 형변환
				Won w1 = (Won) o1;
				Won w2 = (Won) o2;
				
				double area1 = w1.getArea();
				double area2 = w2.getArea();
				
				result = (area1 - area2) <= 0 ? -1 : 1;
				// 반환값은 정수인데 0.5, -0.5 는 0으로 처리하기 때문에
				// 실수값으로 처리
				
				return -result;
			}
		});
		
		// 출력
		for(Object o : list) {
			// 이 때 o에 담기는 데이터는 Won 객체
			// 따라서 원래 데이터로 강제 형변환
			Won w = (Won) o;
			System.out.println(w);
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
