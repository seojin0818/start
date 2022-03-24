package day19;

public class Synch01 {
	int[] num = new int[5];
	// 클래스 블럭 바로 아래 만들어진 배열은 Heap에 만들어진 것이므로 자동 초기화 된 것
	
	public Synch01() {
//		super(); // 생성자를 호출할 시 암묵적으로 상위 클래스의 기본 생성자 호출이 된 상태
	
		/*
		 
		 	this	: 현재 실행중인 자기자신의 주소를 기억하는 예약된 변수
		 	super	: 상위 클래스의 주소를 기억하는 예약된 변수
		 	
		 */
		
		NumThread01 t1 = new NumThread01(this);
		NumThread02 t2 = new NumThread02(this);
		// New Born 상태
		
		// Runnable 상태로 전위시킴
		t1.start();
		t2.start();
		
	}
	
	public static void main(String[] args) {
		new Synch01();
	}

}

class NumThread01 extends Thread {
	Synch01 main; // 넘겨주는 주소를 받을 준비
	
	public NumThread01() {}
	// 주소를 넘겨받아서 이 클래스를 new 시킴
	public NumThread01(Synch01 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		
		/*
			
			이 스레드에서는 배열변수에 데이터를 기억하는 역할을 할 예정
			이 스레드가 5개의 데이터를 완성할 때까지는
			다른 스레드는 배열을 사용하지 못하게 하고 싶음
			
		 */
		
		// 메세지 출력
		System.out.println("### 이제 저장할 차례 ###");
		synchronized(main.num) {
			for(int i = 0 ; i < 5 ; i++) {
				int no = (int)(Math.random() * 99 + 1); // 1 ~ 99 사이의 랜덤한 정수
				main.num[i] = no;
				// 출력
				System.out.println((i + 1) + " 번째 방에 [ " + no + " ] 를 기억했습니다.");
				// 잠시 쉬는시간을 랜덤으로 주기 (0.5 ~ 2초)
				int sec = (int)(Math.random() * 1501 + 500);
				
				try {
					Thread.sleep(sec);
				} catch(Exception e) {}
					
			}
			System.out.println("\t***** 저장 완료 *****");	
		
		}
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
				// 쉬는시간을 랜덤으로 정할 예정
				int sec = (int)(Math.random() * 1501 + 500);
				try {
					Thread.sleep(sec);
				} catch(Exception e) {}
			}
			System.out.println("\t\t\t ### 사용 종료 ###");
		}
	}
}
