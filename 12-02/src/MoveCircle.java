import java.awt.*;
import javax.swing.*;

public class MoveCircle extends JFrame{
	private int x = 50, y = 50;
	
	public MoveCircle() {
		setTitle("원을 0.5초");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new Circle());
		
		setSize(300, 300);
		setVisible(true);
		
		Thread th = new Thread(new Move());
		th.start();
	}
	
	class Move extends Thread{
		public void run() {
			while(true) {
				try {
					sleep(500);
					x = (int)(Math.random()*250+1);
					y = (int)(Math.random()*200+1);
					repaint();
					
				}catch(InterruptedException e) {
					return;
				}
			}
		}
	}
	
	
	class Circle extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			g.drawOval(x, y, 50, 50);
		}
	}
	
	public static void main(String[] args) {
		new MoveCircle();
	}
}
