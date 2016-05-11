import java.awt.*;

/** An instance of this class is a J*Man.
 There should at most one J*Man in a game board at a time*/
public class JMan extends Piece {
    
    /** Constructor: a new J*Man at position (x, y) on Map m
     with color red if c = 0, green if c = 1, and yellow if c = 2. */
    public JMan(int x, int y, int c, Map m){
        super(Piece.JMAN, m);
        // Complete this
        this.setX(x);
        this.setY(y);
        if(c == 0)
        	this.setColor(Color.RED);
        if(c == 1)
        	this.setColor(Color.green);
        if(c == 2)
        	this.setColor(Color.yellow);
    }
    
    /** Constructor: a new J*Man at position (x, y) on Map m
     with color c. Precondition: c is one of
     Color.RED, Color.GREEN, and Color.YELLOW.*/
    public JMan(int x, int y, Color c, Map m){
        super(Piece.JMAN, m);
        // Complete this;
        this.setX(x);
        this.setY(y);
        this.setColor(c);
    }
    
    /** J*Man should move based on what button is pushed.
     This method is not used. */
    public void act(){
        return;
    }
    
    /** Move J*Man one step based on the value of i:
        0 = up, 1 = down, 2 = left, 3 = right. */
    public void step(int i){
        setActed(true);
        	
        // Complete this
        if(i == 0){
        	if(getMap().isInGrid(getX(),getY() - 1)){
        		Piece pi = getMap().pieceAt(getX(),getY() - 1);
        		if(pi == null){
        			getMap().move(getX(), getY(), getX(), getY() - 1);
                    setY(getY() - 1);
        		}
        		else if(pi.getType() != 0 && eatit(pi)) {
                    setColor(pi.getColor());
                    getMap().move(getX(), getY(), getX(), getY() - 1);
                    setY(this.getY() - 1);
                }
        	}
        }else if(i == 1) {
            if(getMap().isInGrid(getX(), getY() + 1)) {
            	Piece pi = getMap().pieceAt(getX(), getY() + 1);
                if(pi == null) {
                    getMap().move(getX(), getY(), getX(), getY() + 1);
                    setY(getY() + 1);
                } else if(pi.getType() != 0 && this.eatit(pi)) {
                    setColor(pi.getColor());
                    getMap().move(getX(), getY(), getX(), getY() + 1);
                    setY(getY() + 1);
                }
            }
        } else if(i == 2) {
            if(getMap().isInGrid(getX() - 1, getY())) {
            	Piece pi = getMap().pieceAt(getX() - 1, getY());
                if(pi == null) {
                    getMap().move(getX(), getY(), getX() - 1, getY());
                    setX(getX() - 1);
                } else if(pi.getType() != 0 && eatit(pi)) {
                    setColor(pi.getColor());
                    getMap().move(getX(), getY(), getX() - 1, getY());
                    setX(getX() - 1);
                }
            }
        } else if(getMap().isInGrid(getX() + 1, getY())) {
        	Piece pi = getMap().pieceAt(getX() + 1, getY());
            if(pi == null) {
                getMap().move(getX(), getY(), getX() + 1, getY());
                setX(this.getX() + 1);
            } else if(pi.getType() != 0 && eatit(pi)) {
                setColor(pi.getColor());
                getMap().move(getX(), getY(), getX() + 1, getY());
                setX(getX() + 1);
            }
        }

        	
        	
        
    }
    
    public boolean eatit(Piece pi){
    	
    		if(getColor() == Color.RED && pi.getColor() == Color.YELLOW )
    			return true;
    		else if (getColor() == Color.GREEN && pi.getColor() == Color.RED )
    			return true;
    		else if (getColor() == Color.YELLOW && pi.getColor() == Color.GREEN)
    			return true;
    		else
    			return false;
    	  
    }
    
    /** = representation of this piece */
    public String toString() {
        String color= "";
        return getColorWord() + " J*Man at (" + getX() + ", " + getY() + ")";
    }
}
