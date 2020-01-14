import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TableInterface extends JPanel {
	public static int tura =1;
	public static void main(String[] args) {
		JFrame afisor = new JFrame("tabel ajutator");
		afisor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		afisor.setVisible(true);
		afisor.setSize(200, 100);
		afisor.setLocation(800, 0);
		JPanel informatii= new JPanel();
		
		
		JFrame frame = new JFrame("Chess Board");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMaximizedBounds(null);
		frame.setSize(600, 600);
		JPanel p = new JPanel();
		GridLayout grid = new  GridLayout(8,8);
		p.setLayout(grid);
		
		JButton[][] b = new JButton[8][8];
		
		b[0][0] = new JButton("R",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[0][0].setHorizontalTextPosition(JButton.CENTER);
		b[0][0].setVerticalTextPosition(JButton.CENTER);
		b[0][1] = new JButton("N",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[0][1].setHorizontalTextPosition(JButton.CENTER);
		b[0][1].setVerticalTextPosition(JButton.CENTER);
		b[0][2] = new JButton("B",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[0][2].setHorizontalTextPosition(JButton.CENTER);
		b[0][2].setVerticalTextPosition(JButton.CENTER);
		b[0][3] = new JButton("Q",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[0][3].setHorizontalTextPosition(JButton.CENTER);
		b[0][3].setVerticalTextPosition(JButton.CENTER);
		b[0][4] = new JButton("K",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[0][4].setHorizontalTextPosition(JButton.CENTER);
		b[0][4].setVerticalTextPosition(JButton.CENTER);
		b[0][5] = new JButton("B",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[0][5].setHorizontalTextPosition(JButton.CENTER);
		b[0][5].setVerticalTextPosition(JButton.CENTER);
		b[0][6] = new JButton("N",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[0][6].setHorizontalTextPosition(JButton.CENTER);
		b[0][6].setVerticalTextPosition(JButton.CENTER);
		b[0][7] = new JButton("R",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[0][7].setHorizontalTextPosition(JButton.CENTER);
		b[0][7].setVerticalTextPosition(JButton.CENTER);
		
		b[1][0] = new JButton("P",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[1][0].setHorizontalTextPosition(JButton.CENTER);
		b[1][0].setVerticalTextPosition(JButton.CENTER);
		b[1][1] = new JButton("P",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[1][1].setHorizontalTextPosition(JButton.CENTER);
		b[1][1].setVerticalTextPosition(JButton.CENTER);
		b[1][2] = new JButton("P",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[1][2].setHorizontalTextPosition(JButton.CENTER);
		b[1][2].setVerticalTextPosition(JButton.CENTER);
		b[1][3] = new JButton("P",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[1][3].setHorizontalTextPosition(JButton.CENTER);
		b[1][3].setVerticalTextPosition(JButton.CENTER);
		b[1][4] = new JButton("P",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[1][4].setHorizontalTextPosition(JButton.CENTER);
		b[1][4].setVerticalTextPosition(JButton.CENTER);
		b[1][5] = new JButton("P",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[1][5].setHorizontalTextPosition(JButton.CENTER);
		b[1][5].setVerticalTextPosition(JButton.CENTER);
		b[1][6] = new JButton("P",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[1][6].setHorizontalTextPosition(JButton.CENTER);
		b[1][6].setVerticalTextPosition(JButton.CENTER);
		b[1][7] = new JButton("P",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[1][7].setHorizontalTextPosition(JButton.CENTER);
		b[1][7].setVerticalTextPosition(JButton.CENTER);
		
		b[2][0] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[2][0].setHorizontalTextPosition(JButton.CENTER);
		b[2][0].setVerticalTextPosition(JButton.CENTER);
		b[2][1] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[2][1].setHorizontalTextPosition(JButton.CENTER);
		b[2][1].setVerticalTextPosition(JButton.CENTER);
		b[2][2] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[2][2].setHorizontalTextPosition(JButton.CENTER);
		b[2][2].setVerticalTextPosition(JButton.CENTER);
		b[2][3] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[2][3].setHorizontalTextPosition(JButton.CENTER);
		b[2][3].setVerticalTextPosition(JButton.CENTER);
		b[2][4] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[2][4].setHorizontalTextPosition(JButton.CENTER);
		b[2][4].setVerticalTextPosition(JButton.CENTER);
		b[2][5] =new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[2][5].setHorizontalTextPosition(JButton.CENTER);
		b[2][5].setVerticalTextPosition(JButton.CENTER);
		b[2][6] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[2][6].setHorizontalTextPosition(JButton.CENTER);
		b[2][6].setVerticalTextPosition(JButton.CENTER);
		b[2][7]= new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[2][7].setHorizontalTextPosition(JButton.CENTER);
		b[2][7].setVerticalTextPosition(JButton.CENTER);
		
		b[3][0] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[3][0].setHorizontalTextPosition(JButton.CENTER);
		b[3][0].setVerticalTextPosition(JButton.CENTER);
		b[3][1] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[3][1].setHorizontalTextPosition(JButton.CENTER);
		b[3][1].setVerticalTextPosition(JButton.CENTER);
		b[3][2] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[3][2].setHorizontalTextPosition(JButton.CENTER);
		b[3][2].setVerticalTextPosition(JButton.CENTER);
		b[3][3] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[3][3].setHorizontalTextPosition(JButton.CENTER);
		b[3][3].setVerticalTextPosition(JButton.CENTER);
		b[3][4] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[3][4].setHorizontalTextPosition(JButton.CENTER);
		b[3][4].setVerticalTextPosition(JButton.CENTER);
		b[3][5] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[3][5].setHorizontalTextPosition(JButton.CENTER);
		b[3][5].setVerticalTextPosition(JButton.CENTER);
		b[3][6] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[3][6].setHorizontalTextPosition(JButton.CENTER);
		b[3][6].setVerticalTextPosition(JButton.CENTER);
		b[3][7] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[3][7].setHorizontalTextPosition(JButton.CENTER);
		b[3][7].setVerticalTextPosition(JButton.CENTER);
		
		b[4][0] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[4][0].setHorizontalTextPosition(JButton.CENTER);
		b[4][0].setVerticalTextPosition(JButton.CENTER);
		b[4][1] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[4][1].setHorizontalTextPosition(JButton.CENTER);
		b[4][1].setVerticalTextPosition(JButton.CENTER);
		b[4][2] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[4][2].setHorizontalTextPosition(JButton.CENTER);
		b[4][2].setVerticalTextPosition(JButton.CENTER);
		b[4][3] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[4][3].setHorizontalTextPosition(JButton.CENTER);
		b[4][3].setVerticalTextPosition(JButton.CENTER);
		b[4][4] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[4][4].setHorizontalTextPosition(JButton.CENTER);
		b[4][4].setVerticalTextPosition(JButton.CENTER);
		b[4][5] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[4][5].setHorizontalTextPosition(JButton.CENTER);
		b[4][5].setVerticalTextPosition(JButton.CENTER);
		b[4][6] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[4][6].setHorizontalTextPosition(JButton.CENTER);
		b[4][6].setVerticalTextPosition(JButton.CENTER);
		b[4][7] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[4][7].setHorizontalTextPosition(JButton.CENTER);
		b[4][7].setVerticalTextPosition(JButton.CENTER);
	
		b[5][0] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[5][0].setHorizontalTextPosition(JButton.CENTER);
		b[5][0].setVerticalTextPosition(JButton.CENTER);
		b[5][1] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[5][1].setHorizontalTextPosition(JButton.CENTER);
		b[5][1].setVerticalTextPosition(JButton.CENTER);
		b[5][2] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[5][2].setHorizontalTextPosition(JButton.CENTER);
		b[5][2].setVerticalTextPosition(JButton.CENTER);
		b[5][3] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[5][3].setHorizontalTextPosition(JButton.CENTER);
		b[5][3].setVerticalTextPosition(JButton.CENTER);
		b[5][4] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[5][4].setHorizontalTextPosition(JButton.CENTER);
		b[5][4].setVerticalTextPosition(JButton.CENTER);
		b[5][5] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[5][5].setHorizontalTextPosition(JButton.CENTER);
		b[5][5].setVerticalTextPosition(JButton.CENTER);
		b[5][6] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[5][6].setHorizontalTextPosition(JButton.CENTER);
		b[5][6].setVerticalTextPosition(JButton.CENTER);
		b[5][7] = new JButton("",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[5][7].setHorizontalTextPosition(JButton.CENTER);
		b[5][7].setVerticalTextPosition(JButton.CENTER);

		b[6][0] = new JButton("p",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[6][0].setHorizontalTextPosition(JButton.CENTER);
		b[6][0].setVerticalTextPosition(JButton.CENTER);
		b[6][1]= new JButton("p",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[6][1].setHorizontalTextPosition(JButton.CENTER);
		b[6][1].setVerticalTextPosition(JButton.CENTER);
		b[6][2] = new JButton("p",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[6][2].setHorizontalTextPosition(JButton.CENTER);
		b[6][2].setVerticalTextPosition(JButton.CENTER);
		b[6][3] = new JButton("p",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[6][3].setHorizontalTextPosition(JButton.CENTER);
		b[6][3].setVerticalTextPosition(JButton.CENTER);
		b[6][4] = new JButton("p",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[6][4].setHorizontalTextPosition(JButton.CENTER);
		b[6][4].setVerticalTextPosition(JButton.CENTER);
		b[6][5] = new JButton("p",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[6][5].setHorizontalTextPosition(JButton.CENTER);
		b[6][5].setVerticalTextPosition(JButton.CENTER);
		b[6][6] = new JButton("p",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[6][6].setHorizontalTextPosition(JButton.CENTER);
		b[6][6].setVerticalTextPosition(JButton.CENTER);
		b[6][7] = new JButton("p",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[6][7].setHorizontalTextPosition(JButton.CENTER);
		b[6][7].setVerticalTextPosition(JButton.CENTER);
	
		b[7][0]  = new JButton("r",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[7][0].setHorizontalTextPosition(JButton.CENTER);
		b[7][0].setVerticalTextPosition(JButton.CENTER);
		b[7][1] = new JButton("n",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[7][1].setHorizontalTextPosition(JButton.CENTER);
		b[7][1].setVerticalTextPosition(JButton.CENTER);
		b[7][2] = new JButton("b",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[7][2].setHorizontalTextPosition(JButton.CENTER);
		b[7][2].setVerticalTextPosition(JButton.CENTER);
		b[7][3] = new JButton("q",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[7][3].setHorizontalTextPosition(JButton.CENTER);
		b[7][3].setVerticalTextPosition(JButton.CENTER);
		b[7][4] = new JButton("k",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[7][4].setHorizontalTextPosition(JButton.CENTER);
		b[7][4].setVerticalTextPosition(JButton.CENTER);
		b[7][5] = new JButton("b",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[7][5].setHorizontalTextPosition(JButton.CENTER);
		b[7][5].setVerticalTextPosition(JButton.CENTER);
		b[7][6] = new JButton("n",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\black.jpg"));
		b[7][6].setHorizontalTextPosition(JButton.CENTER);
		b[7][6].setVerticalTextPosition(JButton.CENTER);
		b[7][7] = new JButton("r",new ImageIcon("C:\\Users\\ghere\\eclipse-workspace\\Sah-inter-master\\images\\white.jpg"));
		b[7][7].setHorizontalTextPosition(JButton.CENTER);
		b[7][7].setVerticalTextPosition(JButton.CENTER);
		
		p.add(b[0][0]);
		p.add(b[0][1]);
		p.add(b[0][2]);
		p.add(b[0][3]);
		p.add(b[0][4]);
		p.add(b[0][5]);
		p.add(b[0][6]);
		p.add(b[0][7]);
		
		p.add(b[1][0]);
		p.add(b[1][1]);
		p.add(b[1][2]);
		p.add(b[1][3]);
		p.add(b[1][4]);
		p.add(b[1][5]);
		p.add(b[1][6]);
		p.add(b[1][7]);
		
		p.add(b[2][0]);
		p.add(b[2][1]);
		p.add(b[2][2]);
		p.add(b[2][3]);
		p.add(b[2][4]);
		p.add(b[2][5]);
		p.add(b[2][6]);
		p.add(b[2][7]);
		
		p.add(b[3][0]);
		p.add(b[3][1]);
		p.add(b[3][2]);
		p.add(b[3][3]);
		p.add(b[3][4]);
		p.add(b[3][5]);
		p.add(b[3][6]);
		p.add(b[3][7]);
	
		p.add(b[4][0]);
		p.add(b[4][1]);
		p.add(b[4][2]);
		p.add(b[4][3]);
		p.add(b[4][4]);
		p.add(b[4][5]);
		p.add(b[4][6]);
		p.add(b[4][7]);
	
		p.add(b[5][0]);
		p.add(b[5][1]);
		p.add(b[5][2]);
		p.add(b[5][3]);
		p.add(b[5][4]);
		p.add(b[5][5]);
		p.add(b[5][6]);
		p.add(b[5][7]);
	
		p.add(b[6][0]);
		p.add(b[6][1]);
		p.add(b[6][2]);
		p.add(b[6][3]);
		p.add(b[6][4]);
		p.add(b[6][5]);
		p.add(b[6][6]);
		p.add(b[6][7]);
		
		p.add(b[7][0]);
		p.add(b[7][1]);
		p.add(b[7][2]);
		p.add(b[7][3]);
		p.add(b[7][4]);
		p.add(b[7][5]);
		p.add(b[7][6]);
		p.add(b[7][7]);
		
		frame.setContentPane(p);
		frame.setVisible(true);
		
		Table table = new Table(new Piece[][] {
			{new Rook   (1,new Position(0,0),"R"), new Knight (1,new Position(0,1),"N"), new Bishop (1,new Position(0,2),"B"), new Queen  (1,new Position(0,3),"Q"), new King   (1,new Position(0,4),"K"), new Bishop (1,new Position(0,5),"B"), new Knight (1,new Position(0,6),"N"), new Rook   (1,new Position(0,7),"R")},
			{new Pawn   (1,new Position(1,0),"P"), new Pawn   (1,new Position(1,1),"P"), new Pawn   (1,new Position(1,2),"P"), new Pawn   (1,new Position(1,3),"P"), new Pawn   (1,new Position(1,4),"P"), new Pawn   (1,new Position(1,5),"P"), new Pawn   (1,new Position(1,6),"P"), new Pawn   (1,new Position(1,7),"P")},
			{new noPiece(2,new Position(2,0)," "), new noPiece(2,new Position(2,1)," "), new noPiece(2,new Position(2,2)," "), new noPiece(2,new Position(2,3)," "), new noPiece(2,new Position(2,4)," "), new noPiece(2,new Position(2,5)," "), new noPiece(2,new Position(2,6)," "), new noPiece(2,new Position(2,7)," ")},
			{new noPiece(2,new Position(3,0)," "), new noPiece(2,new Position(3,1)," "), new noPiece(2,new Position(3,2)," "), new noPiece(2,new Position(3,3)," "), new noPiece(2,new Position(3,4)," "), new noPiece(2,new Position(3,5)," "), new noPiece(2,new Position(3,6)," "), new noPiece(2,new Position(3,7)," ")},
			{new noPiece(2,new Position(4,0)," "), new noPiece(2,new Position(4,1)," "), new noPiece(2,new Position(4,2)," "), new noPiece(2,new Position(4,3)," "), new noPiece(2,new Position(4,4)," "), new noPiece(2,new Position(4,5)," "), new noPiece(2,new Position(4,6)," "), new noPiece(2,new Position(4,7)," ")},
			{new noPiece(2,new Position(5,0)," "), new noPiece(2,new Position(5,1)," "), new noPiece(2,new Position(5,2)," "), new noPiece(2,new Position(5,3)," "), new noPiece(2,new Position(5,4)," "), new noPiece(2,new Position(5,5)," "), new noPiece(2,new Position(5,6)," "), new noPiece(2,new Position(5,7)," ")},
			{new Pawn   (0,new Position(6,0),"p"), new Pawn   (0,new Position(6,1),"p"), new Pawn   (0,new Position(6,2),"p"), new Pawn   (0,new Position(6,3),"p"), new Pawn   (0,new Position(6,4),"p"), new Pawn   (0,new Position(6,5),"p"), new Pawn   (0,new Position(6,6),"p"), new Pawn   (0,new Position(6,7),"p")},
			{new Rook   (0,new Position(7,0),"r"), new Knight (0,new Position(7,1),"n"), new Bishop (0,new Position(7,2),"b"), new Queen  (0,new Position(7,3),"q"), new King   (0,new Position(7,4),"k"), new Bishop (0,new Position(7,5),"b"), new Knight (0,new Position(7,6),"n"), new Rook   (0,new Position(7,7),"r")},
		});
		
		Position curentPosition = new Position(-1,-1);
		Position futurePosition = new Position(-1,-1);
		JLabel turaJucator = new JLabel("2");
		JButton reset = new JButton("Reincepere Tura");
		
		reset.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				curentPosition.setX(-1);
				curentPosition.setY(-1);
				futurePosition.setX(-1);
				futurePosition.setY(-1);
			}
			
		});
		informatii.add(turaJucator);
		informatii.add(reset);
		afisor.add(informatii);
		
		
		b[0][0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(0);
					curentPosition.setY(0);
				}
				else {
					futurePosition.setX(0);
					futurePosition.setY(0);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[0][0].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[0][1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(0);
					curentPosition.setY(1);
				}
				else {
					futurePosition.setX(0);
					futurePosition.setY(1);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[0][1].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[0][2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(0);
					curentPosition.setY(2);
				}
				else {
					futurePosition.setX(0);
					futurePosition.setY(2);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[0][2].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[0][3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(0);
					curentPosition.setY(3);
				}
				else {
					futurePosition.setX(0);
					futurePosition.setY(3);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[0][3].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[0][4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(0);
					curentPosition.setY(4);
				}
				else {
					futurePosition.setX(0);
					futurePosition.setY(4);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[0][4].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[0][5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(0);
					curentPosition.setY(5);
				}
				else {
					futurePosition.setX(0);
					futurePosition.setY(5);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[0][5].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[0][6].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(0);
					curentPosition.setY(6);
				}
				else {
					futurePosition.setX(0);
					futurePosition.setY(6);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[0][6].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[0][7].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(0);
					curentPosition.setY(7);
				}
				else {
					futurePosition.setX(0);
					futurePosition.setY(7);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[0][7].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[1][0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(1);
					curentPosition.setY(0);
				}
				else {
					futurePosition.setX(1);
					futurePosition.setY(0);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[1][0].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[1][1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(curentPosition.getX());
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(1);
					curentPosition.setY(1);
				}
				else {
					futurePosition.setX(1);
					futurePosition.setY(1);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[1][1].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[1][2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(1);
					curentPosition.setY(2);
				}
				else {
					futurePosition.setX(1);
					futurePosition.setY(2);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[1][2].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[1][3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(1);
					curentPosition.setY(3);
				}
				else {
					futurePosition.setX(1);
					futurePosition.setY(3);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[1][3].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[1][4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(1);
					curentPosition.setY(4);
				}
				else {
					futurePosition.setX(1);
					futurePosition.setY(4);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[1][4].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[1][5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(1);
					curentPosition.setY(5);
				}
				else {
					futurePosition.setX(1);
					futurePosition.setY(5);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[1][5].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[1][6].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(1);
					curentPosition.setY(6);
				}
				else {
					futurePosition.setX(1);
					futurePosition.setY(6);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[1][6].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[1][7].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(1);
					curentPosition.setY(7);
				}
				else {
					futurePosition.setX(1);
					futurePosition.setY(7);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[1][7].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[2][0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(2);
					curentPosition.setY(0);
				}
				else {
					futurePosition.setX(2);
					futurePosition.setY(0);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[2][0].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[2][1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(2);
					curentPosition.setY(1);
				}
				else {
					futurePosition.setX(2);
					futurePosition.setY(1);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[2][1].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[2][2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(2);
					curentPosition.setY(2);
				}
				else {
					futurePosition.setX(2);
					futurePosition.setY(2);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[2][2].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[2][3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(2);
					curentPosition.setY(3);
				}
				else {
					futurePosition.setX(2);
					futurePosition.setY(3);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[2][3].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[2][4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(2);
					curentPosition.setY(4);
				}
				else {
					futurePosition.setX(2);
					futurePosition.setY(4);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[2][4].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[2][5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(2);
					curentPosition.setY(5);
				}
				else {
					futurePosition.setX(2);
					futurePosition.setY(5);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[2][5].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[2][6].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(2);
					curentPosition.setY(6);
				}
				else {
					futurePosition.setX(2);
					futurePosition.setY(6);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[2][6].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[2][7].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(2);
					curentPosition.setY(7);
				}
				else {
					futurePosition.setX(2);
					futurePosition.setY(7);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[2][7].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[3][0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(3);
					curentPosition.setY(0);
				}
				else {
					futurePosition.setX(3);
					futurePosition.setY(0);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[3][0].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[3][1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(3);
					curentPosition.setY(1);
				}
				else {
					futurePosition.setX(3);
					futurePosition.setY(1);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[3][1].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[3][2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(3);
					curentPosition.setY(2);
				}
				else {
					futurePosition.setX(3);
					futurePosition.setY(2);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[3][2].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[3][3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(3);
					curentPosition.setY(3);
				}
				else {
					futurePosition.setX(3);
					futurePosition.setY(3);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[3][3].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[3][4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(3);
					curentPosition.setY(4);
				}
				else {
					futurePosition.setX(3);
					futurePosition.setY(4);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[3][4].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[3][5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(3);
					curentPosition.setY(5);
				}
				else {
					futurePosition.setX(3);
					futurePosition.setY(5);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[3][5].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[3][6].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(3);
					curentPosition.setY(6);
				}
				else {
					futurePosition.setX(3);
					futurePosition.setY(6);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[3][6].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[3][7].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(3);
					curentPosition.setY(7);
				}
				else {
					futurePosition.setX(3);
					futurePosition.setY(7);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[3][7].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[4][0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(4);
					curentPosition.setY(0);
				}
				else {
					futurePosition.setX(4);
					futurePosition.setY(0);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[4][0].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[4][1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(4);
					curentPosition.setY(1);
				}
				else {
					futurePosition.setX(4);
					futurePosition.setY(1);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[4][1].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[4][2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(4);
					curentPosition.setY(2);
				}
				else {
					futurePosition.setX(4);
					futurePosition.setY(2);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[4][2].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[4][3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(4);
					curentPosition.setY(3);
				}
				else {
					futurePosition.setX(4);
					futurePosition.setY(3);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[4][3].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
						
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[4][4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(4);
					curentPosition.setY(4);
				}
				else {
					futurePosition.setX(4);
					futurePosition.setY(4);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[4][4].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[4][5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(4);
					curentPosition.setY(5);
				}
				else {
					futurePosition.setX(4);
					futurePosition.setY(5);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[4][5].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[4][6].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(4);
					curentPosition.setY(6);
				}
				else {
					futurePosition.setX(4);
					futurePosition.setY(6);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[4][6].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[4][7].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(4);
					curentPosition.setY(7);
				}
				else {
					futurePosition.setX(4);
					futurePosition.setY(7);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[4][7].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[5][0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(5);
					curentPosition.setY(0);
				}
				else {
					futurePosition.setX(5);
					futurePosition.setY(0);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[5][0].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[5][1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(5);
					curentPosition.setY(1);
				}
				else {
					futurePosition.setX(5);
					futurePosition.setY(1);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[5][1].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[5][2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(5);
					curentPosition.setY(2);
				}
				else {
					futurePosition.setX(5);
					futurePosition.setY(2);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[5][2].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[5][3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(5);
					curentPosition.setY(3);
				}
				else {
					futurePosition.setX(5);
					futurePosition.setY(3);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[5][3].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[5][4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(5);
					curentPosition.setY(4);
				}
				else {
					futurePosition.setX(5);
					futurePosition.setY(4);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[5][4].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[5][5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(5);
					curentPosition.setY(5);
				}
				else {
					futurePosition.setX(5);
					futurePosition.setY(5);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[5][5].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[5][6].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(5);
					curentPosition.setY(6);
				}
				else {
					futurePosition.setX(5);
					futurePosition.setY(6);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[5][6].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[5][7].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(5);
					curentPosition.setY(7);
				}
				else {
					futurePosition.setX(5);
					futurePosition.setY(7);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[5][7].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[6][0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(6);
					curentPosition.setY(0);
				}
				else {
					futurePosition.setX(6);
					futurePosition.setY(0);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[6][0].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[6][1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(6);
					curentPosition.setY(1);
				}
				else {
					futurePosition.setX(6);
					futurePosition.setY(1);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[6][1].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[6][2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(6);
					curentPosition.setY(2);
				}
				else {
					futurePosition.setX(6);
					futurePosition.setY(2);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[6][2].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[6][3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(6);
					curentPosition.setY(3);
				}
				else {
					futurePosition.setX(6);
					futurePosition.setY(3);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[6][3].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[6][4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(6);
					curentPosition.setY(4);
				}
				else {
					futurePosition.setX(6);
					futurePosition.setY(4);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[6][4].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[6][5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(6);
					curentPosition.setY(5);
				}
				else {
					futurePosition.setX(6);
					futurePosition.setY(5);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[6][5].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[6][6].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(6);
					curentPosition.setY(6);
				}
				else {
					futurePosition.setX(6);
					futurePosition.setY(6);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[6][6].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[6][7].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(6);
					curentPosition.setY(7);
				}
				else {
					futurePosition.setX(6);
					futurePosition.setY(7);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[6][7].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[7][0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(7);
					curentPosition.setY(0);
				}
				else {
					futurePosition.setX(7);
					futurePosition.setY(0);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[7][0].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[7][1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(7);
					curentPosition.setY(1);
				}
				else {
					futurePosition.setX(7);
					futurePosition.setY(1);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[7][1].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}

					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[7][2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(7);
					curentPosition.setY(2);
				}
				else {
					futurePosition.setX(7);
					futurePosition.setY(2);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[7][2].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[7][3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(7);
					curentPosition.setY(3);
				}
				else {
					futurePosition.setX(7);
					futurePosition.setY(3);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[7][3].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[7][4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(7);
					curentPosition.setY(4);
				}
				else {
					futurePosition.setX(7);
					futurePosition.setY(4);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[7][4].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[7][5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(7);
					curentPosition.setY(5);
				}
				else {
					futurePosition.setX(7);
					futurePosition.setY(5);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[7][5].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[7][6].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(7);
					curentPosition.setY(6);
				}
				else {
					futurePosition.setX(7);
					futurePosition.setY(6);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[7][6].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			}
		});
		
		b[7][7].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(curentPosition.getX()==-1)
				{
					curentPosition.setX(7);
					curentPosition.setY(7);
				}
				else {
					futurePosition.setX(7);
					futurePosition.setY(7);
					if(table.getPiece(curentPosition).move(futurePosition, table, tura)==true) {
						b[7][7].setLabel(table.getPiece(futurePosition).getName());
						b[curentPosition.getX()][curentPosition.getY()].setLabel(" ");
						tura++;
						turaJucator.setText(Integer.toString(tura%2+1));
						informatii.repaint();
					}
					curentPosition.setX(-1);
					curentPosition.setY(-1);
					futurePosition.setX(-1);
					futurePosition.setY(-1);
					System.out.println(table);
				}
			} //
		});
		
	}
}