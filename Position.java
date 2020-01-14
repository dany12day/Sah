public class Position {
	private int x,y;

	public Position(int x, int y) {
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
	
	public String toString() {
		String s="";
		s+=x+" "+y;
		return s;
	}
	public int comparare(Position futurePosition) {
		if(futurePosition.getX()>this.x && futurePosition.getY()>this.y)
			return 1;
		if(futurePosition.getX()<this.x && futurePosition.getY()>this.y)
			return 2;
		if(futurePosition.getX()>this.x && futurePosition.getY()<this.y)
			return 3;
		if(futurePosition.getX()<this.x && futurePosition.getY()<this.y)
			return 4;
		if(futurePosition.getX()==this.x && futurePosition.getY()==this.y)
			return 5;
		return 0;
		
	}
	
}