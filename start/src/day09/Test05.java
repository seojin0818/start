package day09;

/*
	
	두 수를 입력하면 더해서 반환해주는 기능의 함수를 만들어서 실행하세요.
	
 */

public class Test05 {
	public Test05() {
		int no1 = getInt();
		int no2 = getInt(1, 10);
		//계산
		int result = add(no1, no2);
		// 출력
		toPrint(no1, no2, result);
	}
	
	public static void main(String[] args) {
	// 진입점 함수
		
		new Test05();

	}
	
	// 랜덤하게 정수를 만들어주는 함수
	public int getInt() {
		int no = (int)(Math.random() * 10 + 1);
		return no;
	}

	// 범위를 입력하면 랜덤하게 범위 안의 정수를 만들어주는 함수
	public int getInt(int pos1, int pos2) {
		int min = pos1 < pos2 ? pos1 : pos2;
		int max = pos1 < pos2 ? pos2 : pos1;
		int no = (int)(Math.random() * (max - min + 1) + min);
		
		return no;
	}
	
	// 두 수를 더해서 반환해주는 함수
	public int add(int no1, int no2) {
		return (no1 + no2);
	}
	
	// 출력해주는 함수
	public void toPrint(int no1, int no2, int result) {
		System.out.println("두 수 " + no1 + " 과 " + no2 + " 의 합은 " + result + " 입니다.");
	}
}
