public class Pawn extends Piece {

	private boolean elPasant;

	public Pawn(int team, Position curentPosition, String name) {
		super();
		super.team = team;
		super.curentPosition = curentPosition;
		super.name = name;
		this.elPasant = false;
	}

	public boolean getElPasant() {
		return elPasant;
	}

	public void setElPasant(boolean elPasant) {
		this.elPasant = elPasant;
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
		if (table.getPiece(futurePosition).getTeam() == table.getPiece(curentPosition).getTeam())
			return 0;
		else {

			if (table.getPiece(curentPosition).getTeam() == 1) {
				Position interm = new Position(curentPosition.getX() + 1, curentPosition.getY());
				if (curentPosition.getX() == 1)
					if (futurePosition.getX() == 3 && futurePosition.getY() == curentPosition.getY()
							&& table.getPiece(futurePosition).getTeam() == 2 && table.getPiece(interm).getTeam() == 2) {
						elPasant = true;
						return 1;
					}
				if (table.getPiece(futurePosition).getTeam() == 2 && futurePosition.getY() == curentPosition.getY()
						&& futurePosition.getX() - curentPosition.getX() == 1) {
					elPasant = false;
					return 1;
				}
				if (table.getPiece(futurePosition).getTeam() == 0 && futurePosition.getX() - curentPosition.getX() == 1
						&& (futurePosition.getY() - 1 == curentPosition.getY()
								|| futurePosition.getY() + 1 == curentPosition.getY())) {
					elPasant = false;
					return 1;
				}
				if(futurePosition.getY()>curentPosition.getY()) {
					Position right = new Position(curentPosition.getX(), curentPosition.getY() + 1);
					Piece rightPiece = table.getPiece(right);
					if (rightPiece instanceof Pawn && ((Pawn) rightPiece).getElPasant()) {
						table.deletePiece(right);
						return 1;
					}
				}
				else {
					Position left = new Position(curentPosition.getX(), curentPosition.getY() - 1);
					Piece leftPiece = table.getPiece(left);
					if (leftPiece instanceof Pawn && ((Pawn) leftPiece).getElPasant()) {
						table.deletePiece(left);
						return 1;
					}
				}

			} else {
				Position interm = new Position(curentPosition.getX() - 1, curentPosition.getY());
				if (curentPosition.getX() == 6)
					if (futurePosition.getX() == 4 && futurePosition.getY() == curentPosition.getY()
							&& table.getPiece(futurePosition).getTeam() == 2 && table.getPiece(interm).getTeam() == 2) {
						elPasant = true;
						return 1;
					}
				if (table.getPiece(futurePosition).getTeam() == 2 && futurePosition.getY() == curentPosition.getY()
						&& curentPosition.getX() - futurePosition.getX() == 1) {
					elPasant = false;
					return 1;
				}
				if (table.getPiece(futurePosition).getTeam() == 1 && curentPosition.getX() - futurePosition.getX() == 1
						&& (futurePosition.getY() + 1 == curentPosition.getY()
								|| futurePosition.getY() - 1 == curentPosition.getY())) {
					elPasant = false;
					return 1;
				}
				if(futurePosition.getY()>curentPosition.getY()) {
					Position right = new Position(curentPosition.getX(), curentPosition.getY() + 1);
					Piece rightPiece = table.getPiece(right);
					if (rightPiece instanceof Pawn && ((Pawn) rightPiece).getElPasant()) {
						table.deletePiece(right);
						return 1;
					}
				}
				else {
					Position left = new Position(curentPosition.getX(), curentPosition.getY() - 1);
					Piece leftPiece = table.getPiece(left);
					if (leftPiece instanceof Pawn && ((Pawn) leftPiece).getElPasant()) {
						table.deletePiece(left);
						return 1;
					}
				}
			}

		}
		return 0;
	}

}