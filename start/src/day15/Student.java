package day15;

public class Student implements Comparable {
	private String name;
	private int ban, num, java, db, web, spring, sum;
	private double avg;
	
	public Student() {}
	public Student(int ban, int num, int java, int db, int web, int spring) {
		this.ban = ban;
		this.num = num;
		this.java = java;
		this.db = db;
		this.web = web;
		this.spring = spring;
	
	}
	
	public Student(int sum) {
		setSum();
	}
	
	public Student(double avg) {
		setAvg();
	}
	
	public void setSum() {
		sum = java + db + web + spring;
	}
	
	public void setAvg() {
		avg = sum / 4.0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	public int compareTo(Object o) {
		// 나와 다른 Student를 비교하는 기능이므로
		// 입력된 데이터를 Student 타입으로 강제 형변환
		Student stud = (Student) o ;
		
		// 반을 기준으로 오름차순 정렬 예정
		int result = ban - stud.getBan();
		
		return result;
	}
	
	@Override
	public String toString() {
		return "학생  - 이름 : " + name + " , 반 : " + ban + " , 번호 : " + num
				+ " , 자바 : " + java + " , 데이터베이스 : " + db + " , 웹 : " + web + " , 스프링 : " + spring
				+ ", 총점 : " + sum + " , 평균 : " + avg;
	}
}
