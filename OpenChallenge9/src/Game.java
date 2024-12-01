import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JFrame{
	public Game() {
		setTitle("OpenChallenge9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new GamePanel());
		
		getContentPane().setFocusable(true);
		getContentPane().requestFocus();
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class GamePanel extends JPanel{
		private JLabel[] la = new JLabel[4];
		private JLabel result = new JLabel("시작합니다.");
		
		public GamePanel() {
			setLayout(null);
			for(int i=0; i<3; i++) {
				la[i] = new JLabel("0");
				la[i].setSize(60, 30);
				la[i].setLocation(30 + 80*i, 50);
				la[i].setHorizontalAlignment(JLabel.CENTER);
				la[i].setOpaque(true);
				la[i].setBackground(Color.BLUE);
				la[i].setForeground(Color.YELLOW);
				la[i].setFont(new Font("Tahoma",Font.ITALIC,30));
				add(la[i]);
			}
			
			result.setSize(200, 20);
			result.setLocation(100, 120);
			add(result);
			
			addKeyListener(new MyKeyListener());
		}
		
		public class MyKeyListener extends KeyAdapter{
			@Override
			public void keyPressed(KeyEvent e) {
				int x1=0, x2=0, x3=0;
				if(e.getKeyChar() == '\n') {
					x1 = (int)(Math.random()*5);
					la[0].setText(Integer.toString(x1));
					x2 = (int)(Math.random()*5);
					la[1].setText(Integer.toString(x2));
					x3 = (int)(Math.random()*5);
					la[2].setText(Integer.toString(x3));
				}
				
				if(x1 == x2 && x2 == x3)
					result.setText("축하합니다.");
				else
					result.setText("아쉽군요.");			
			}
		}
	}
	
	public static void main(String[] args) {
		new Game();
	}
}