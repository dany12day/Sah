public class Bishop extends Piece{

	public Bishop(int team, Position curentPosition, String name) {
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
		if(curentPosition.comparare(futurePosition)==0) {
			return 0;
		}
		if(curentPosition.comparare(futurePosition)==1) {
			if(Math.abs(futurePosition.getX()-curentPosition.getX())==Math.abs(futurePosition.getY()-curentPosition.getY())) {
				Position inte = new Position(curentPosition.getX()+1,curentPosition.getY()+1);
				while(inte.comparare(futurePosition)!=5) {
					if(table.getPiece(inte).getTeam()!= 2)
						return 0;
					inte.setX(inte.getX()+1);
					inte.setY(inte.getY()+1);
				}
				return 1;
			}
			else
				return 0;
		}
		
		if(curentPosition.comparare(futurePosition)==4) {
			if(Math.abs(futurePosition.getX()-curentPosition.getX())==Math.abs(futurePosition.getY()-curentPosition.getY())) {
				Position inte = new Position(curentPosition.getX()-1,curentPosition.getY()-1);
				while(inte.comparare(futurePosition)!=5) {
					if(table.getPiece(inte).getTeam()!= 2)
						return 0;
					inte.setX(inte.getX()-1);
					inte.setY(inte.getY()-1);
				}
				return 1;
			}
			else
				return 0;
		}
		
		if(curentPosition.comparare(futurePosition)==2) {
			if(Math.abs(futurePosition.getX()-curentPosition.getX())==Math.abs(futurePosition.getY()-curentPosition.getY())) {
				Position inte = new Position(curentPosition.getX()-1,curentPosition.getY()+1);
				while(inte.comparare(futurePosition)!=5) {
					if(table.getPiece(inte).getTeam()!= 2)
						return 0;
					inte.setX(inte.getX()-1);
					inte.setY(inte.getY()+1);
				}
				return 1;
			}
			else
				return 0;
		}
		
		if(curentPosition.comparare(futurePosition)==3) {
			if(Math.abs(futurePosition.getX()-curentPosition.getX())==Math.abs(futurePosition.getY()-curentPosition.getY())) {
				Position inte = new Position(curentPosition.getX()+1,curentPosition.getY()-1);
				while(inte.comparare(futurePosition)!=5) {
					if(table.getPiece(inte).getTeam()!= 2)
						return 0;
					inte.setX(inte.getX()+1);
					inte.setY(inte.getY()-1);
				}
				return 1;
			}
			else
				return 0;
		}
		return 0;
	}
	
	
}