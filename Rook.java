public class Rook extends Piece{

	public Rook(int team, Position curentPosition, String name) {
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
		if(futurePosition.getX()==curentPosition.getX()) {
			Position inte = new Position(curentPosition.getX(),curentPosition.getY());
			while(inte.getY()<futurePosition.getY()) {
				if(inte.getY()!=curentPosition.getY()) {
					if(table.getPiece(inte).getTeam()!=2)
						return 0;
				}
				inte.setY(inte.getY()+1);
			}
			while(inte.getY()>futurePosition.getY()) {
				if(inte.getY()!=curentPosition.getY()) {
					if(table.getPiece(inte).getTeam()!=2)
						return 0;
				}
				inte.setY(inte.getY()-1);
			}
			if(table.getPiece(futurePosition).getTeam()!=table.getPiece(curentPosition).getTeam())
				return 1;
			
		}
		if(futurePosition.getY()==curentPosition.getY()) {
			Position inte = new Position(curentPosition.getX(),curentPosition.getY());
			while(inte.getX()<futurePosition.getX()) {
				if(inte.getX()!=curentPosition.getX()) {
					if(table.getPiece(inte).getTeam()!=2)
						return 0;
				}
				inte.setX(inte.getX()+1);
			}
			while(inte.getX()>futurePosition.getX()) {
				if(inte.getX()!=curentPosition.getX()) {
					if(table.getPiece(inte).getTeam()!=2)
						return 0;
				}
				inte.setX(inte.getX()-1);
			}
			if(table.getPiece(futurePosition).getTeam()!=table.getPiece(curentPosition).getTeam())
				return 1;
		}
		return 0;
	}
}