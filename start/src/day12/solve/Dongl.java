package day12.solve;

public class Dongl extends Figure {
	
	private int rad;
	private double arround, area;
	
	public Dongl() {}
	public Dongl(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}
	
	@Override
	public void setArea() {
	
	area = rad * rad * Math.PI;
		
	}
	
	public void setArround() {
	arround = 2.0 * rad * Math.PI;
	}

	@Override
	public void toPrint() {
	System.out.printf("이 원의 반지름은 %3d 이고 둘레가 %6.2f 이고 면적은 %6.2f 입니다.", rad, arround, area);
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

}
