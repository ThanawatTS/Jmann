import java.awt.Color;

public class Walker extends Piece{

	public Walker(int x, int y, int c, Map m) {
		super(Piece.WALKER, m);
		this.setX(x);
		this.setY(y);
		if (c == 0) {
			this.setColor(Color.RED);
		} else if (c == 1) {
			this.setColor(Color.GREEN);
		} else {
			this.setColor(Color.YELLOW);
		}
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return getColorWord()+ " Walker at ("+ getX()+ ", "+ getY()+ ")";
	}

}
