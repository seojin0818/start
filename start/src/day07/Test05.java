package day07;

/*

	5과목의 점수를 기억할 배열을 만들고
	과목 점수를 입력하고 
	총점도 배열의 마지막에 계산해서 입력하고
	평균을 구하고 출력하세요.
	배열에 담긴 과목 점수도 같이 출력하세요.

*/

import java.util.*;

public class Test05 {

	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 배열 만들기
		int[] subj = new int[6];
		// 맨 마지막 방에는 총점이 계산되어야 하므로 그 이전 방까지 접근해서 점수 입력
		for(int i = 0 ; i < subj.length - 1 ; i++) {
			// 2) 과목 점수 만들어서 입력하기
			int score = (int)(Math.random() * 41 + 60);
			subj[i] = score;
		}
		System.out.println("1. " + Arrays.toString(subj));
		
		// 3) 총점 계산해서 입력하기
		for(int i = 0 ; i < subj.length - 1 ; i++) {
			// subj[5] += subj[i]; // 맨 마지막 방이 총점방
			subj[subj.length - 1] += subj[i]; // 총점 방에 점수 누적
		}
		System.out.println("2. " + Arrays.toString(subj));
		
		// 4) 평균 구해서 기억시키기
		// 과목수
		int no = subj.length - 1;
		
		double avg = subj[subj.length - 1] / (double) no;
		
		// 5) 출력
		// 과목 점수 출력
		System.out.print("과목 점수 : | ");
		for(int i = 0 ; i < subj.length - 1 ; i++) {
			System.out.print(subj[i] + " | ");
		}
		// 총점 출력
		System.out.println(); // 줄 바꿈
		System.out.println("총     점 : " + subj[subj.length - 1]);
		
		// 평균 출력
		System.out.println("평     균 : " + avg);
	}

}
