package day07;

/*
 
	5과목의 점수를 기억할 배열을 만들고
	과목 점수를 입력해서 
	총점과 평균을 구하고 출력하세요.
	배열에 담긴 점수도 같이 출력하세요.
	
 */

public class Test04 {

	public static void main(String[] args) {
	// 진입점 함수
		
		// 과목 점수 배열 만들기
		int[] subj = new int[5]; // 자동초기화로 0으로 모두 채워져있음
		
		// 과목 점수를 랜덤으로 만들어 입력하기
		for(int i = 0 ; i < subj.length ; i++) {
			// 랜덤하게 만든 점수를 각 과목방에 입력하기
			/*
			 
			 	int score = (int)(Math.random() * (100 - 60 + 1) + 60);
			 	subj[i] = score;
			 	
			 */
			subj[i] = (int)(Math.random() * (100 - 60 + 1) + 60); // 60 ~ 100 사이의 정수
		}
		
		// 총점 계산
		int total = 0;
		for(int i = 0 ; i < subj.length ; i++) {
			int score = subj[i]; // 이 score를 total에 계속 누적시킴
			
			// 총점에 과목 점수를 누적시키기
			// total = total + score;
			total += score;
		}
		
		// 평균 계산
		double avg = total / (double)(subj.length);
		
		/* 출력
		System.out.println("각 과목 점수 : " + Arrays.toString(subj));
		System.out.println("과목 총 점수 : " + total);
		System.out.println("과목평균 점수 : " + avg);
		*/
	}

}
