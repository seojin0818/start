package day15.solve;

import java.util.regex.*;

public class Test04 {

	public Test04() {
		String tel = "HP : 010-1234-5678";
		
		// 위 문자열에서 번호만 추출해서 출력하고 싶을 때
		
		// 방법
		
		// 1. 패턴 정의
		Pattern form = Pattern.compile("[01[0-9]-\\d{3,4}-\\d{4}");
		
		// 2. 패턴 검사
		Matcher mat = form.matcher(tel);
		
		// 3. 검사 결과에서 형식에 맞는 부분 꺼내오기
		// find() : 규칙에 맞는 부분을 확인해주는 함수
		// group() : 규칙에 맞는 부분을 반환해주는 함수
		
		if(mat.find()) {
			String hp = mat.group();
			
			System.out.println("전화번호 : " + hp);
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
