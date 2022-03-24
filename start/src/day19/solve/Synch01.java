package day19.solve;

public class Synch01 {
	int[] num = new int[5];
	// 클래스 블럭 바로 아래 만들어진 배열은 Heap에 만들어진 것으로 자동 초기화 된 것

	public Synch01() {
//		super(); // 생성자를 호출할 시 암묵적으로 상위 클래스의 기본 생성자 호출이 된 상태
		
		/*
		 	
		 	this : 현재 실행중인 자기자신의 주소를 기억하는 예약된 변수
		 	super : 상위 클래스의 주소를 기억하는 예약된 변수
		 	
		 */
	}

	public static void main(String[] args) {
		new Synch01();
	}

}

class NumThread02 extends Thread {
	Synch01 main; // 주소를 기억할 준비
	
	public NumThread02() {}
	public NumThread02(Synch01 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		// 이 스레드는 배열변수의 데이터를 꺼내서 사용하는 역할을 할 예정
		System.out.println("\t\t\t이제 사용할 차례");
		synchronized(main.num) {
			// main의 num 배열을 사용하는 동안은 다른 곳에서 배열을 사용하면 안됨
			for(int i = 0 ; i < 5 ; i++) {
				int no = main.num[i];
				// 숫자를 꺼냈으므로 출력
				System.out.println("\t\t\t*** " + no + " 를 사용했습니다.");
				// 쉬는 시간을 랜덤으로 정할 예정
				int sec = (int)(Math.random() * 1501 + 500);
				try {
					Thread.sleep(sec);
				} catch(Exception e) {}
			}
			System.out.println("\t\t\t ### 사용 종료 ###");
		}
	}
}
