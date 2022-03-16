package day13;

import day12.sub.*;

/*
	
	day12.sub 패키지의 Figure 인터페이스를 구현한 사각형을 무명 내부 클래스를 만들어서 사용해보자.
	
 */

public class Test01 {
	public Test01() {
		
		// 사각형
		Figure fig = new Figure() {
			int width = (int)(Math.random() * 21 + 5);
			int height = (int)(Math.random() * 21 + 5);
			double area;
			@Override
			public void setArea() {
				area = width * height;
				
			}

			@Override
			public void toPrint() {
				System.out.printf("이 사각형은 가로 %3d 이고 세로가 %3d 이고 면적이 %6.2f 입니다.", width, height, area);
				System.out.println();
			}
			
		};
		
		// 삼각형
		Figure fig1 = new Figure() {
			int width = (int)(Math.random() * 21 + 5);
			int height = (int)(Math.random() * 21 + 5);
			double area;
			@Override
			public void setArea() {
				area = width * height * 0.5;
				
			}

			@Override
			public void toPrint() {
				System.out.printf("이 삼각형은 밑변이 %3d 이고 높이가 %3d 이고 면적이 %6.2f 입니다.", width, height, area);
				System.out.println();
			}
		};
	}
	
	public static void main(String[] args) {

	}
}
