package day01_shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape rect = new Rect();
		Shape circle = new Circle();

		// Shape draw() 오버라이딩 테스트
		rect.draw();
		circle.draw();
	}

}
