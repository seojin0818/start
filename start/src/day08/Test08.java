package day08;

/*
 
 	문제 ]
 	
		"Cute Haribo" 라는 문자열을 기억하는 변수 str을 만들고
		그 중에서 Cute만 추출해서 출력하고, Haribo만 추출해서 출력하세요.
				
 */

public class Test08 {

	public static void main(String[] args) {
	// 진입점 함수
		
		// 문자열 변수
		String str = "Cute Haribo";
		
		String word1, word2;
		
		int idx1 = str.indexOf(' '); // 문자열중 특정문자의 위치값을 알려주는 함수
//		word1 = str.substring(0, 4);
		word1 = str.substring(0, idx1);
		
		word2 = str.substring(str.indexOf('H'));
		
		System.out.println(word1);
		System.out.println(word2);
		
	}

}
