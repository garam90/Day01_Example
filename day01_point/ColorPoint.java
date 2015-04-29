package day01_point;

public class ColorPoint extends Point {

	private String color;

	/*public ColorPoint(){
		System.out.println("call ColorPoint()");
	}*/
	
	public ColorPoint(int x, int y, String color){
		setX(x);
		setY(y);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void show(){
		System.out.println("좌표[x="+this.getX()+",y="+this.getY()+"]에 "+color+"색 점을 그렸습니다.");
	}
	
}
