package day16;

public class Test07 {

/*

	재귀호출함수(재귀함수)
	==> 함수 내부에서 자기자신을 다시 호출하는 함수
		주로 반환값 반환 부분에서 주로 다시 호출하는 형식
		
		주의 사항 ]
			
			반드시 호출 종료지점을 지정해줘야 함
 */
	
	public Test07() {
		System.out.println("1 ~ 50까지의 합 : " + getSum(50));
	}
	
	// 1 ~ n까지 합을 구해서 반환해주는 함수
	public int getSum(int n) {
		// 재귀호출함수는 반드시 호출 종료지점을 기술해줘야 함
		if(n < 1) {
			return 0;
		}
		return n + getSum(n-1);
	}

	public static void main(String[] args) {
		new Test07();
	}

}
