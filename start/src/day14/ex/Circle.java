package day14.ex;

public class Circle {
	private int rad;
	private double area, arround;
	
	public Circle() {}
	public Circle(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}
	
	public void setArea() {
		area = rad * rad * Math.PI;
	}
	
	public void setArround() {
		arround = 2 * rad * Math.PI;
	}
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}

	@Override
	public String toString() {
		return "원 - 반지름 : " + rad + " , 면적 : " + area + " , 둘레 : " + arround;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Circle nam = (Circle) o;
		int ban = nam.getRad();
		
		bool = rad == ban;
		
		return bool;
		
	}
}
