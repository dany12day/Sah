import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Piece {
	
	protected int team;
	protected Position curentPosition;
	protected String name;
	private static int tura;

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

	public abstract int isValidMove(Position futurePosition, Table table);
	
	public Boolean move(Position futurePosition, Table table, int a) {
		if(table.getPiece(curentPosition).isValidMove(futurePosition, table)==1 && table.getPiece(curentPosition).getTeam()==tura%2) {
			if(table.getPiece(futurePosition).getName()=="k") {
				JFrame finalJoc = new JFrame("Final joc");
				finalJoc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				finalJoc.setVisible(true);
				finalJoc.setSize(800, 800);
				finalJoc.setLocation(0, 0);
				JLabel castigator = new JLabel("player 1 a castigat");
				finalJoc.add(castigator);
				}
			if(table.getPiece(futurePosition).getName()=="K"){
				JFrame finalJoc = new JFrame("Final joc");
				finalJoc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				finalJoc.setVisible(true);
				finalJoc.setSize(800, 800);
				finalJoc.setLocation(0, 0);
				JLabel castigator = new JLabel("player 2 a castigat");
				castigator.setSize(400, 400);
				castigator.setLocation(200, 200);
				finalJoc.add(castigator);
				}
			table.setPiece(curentPosition, futurePosition);
			curentPosition.setX(futurePosition.getX());
			curentPosition.setY(futurePosition.getY());
			tura++;
			System.out.println(tura);
			return true;
		}
		else {
			System.out.println("can not move the piece");
			return false;
		}
		
	}
	
}