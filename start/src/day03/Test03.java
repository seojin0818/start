package day03;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args) {
		System.out.println('J' + 3.14);
		
		// 'J' 이후의 열번째 문자는 무엇인지 출력하세요.
		
		JOptionPane.showMessageDialog(null, "J 이후의 열번째 문자 : " +  ('J' + 10));
		// 'J' + 10 은 int로 연산
		System.out.println("'J' 이후의 열번째 문자 : " + ('J' + 10));
		// 따라서 앞에 char를 붙여준다
		String msg = "'J' 이후의 열번째 문자 : " + (char)('J' + 10);
		
	}
}
