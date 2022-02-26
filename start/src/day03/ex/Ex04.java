package day03.ex;

public class Ex04 {
	/*
	문제 4]
	
 		1년은 365.2426일이다.
 		이것은 과연 며칠 몇시간 몇분 몇초인지를 계산하고 출력하세요.
 		
 		힌트 ]
 			365.2426일은 단위가 일 단위이다.
 			하루는 24시간이다.
 			따라서 0.5일은 12시간을 의미한다.
 */
	public static void main(String[] args) {
		
		/*
		 강사님 풀이
		 0.2426은 일 단위
		 0.2426 * 24 를 곱하면 시간이 되고
		 * 60 을 곱하면 분 단위가 되고
		 * 다시 60 을 곱하면 초 단위가 됨
		 
		 */
		/*
		 * 
		// 할 일
		  데이터 변수에 기억
		  
		  누적 계산될 변수 만들고
		  날 수 구하고 -> 누적 변수에 계산해서 업데이트
		  시간 구하고 -> 누적 변수에 계산해서 업데이트
		  분 구하고 -> 누적 변수에 계산해서 업데이트
		  초 구하고
		  출력하고
		  
		 */
		
		// 데이터 변수에 기억
		double total = 365.2426;
		// 누적 계산될 변수 만들고
		double tmp = total;
		// 날 수 구하고 --> 누적 변수에 계산해서 업데이트
		int day = (int) tmp;
		tmp = tmp - day;
		// tmp -= day;
		
		// 0.2426 을 초로 변환
		// 1 * 24 ==> 하루의 시간
		// 0.5 * 24 ==> 하루의 반절 시간
		// 0.1 * 24 ==> 0.1일의 시간
		int tsec = (int)(0.2426 * 24 * 60 * 60); // 전체 계산한 결과를 int로 바꿔야하니까 전체 괄호 해주기
		
		// 시간 구하고 --> 누적 변수에 계산해서 업데이트
		int hour = tsec / 60 / 60;
		
		tsec = tsec % (60 * 60);
		// tsec %= 3600;
		
		// 분 구하고 --> 누적 변수에 계산해서 업데이트
		int min = tsec / 60;
		tsec = tsec % 60;
		
		// 초 구하고
		int sec = tsec;
		
		// 출력하고
		System.out.println("1년은 " + total + " 일이고");
		System.out.println("이것은 " + day + " 일");
		System.out.println("       " + hour + "시간"); // 한글은 한 글자당 2칸 차지
		System.out.println("       " + min + "분");
		System.out.println("       " + sec + "초 이다.");
		
	}
}
