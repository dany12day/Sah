public class Knight extends Piece{

	public Knight(int team, Position curentPosition, String name) {
		super();
		super.team=team;
		super.curentPosition=curentPosition;
		super.name=name;
	}


	public int getTeam() {
		return team;
	}




	public void setTeam(int team) {
		this.team = team;
	}




	public Position getCurentPosition() {
		return curentPosition;
	}




	public void setCurentPosition(Position curentPosition) {
		this.curentPosition = curentPosition;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	@Override
	public int isValidMove(Position futurePosition, Table table) {
		if(table.getPiece(futurePosition).getTeam()==table.getPiece(curentPosition).getTeam())
			return 0;
		if(Math.abs(futurePosition.getX()-curentPosition.getX())==2 && Math.abs(futurePosition.getY()-curentPosition.getY())==1)
			return 1;
		if(Math.abs(futurePosition.getX()-curentPosition.getX())==1 && Math.abs(futurePosition.getY()-curentPosition.getY())==2)
			return 1;
		return 0;
	}

}