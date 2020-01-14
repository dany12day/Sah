public class noPiece extends Piece{
	
	public noPiece(int team, Position curentPosition, String name) {
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
		return 0;
	}

}