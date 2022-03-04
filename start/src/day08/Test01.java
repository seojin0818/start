package day08;

/*
	
	0 - 9 사이의 숫자를 100개 발생시켜서
	각각의 숫자가 몇번씩 발생했는지를 알아봅시다.
	
	방법 ]
	
		각 숫자의 횟수를 기억할 배열을 만들고
		각 숫자가 발생할때마다 1씩 누적시키기
	
 */

public class Test01 {

	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 배열 만들기
		int[] numCount = new int[10]; // 10개의 방에 초기값 0으로 세팅
		
		/*
			
			이 배열에 위치값이 0인 위치에는 0이 발생하면 1을 누적시키기
			1인 위치에는 1이 발생하면 1을 누적시키기
			...
			
		 */
		// 반복작업
		for(int i = 0 ; i < 100 ; i++) {
			// 2) 랜덤으로 숫자 생성
			int no = (int)(Math.random() * 9 + 1);
			// 이렇게 위에서 발생된 숫자는 위에 만든 numCount 배열의 위치값으로 사용하고
			// 그 위치값의 숫자를 1 증가시켜주기
			
			// 3) 발생된 숫자의 카운트를 + 1 해주기
			numCount[no] += 1;
		}
		
		// 4) 출력
		
		// 숫자로 출력
		for(int i = 0 ; i < numCount.length ; i++) {
			int no = i; // 숫자
			int count = numCount[i]; // 발생 횟수

			// 출력
			System.out.println(no + " : " + count);
		}
		
		// 발생 횟수를 특수문자를 이용해서 그래프 형태로 출력
		for(int i = 0 ; i < numCount.length ; i++) {
			int count = numCount[i];
			
			// 숫자 출력
			System.out.print(i + " : ");
			
			// count 횟수만큼 특수문자 출력해야 하므로 반복문으로 처리
			for(int j = 0 ; j < count ; j++) {
				// * 출력
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
			
			'A' + 0 ==> 'A'
			'A' + 1 ==> 'B'
			
			'A' + 9 ==> 'J'
			
		 */
	}
}
