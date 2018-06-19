
public class Square extends Rectangle {

	private int side;

	public Square() {

	}

	public Square(int side) {

		this(side, 0, 0);
	}

	public Square(int side, int x, int y) {

		super(side, side, x, y);
	}

	public Square(Square square) {

	}

	public int getSide() {
		return getWidth();
	}

	public void setSide(int side) {
		super.setWidth(side);
		super.setHeight(side);
	}

	@Override
	public void setWidth(int width) {
		super.setWidth(width);

	}

	@Override
	public void setHeight(int height) {
		super.setHeight(height);

	}
}
