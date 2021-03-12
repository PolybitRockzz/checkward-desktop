package tech.polybit.checkward;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Game extends JPanel {

	private JPanel board;
	private JLabel[][] grid;
	private JLabel subtitles;
	private JLabel proceedText;
	private JLabel hint;
	
	private String nature[][] = {  {"empty","empty","empty","empty","empty"},
			   				       {"empty","empty","empty","empty","empty"},
			   				       {"empty","empty","empty","empty","empty"},
			   				       {"empty","empty","empty","empty","empty"},
			   				       {"empty","empty","empty","empty","empty"}  };
	
	private boolean redExists;
	private boolean blueExists;
	private int redPos = 00, bluePos = 00;
	private int level = 1;

	/**
	 * Create the panel.
	 */
	public Game(JFrame frame) {
		
		setBounds(0, 0, 744, 471);
		setBackground(new Color(2, 51, 20));
		setLayout(null);

		board = new JPanel();
		board.setBounds(250, 100, 250, 250);
		add(board);
		board.setLayout(null);
		
		grid = new JLabel[5][5];

		grid[0][0] = new JLabel();
		grid[0][0].setBounds(0, 0, 50, 50);
		grid[0][0].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[0][0]);

		grid[1][0] = new JLabel();
		grid[1][0].setBounds(50, 0, 50, 50);
		grid[1][0].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[1][0]);

		grid[2][0] = new JLabel();
		grid[2][0].setBounds(100, 0, 50, 50);
		grid[2][0].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[2][0]);

		grid[3][0] = new JLabel();
		grid[3][0].setBounds(150, 0, 50, 50);
		grid[3][0].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[3][0]);

		grid[4][0] = new JLabel();
		grid[4][0].setBounds(200, 0, 50, 50);
		grid[4][0].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[4][0]);

		grid[0][1] = new JLabel();
		grid[0][1].setBounds(0, 50, 50, 50);
		grid[0][1].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[0][1]);

		grid[1][1] = new JLabel();
		grid[1][1].setBounds(50, 50, 50, 50);
		grid[1][1].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[1][1]);

		grid[2][1] = new JLabel();
		grid[2][1].setBounds(100, 50, 50, 50);
		grid[2][1].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[2][1]);

		grid[3][1] = new JLabel();
		grid[3][1].setBounds(150, 50, 50, 50);
		grid[3][1].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[3][1]);

		grid[4][1] = new JLabel();
		grid[4][1].setBounds(200, 50, 50, 50);
		grid[4][1].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[4][1]);

		grid[0][2] = new JLabel();
		grid[0][2].setBounds(0, 100, 50, 50);
		grid[0][2].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[0][2]);

		grid[1][2] = new JLabel();
		grid[1][2].setBounds(50, 100, 50, 50);
		grid[1][2].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[1][2]);

		grid[2][2] = new JLabel();
		grid[2][2].setBounds(100, 100, 50, 50);
		grid[2][2].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[2][2]);

		grid[3][2] = new JLabel();
		grid[3][2].setBounds(150, 100, 50, 50);
		grid[3][2].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[3][2]);

		grid[4][2] = new JLabel();
		grid[4][2].setBounds(200, 100, 50, 50);
		grid[4][2].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[4][2]);

		grid[0][3] = new JLabel();
		grid[0][3].setBounds(0, 150, 50, 50);
		grid[0][3].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[0][3]);

		grid[1][3] = new JLabel();
		grid[1][3].setBounds(50, 150, 50, 50);
		grid[1][3].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[1][3]);

		grid[2][3] = new JLabel();
		grid[2][3].setBounds(100, 150, 50, 50);
		grid[2][3].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[2][3]);

		grid[3][3] = new JLabel();
		grid[3][3].setBounds(150, 150, 50, 50);
		grid[3][3].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[3][3]);

		grid[4][3] = new JLabel();
		grid[4][3].setBounds(200, 150, 50, 50);
		grid[4][3].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[4][3]);

		grid[0][4] = new JLabel();
		grid[0][4].setBounds(0, 200, 50, 50);
		grid[0][4].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[0][4]);

		grid[1][4] = new JLabel();
		grid[1][4].setBounds(50, 200, 50, 50);
		grid[1][4].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[1][4]);

		grid[2][4] = new JLabel();
		grid[2][4].setBounds(100, 200, 50, 50);
		grid[2][4].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[2][4]);

		grid[3][4] = new JLabel();
		grid[3][4].setBounds(150, 200, 50, 50);
		grid[3][4].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[3][4]);
		
		grid[4][4] = new JLabel();
		grid[4][4].setBounds(200, 200, 50, 50);
		grid[4][4].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
		board.add(grid[4][4]);

		subtitles = new JLabel("Level 01");
		subtitles.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		subtitles.setForeground(new Color(196, 245, 217));
		subtitles.setHorizontalAlignment(SwingConstants.CENTER);
		subtitles.setBounds(10, 375, 724, 20);
		add(subtitles);

		proceedText = new JLabel("Complete this Level to proceed!");
		proceedText.setHorizontalAlignment(SwingConstants.RIGHT);
		proceedText.setForeground(new Color(196, 245, 217));
		proceedText.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		proceedText.setBounds(399, 440, 335, 20);
		add(proceedText);
		
		proceed();

		frame.addKeyListener(new KeyAdapter() {
			

			@Override
			public void keyReleased(KeyEvent arg0) {
				if(arg0.getKeyChar() == 'a' || arg0.getKeyChar() == 'd') {
					if(redExists)
						moveRed(arg0.getKeyChar());
				} else if(arg0.getKeyChar() == 'w' || arg0.getKeyChar() == 's') {
					if(blueExists)
						moveBlue(arg0.getKeyChar());
				}
			}
		});

	}
	
	private void moveRed(char key) {
		int x = redPos/10, y = redPos%10;
		System.out.println("Red === X: " + x + " Y: " + y);
		if(key == 'a' && x != 0) {
			if(nature[x-1][y].equals("goal")) {
				grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
				nature[x][y] = "empty";
				redPos = 00;
				redExists = false;
				checkpoint();
			} else if(nature[x-1][y].equals("empty")) {
				grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
				grid[x-1][y].setIcon(new ImageIcon("./assets/red-guy-tile.PNG"));
				nature[x][y] = "empty";
				nature[x-1][y] = "red";
				redPos -= 10;
			} else if(!nature[x-1][y].equals("empty") && x > 1 && nature[x-2][y].equals("empty")) {
				grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
				grid[x-1][y].setIcon(new ImageIcon("./assets/red-guy-tile.PNG"));
				if(nature[x-1][y].equals("blue")) {
					grid[x-2][y].setIcon(new ImageIcon("./assets/blue-guy-tile.PNG"));
					nature[x-2][y] = "blue";
					bluePos -= 10;
				} else if(nature[x-1][y].equals("box")) {
					grid[x-2][y].setIcon(new ImageIcon("./assets/box-tile.PNG"));
					nature[x-2][y] = "box";
				}
				nature[x][y] = "empty";
				nature[x-1][y] = "red";
				redPos -= 10;
			} else if(!nature[x-1][y].equals("empty") && x > 1 && nature[x-2][y].equals("goal")) {
				if(nature[x-1][y].equals("blue")) {
					grid[x-1][y].setIcon(new ImageIcon("./assets/red-guy-tile.PNG"));
					grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
					redPos -= 10;
					blueExists = false;
					nature[x][y] = "empty";
					nature[x-1][y] = "red";
				}
			}
		} else if(key == 'd' && x != 4) {
			if(nature[x+1][y].equals("goal")) {
				grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
				nature[x][y] = "empty";
				redPos = 00;
				redExists = false;
				checkpoint();
			} else if(nature[x+1][y].equals("empty")) {
				grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
				grid[x+1][y].setIcon(new ImageIcon("./assets/red-guy-tile.PNG"));
				nature[x][y] = "empty";
				nature[x+1][y] = "red";
				redPos += 10;
			} else if(!nature[x+1][y].equals("empty") && x < 3 && nature[x+2][y].equals("empty")) {
				grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
				grid[x+1][y].setIcon(new ImageIcon("./assets/red-guy-tile.PNG"));
				if(nature[x+1][y].equals("blue")) {
					grid[x+2][y].setIcon(new ImageIcon("./assets/blue-guy-tile.PNG"));
					nature[x+2][y] = "blue";
					bluePos += 10;
				} else if(nature[x+1][y].equals("box")) {
					grid[x+2][y].setIcon(new ImageIcon("./assets/box-tile.PNG"));
					nature[x+2][y] = "box";
				}
				nature[x][y] = "empty";
				nature[x+1][y] = "red";
				redPos += 10;
			} else if(!nature[x+1][y].equals("empty") && x < 3 && nature[x+2][y].equals("goal")) {
				if(nature[x+1][y].equals("blue")) {
					grid[x+1][y].setIcon(new ImageIcon("./assets/red-guy-tile.PNG"));
					grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
					redPos += 10;
					blueExists = false;
					nature[x][y] = "empty";
					nature[x+1][y] = "red";
				}
			}
		}
	}
	
	private void checkpoint() {
		if(!redExists && !blueExists) {
			level++;
			proceed();
		}
	}

	private void moveBlue(char key) {
		int x = bluePos/10, y = bluePos%10;
		System.out.println("Blue === X: " + x + " Y: " + y);
		if(key == 'w' && y != 0) {
			if(nature[x][y-1].equals("goal")) {
				grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
				nature[x][y] = "empty";
				bluePos = 00;
				blueExists = false;
				checkpoint();
			} else if(nature[x][y-1].equals("empty")) {
				grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
				grid[x][y-1].setIcon(new ImageIcon("./assets/blue-guy-tile.PNG"));
				nature[x][y] = "empty";
				nature[x][y-1] = "blue";
				bluePos -= 1;
			} else if(!nature[x][y-1].equals("empty") && y > 1 && nature[x][y-2].equals("empty")) {
				grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
				grid[x][y-1].setIcon(new ImageIcon("./assets/blue-guy-tile.PNG"));
				if(nature[x][y-1].equals("red")) {
					grid[x][y-2].setIcon(new ImageIcon("./assets/red-guy-tile.PNG"));
					nature[x][y-2] = "red";
					redPos -= 1;
				} else if(nature[x][y-1].equals("box")) {
					grid[x][y-2].setIcon(new ImageIcon("./assets/box-tile.PNG"));
					nature[x][y-2] = "box";
				}
				nature[x][y] = "empty";
				nature[x][y-1] = "blue";
				bluePos -= 1;
			} else if(!nature[x][y-1].equals("empty") && y > 1 && nature[x][y-2].equals("goal")) {
				if(nature[x][y-1].equals("red")) {
					grid[x][y-1].setIcon(new ImageIcon("./assets/blue-guy-tile.PNG"));
					grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
					bluePos -= 1;
					redExists = false;
					nature[x][y] = "empty";
					nature[x][y-1] = "blue";
				}
			}
		} else if(key == 's' && y != 4) {
			if(nature[x][y+1].equals("goal")) {
				grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
				nature[x][y] = "empty";
				bluePos = 00;
				blueExists = false;
				checkpoint();
			} else if(nature[x][y+1].equals("empty")) {
				grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
				grid[x][y+1].setIcon(new ImageIcon("./assets/blue-guy-tile.PNG"));
				nature[x][y] = "empty";
				nature[x][y+1] = "blue";
				bluePos += 1;
			} else if(!nature[x][y+1].equals("empty") && y < 3 && nature[x][y+2].equals("empty")) {
				grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
				grid[x][y+1].setIcon(new ImageIcon("./assets/blue-guy-tile.PNG"));
				if(nature[x][y+1].equals("red")) {
					grid[x][y+2].setIcon(new ImageIcon("./assets/red-guy-tile.PNG"));
					nature[x][y+2] = "red";
					redPos += 1;
				} else if(nature[x][y+1].equals("box")) {
					grid[x][y+2].setIcon(new ImageIcon("./assets/box-tile.PNG"));
					nature[x][y+2] = "box";
				}
				nature[x][y] = "empty";
				nature[x][y+1] = "blue";
				bluePos += 1;
			} else if(!nature[x][y+1].equals("empty") && y < 3 && nature[x+2][y].equals("goal")) {
				if(nature[x][y+1].equals("red")) {
					grid[x][y+1].setIcon(new ImageIcon("./assets/blue-guy-tile.PNG"));
					grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
					bluePos += 1;
					redExists = false;
					nature[x][y] = "empty";
					nature[x][y+1] = "blue";
				}
			}
		}
	}

	private void proceed() {
		if(level == 1) {
			grid[4][2].setIcon(new ImageIcon("./assets/goal-tile.PNG"));
			nature[4][2] = "goal";
			grid[0][2].setIcon(new ImageIcon("./assets/red-guy-tile.PNG"));
			nature[0][2] = "red";
			redExists = true;
			redPos = 02;
		} else if(level == 2) {
			for(int y = 0; y <= 4; y++) {
				for(int x = 0; x <= 4; x++) {
					grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
					nature[x][y] = "empty";
				}
			}
			subtitles.setText("Level 02");
			grid[2][0].setIcon(new ImageIcon("./assets/goal-tile.PNG"));
			nature[2][0] = "goal";
			grid[2][4].setIcon(new ImageIcon("./assets/blue-guy-tile.PNG"));
			nature[2][4] = "blue";
			blueExists = true;
			bluePos = 24;
		} else if(level == 3) {
			for(int y = 0; y <= 4; y++) {
				for(int x = 0; x <= 4; x++) {
					grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
					nature[x][y] = "empty";
				}
			}
			subtitles.setText("Level 03");
			grid[3][0].setIcon(new ImageIcon("./assets/goal-tile.PNG"));
			nature[3][0] = "goal";
			grid[0][2].setIcon(new ImageIcon("./assets/red-guy-tile.PNG"));
			nature[0][2] = "red";
			grid[2][4].setIcon(new ImageIcon("./assets/blue-guy-tile.PNG"));
			nature[2][4] = "blue";
			redExists = true;
			redPos = 02;
			blueExists = true;
			bluePos = 24;
		} else if(level == 4) {
			for(int y = 0; y <= 4; y++) {
				for(int x = 0; x <= 4; x++) {
					grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
					nature[x][y] = "empty";
				}
			}
			subtitles.setText("Level 04");
			grid[4][1].setIcon(new ImageIcon("./assets/goal-tile.PNG"));
			nature[4][1] = "goal";
			grid[0][2].setIcon(new ImageIcon("./assets/red-guy-tile.PNG"));
			nature[0][2] = "red";
			grid[2][4].setIcon(new ImageIcon("./assets/blue-guy-tile.PNG"));
			nature[2][4] = "blue";
			grid[3][1].setIcon(new ImageIcon("./assets/box-tile.PNG"));
			nature[3][1] = "box";
			redExists = true;
			redPos = 02;
			blueExists = true;
			bluePos = 24;
		} else if(level == 5) {
			for(int y = 0; y <= 4; y++) {
				for(int x = 0; x <= 4; x++) {
					grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
					nature[x][y] = "empty";
				}
			}
			subtitles.setText("Level 05");
			grid[0][2].setIcon(new ImageIcon("./assets/goal-tile.PNG"));
			nature[0][2] = "goal";
			grid[2][4].setIcon(new ImageIcon("./assets/blue-guy-tile.PNG"));
			nature[2][4] = "blue";
			grid[3][1].setIcon(new ImageIcon("./assets/red-guy-tile.PNG"));
			nature[3][1] = "red";
			grid[2][1].setIcon(new ImageIcon("./assets/box-tile.PNG"));
			nature[2][1] = "box";
			redExists = true;
			redPos = 31;
			blueExists = true;
			bluePos = 24;
		} else if(level == 6) {
			for(int y = 0; y <= 4; y++) {
				for(int x = 0; x <= 4; x++) {
					grid[x][y].setIcon(new ImageIcon("./assets/empty-tile.PNG"));
					nature[x][y] = "empty";
				}
			}
			subtitles.setText("The End!");
		}
	}

}
