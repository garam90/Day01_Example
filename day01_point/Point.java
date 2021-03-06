package day01_point;

public class Point {
	
	private int x;
	private int y;
	public Point() {
		super();
		System.out.println("call Point()");
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
	public void show(){
		System.out.println("좌표[x="+x+",y="+y+"]에 점을 그렸습니다.");
	}
	
	public void show(boolean visible){
		
		if (visible) {
			show();
		}else{
			System.out.println("좌표[x="+x+",y="+y+"]에 점을 지웠습니다.");
		}
	}
	
	
}
