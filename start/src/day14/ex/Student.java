package day14.ex;

public class Student {
	private String ban, name;
	private int kook, young, soo, chong;
	
	public Student(String ban, String name) {
		this.ban = ban;
		this.name = name;
		
	}
	
	public Student(int kook, int young, int soo ,int chong) {
		this.kook = kook;
		this.young = young;
		this.soo = soo;
		setChong();
	}
	
	public void setChong() {
		chong = kook + young + soo;
	}
	
	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKook() {
		return kook;
	}

	public void setKook(int kook) {
		this.kook = kook;
	}

	public int getYoung() {
		return young;
	}

	public void setYoung(int young) {
		this.young = young;
	}

	public int getSoo() {
		return soo;
	}

	public void setSoo(int soo) {
		this.soo = soo;
	}

	public int getChong() {
		return chong;
	}

	public void setChong(int chong) {
		this.chong = chong;
	}

	@Override
	public String toString() {
		return " 학생 - 반 : " + ban + " , 이름 : " + name + " , 국어 : " + kook + " , 영어 : " + young + " , 수학 : " + soo + " , 총점 : " + chong;
	}

	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Student nam = (Student) o;
		String ban1 = nam.getBan();
		String name1 = nam.getName();
		
		bool = ban == ban1;
		bool = name == name1;
		
		return bool;
	}
}
