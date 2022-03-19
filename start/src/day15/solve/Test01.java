package day15.solve;

/*

파라미터로 전달된 문자열
	http://www.blackpink.org/member/?id=euns&pw=12345&tel=01031759042
중에서 넘겨진 데이터만 잘라서 출력하세요.

*/

import java.util.*;

public class Test01 {

	public Test01() {
		String url = "http://www.blackpink.org/member/?id=euns&pw=12345&tel=01031759042";
		// 위 문자열에서 데이터 부분만 추출하려면
		// ? 기호의 위치값을 알아낸 후 그 바로 다음 위치에서부터 끝까지 잘라내기
		
		int idx = url.indexOf('?');
		String param = url.substring(idx + 1);
		System.out.println(param);
		
		// 만들어진 문자열을 & 기준으로 잘라내서 배열에 담기
		StringTokenizer token = new StringTokenizer(param, "&");
		
		// 잘려진 개수 알아내기
		int cnt = token.countTokens();

		// 문자열 배열 만들기
		String[] tmp = new String[cnt]; // tmp는 전부 null 상태 (클래스 타입이니까)
		
		// 배열에 잘려진 내용을 순차적으로 채우기
		for(int i = 0 ; token.hasMoreTokens() ; i++) {
			tmp[i] = token.nextToken(); // 이 명령을 실행하는 순간 버퍼메모리에서 꺼낸 데이터는 삭제
		}
		
		System.out.println(Arrays.toString(tmp));
		
		String[][] data = new String[cnt][2]; // [2]는 키값과 밸류값
		for(int i = 0 ; i < tmp.length ; i++) {
			String str = tmp[i];
			StringTokenizer tk = new StringTokenizer(str, "=");
			
			data[i][0] = tk.nextToken();
			data[i][1] = tk.nextToken();
		}
		
		// 결과 출력
		for(String[] arr : data) {
			System.out.println(arr[0] + " : " + arr[1]);
		}
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
