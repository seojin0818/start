package day18.solve;

public class Test11 {

	public Test11() {
		NameThread t1 = new NameThread("태연");
		NameThread t2 = new NameThread();
		// 두 스레드가 New Born 상태가 되었음
		
		// Runnable 상태로 전위시킴
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test11();
	}

}

class NameThread extends Thread {
	
	/*
	
		하나의 프로그램을 이용해서 여러번 실행할 경우
		구분할 필요가 생길 수 있음
		
		구분할 수 있는 방법은 여러가지
		
			1. 변수 하나를 만들고 그 변수에 값을 다르게 입력해서 구분하는 방법
			
				String name;
				
			2. 스레드 프로그램 자체에 이름을 부여하는 방법
				이때는 상위 클래스인 Thread의
					Thread(String name)
				를 이용하면 됨
				즉, 상위 클래스의 기본 생성자가 아닌
				다른 생성자를 이용하면 스레드에 이름 부여 가능
				
					super();
						1. 반드시 생성자 안에서만 사용해야 함
						2. 반드시 첫줄 첫문장으로 사용해야 함
						
	 */
	
	public NameThread() {
		super("희진");
		
		// 여러번 생성하더라도 항상 같은 이름으로 됨
		
	}
	
	public NameThread(String name) {
		super(name);
		
		// new 시킬때마다 이름을 입력된 이름으로 만들 수 있음
	}
	
	@Override
	public void run() {
		
		/*
		 	 
		 	 스레드 이름 이용방법
		 	 	
		 	 	getName()가 이름을 알아내는 함수
		 	 	지금 이 run()는 두번 실행될 것
		 	 	그 때 순서를 무시한 병행처리가 될 것
		 	 	현재 실행중인 스레드가 어떤 스레드가 실행되는지를 먼저 알아야 함
		 	 	
		 	 	현재 실행중인 스레드를 알아내는 함수
		 	 		
		 	 		currentThread()
		 	 		
		 */
		
		for(int i = 0 ; i < 1000 ; i++) {
			Thread t = Thread.currentThread();
			String name = t.getName();
			System.out.println(name + " 이 " + (i + 1) + " 번째 노래를 합니다.");
		}
	}
}
