package day14;

/*
	
	문자열 데이터
		
		"제니,리사,로제,지수"
	를 , 를 기준으로 분리해서 출력해보자.
	
 */

import java.util.*;

public class Test05 {

	public Test05() {
		String member = "제니,리사,로제,지수";
		
		// , 를 기준으로 자르기
		StringTokenizer token = new StringTokenizer(member, ",");
		
		/*
			
			이렇게 객체가 만들어지면
			잘려진 결과는 버퍼메모리(임시메모리공간)에 기억이 되고
			하나씩 꺼내서 사용해야 하는데
			주의 사항은
			한번 꺼낸 데이터는 꺼내는 즉시 메모리에서 사라짐
			따라서 결과를 사용해야 한다면
			변수나 배열 등에 기억시켜놓아야 함
			
		 */
		
		// 하나씩 꺼내서 출력하기
		while(token.hasMoreTokens()) {
			// token.hasMoreTokens() : 임시메모리에 꺼낼 문자열이 있는지 여부를 논리값으로 반환
			// token.hasMoreElements() : 임시메모리에 꺼낼 객체가 있는지 여부를 논리값으로 반환
			
			// 한번 꺼낸 데이터는 사라지므로 다시 접근해서 사용 불가
			// 여기서는 출력만 할 예정이므로 꺼내서 출력만 함
			
			String black = token.nextToken();
			
			// 출력
			System.out.println(black);
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
