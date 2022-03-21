package day16.solve;

import java.util.*;

public class Test13 {

	public Test13() {
	ArrayList<Grand> list1 = new ArrayList<Grand>();
	ArrayList<Father> list2 = new ArrayList<Father>();
	ArrayList<Son> list3 = new ArrayList<Son>();
	ArrayList<GrandSon> list4 = new ArrayList<GrandSon>();
	
	abc(list1);
	abc(list2);
	abc(list3);
// 	abc(list4);
	
//	xyz(list1);
//	xyz(list2);
	xyz(list3);
	xyz(list4);
	
	}
	
	public void abc(ArrayList<? super Son> list) {
		// 이 함수의 매개변수는 Son, Father, Grand, Object 타입의 데이터를 입력해서 만든 리스트를 줄 수 있음
	}
	
	public void xyz(ArrayList<? extends Son> list) {
		// ArrayList<Son> list와 같은 의미
		// 이 함수를 호출할 때 입력하는 리스트는
		// Son의 객체들을 입력한 리스트이거나
		// GrandSon의 객체들을 입력한 리스트여야 함
	}
	
	public static void main(String[] args) {
		new Test13();
	}

}

class Grand {
	
}

class Father extends Grand {
	
}

class Son extends Father {
	
}

class GrandSon extends Son {
	
}