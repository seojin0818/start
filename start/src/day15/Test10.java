package day15;

import java.util.*;

public class Test10 {

	public Test10() {
		// ArrayList 타입의 list에 1 ~ 25 사이의 정수 10개를 랜덤하게 만들어서 채워주세요.
		// 리스트 만들기
		ArrayList list = new ArrayList();
				
		for(int i = 0 ; i < 10 ; i++) {
		list.add((int)(Math.random() * 25 + 1));
					
				}
	}

	public static void main(String[] args) {
		new Test10();
	}

}

class DownSort implements Comparator {
	
/*

	정렬 방식을 변경하기 위해서는 Comparator를 상속 받은 클래스를 만들어야 함
	
	이 클래스는 Object 클래스를 상속 받아서 만들어졌기 때문에
	이 클래스 내부에 equals()가 이미 존재하고 있음
	
	정렬을 할 경우에는 Comparator에게 물려받은 compare() 함수를 오버라이드해서
	정렬방식을 직접 정해서 적용시킬 수 있게 됨
	
	이 때 이 함수의 반환값은 정수를 반환하도록 되어있는데
	값의 크기는 중요하지 않고
	부호가 중요함
	
	이 때 부호가 음수이면 두개의 위치를 바꾸지 않고
	양수이면 두개의 위치를 바꾸게 됨
	
 */
	
	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		// 입력된 데이터를 원래 형태로 강제 형변환
		int no1 = (int) o1;
		int no2 = (int) o2;
		
		result = no1 - no2; // 오름차순 정렬 됨 (기본)
		
		return -result;
	}
}