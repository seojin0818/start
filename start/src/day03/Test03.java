package day03;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args) {
	// 진입점 함수
		
		System.out.println('J' + 3.14);
		// System.out.println(내용);
		// 내용 출력 + 줄 바꿈
		
		// ==> 77.14
		
		// 문제 ] 'J' 이후의 열번째 문자는 무엇인지 출력하세요.
		
		// 할 일
		// 1) 'J' 이후의 열번째 문자이므로 10 더하기
		// ==> ('J' + 10)
		
		// 2) 'J' 문자형 + 10 정수형 ==> 정수형 연산
		
		// 3) 문자를 출력해야 하므로 강제 형변환 이용
		// => (char)(('J' + 10))
		
		JOptionPane.showMessageDialog(null, "J 이후의 열번째 문자 : " + (char)(('J' + 10)));
		System.out.println("'J' 이후의 열번째 문자 : " + (char)(('J' + 10)));
		// System.out.println(내용);
		// 내용 출력 + 줄 바꿈
		String msg = "'J' 이후의 열번째 문자 : " + (char)(('J' + 10));

	}
}
