import java.awt.Color;

public class Block extends Piece{

	public Block(int x, int y, Map map) {
        super(Piece.BLOCK, map);
        this.setX(x);
        this.setY(y);
        this.setColor(Color.WHITE);
    }

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return getColorWord()+ " Block at ("+ getX()+ ", "+ getY()+ ")";
	}

}
