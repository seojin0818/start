package day08;

/*
	
	랜덤하게 다섯명의 학생의 점수를 만들어 배열에 기억시키고
	각 학생의 석차도 기억할 배열을 만들어서 결과를 출력하세요.
	
 */

public class Test02 {

	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 다섯명의 점수를 기억할 배열 만들기
		int[] score = new int[5]; // 배열 만들기
		
		// 석차를 기억할 배열 만들기
		int[] stud = new int[5];
		
		// 초기값 세팅
		for(int i = 0 ; i < stud.length ; i++) {
			stud[i] = 1;
		}
		
		// 점수 랜덤으로 만들어 입력
		for(int i = 0 ; i < score.length ; i++) {
			int no = (int)(Math.random() * 41 + 60);
			
			score[i] = no;
		}
		
		// 석차 계산
		for(int i = 0 ; i < score.length ; i++) {
			// 내 점수를 뽑아내는 반복문
			
			for(int j = 0 ; j < score.length ; j++) {
				// 다른 학생의 점수를 뽑아내는 반복문
				
				if(score[j] > score[i]) {
					stud[i] = stud[i] + 1;
				}
			}
		}
		
		// 출력
		
		/*
		 	
		 	출력 형식 ]
		 		
		 		A 학생 ] 90점 - 2등
		 		
		 */
		
		for(int i = 0 ; i < stud.length ; i++) {
			// 학생
			String man = (char)('A' + i) + "";
			// 점수
			int num = score[i];
			// 등수
			int rank = stud[i];
			// 출력
			System.out.println(man + " 학생 ] " + num + "점 - " + rank + "등");
			
		}
	}

}
