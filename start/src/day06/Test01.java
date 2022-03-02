package day06;

public class Test01 {

	public static void main(String[] args) {
	// 진입점 함수
		
		loop:
		for(int i = 2 ; i < 10 ; i++) {
			
			for(int j = 1 ; j < 10 ; j++) {
				if(i == 5 && j == 3) {
					break loop;
				}
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}

	}
}