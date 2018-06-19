
public class App {

	public static void main(String[] args) {
	
		Square sq = new Square(80,10,20);
		System.out.println(sq.getCount());
		System.out.println("height: " + sq.getHeight());
		System.out.println("width: " + sq.getWidth());
		System.out.println("x: " + sq.getX());
		System.out.println("y: " + sq.getY());
		System.out.println("Area = " + sq.getArea());
		System.out.println(sq.getPerimeter());
		

	}

}
