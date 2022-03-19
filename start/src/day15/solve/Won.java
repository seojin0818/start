package day15.solve;

public class Won {
	private int rad;
	private double arround, area;
	
	public Won() {}
	
	public Won(int rad) {
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
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
}
