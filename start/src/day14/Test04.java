package day14;

import day14.Test04;

/*
	
	Test05를 확인한 후 이 클래스를 확인하세요.
	
	Test03에서 만든 문자열을 줄바꿈 기호를 기준으로 분리해서
	배열에 담아보자.
	
	참고 ]
	
		배열을 만들 때 필요한 것
			1. 타입
			2. 개수
	
 */

public class Test04 {

	public Test04() {
		// 1. StringBuffer 객체 만들기
		StringBuffer buff = new StringBuffer();
				
					// 2. 반복해서 결합 작업
					
					buff.append("Hey boy\n");
					buff.append("Make 'em whistle like a missile, bomb, bomb\n");
					buff.append("Every time I show up, blow up, uh\n");
					buff.append("Make 'em whistle like a missile, bomb, bomb\n");
					buff.append("Every time I show up, blow up, uh\n");
					
					// 3. 문자열로 변환이 필요한 순간에 변환해주기
					String song = buff.toString();
	}

	public static void main(String[] args) {
		new Test04();
	}

}

