package day15;

public class Student {
	private String name, ban, tel;
	private int java, db, web, spring, sum;
	private double avg;
	
	public Student() {}
	
	public Student(String name, String ban, String tel) {
		this.name = name;
		this.ban = ban;
		this.tel = tel;
	}
	
	public Student(int java, int db, int web, int spring, int sum) {
		this.java = java;
		this.db = db;
		this.web = web;
		this.spring = spring;
		setSum();
	}
	
	public Student(double avg) {
		this.avg = avg;
		setAvg();
	}
	
	public void setSum() {
		sum = java + db + web + spring;
		
	}
	
	public void setAvg() {
		avg = (java + db + web + spring) / 4.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public int getWeb() {
		return web;
	}

	public void setWeb(int web) {
		this.web = web;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return "학생 - 이름 : " + name + " , 반 : " + ban + " , 번호 : " + tel +
				" , 자바 : " + java + ", 데이터베이스 : " + db + " , 웹 : " + web + " , 스프링 : " + spring +
				" , 총점 : " + sum  + " , 평균 : " + avg;
	}

}