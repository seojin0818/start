package day18;

public class Test13 {

	public Test13() {
		Sky sky = new Sky();
		Yh yh = new Yh();
		// 일반 클래스를 new 시킨것과 같은 상태
		
		// New Born 상태로 만들기
		Thread t1 = new Thread(sky);
		Thread t2= new Thread(yh);
		
		// Runnable 상태로 전위
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test13();
	}

}

class Sky implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println("하늘씨가 자바를 " + (i + 1) + " 번째 코딩합니다.");
			// 한 번 출력하면 비록 시간이 남았지만
			// 이번에는 아예 Block 상태로 보냄
			// 복귀 시간을 정해서 보냄
			try {
				Thread.sleep(1000); // 복귀 시간은 1초로 함
			} catch(Exception e) {}
		}
	}
	
}

class Yh implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println("\t\t용이가 " + (i + 1) + " 번째 복습합니다.");
			try {
				Thread.sleep(1000); // 1초 후 Block 상태에서 Runnable 상태로 전위
			} catch(Exception e) {}
		}
	}
}
