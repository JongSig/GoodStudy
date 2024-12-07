import java.awt.*;
import javax.swing.*;

public class board extends JFrame{
	public board() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyJPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new board();
	}
	
	class MyJPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			int x = getWidth()/10;
			int y = getHeight()/10;
			
			for(int i=0; i<10; i++) {
				g.drawLine(x*i, 0, x*i, getHeight());
			}
			
			for(int i=0; i<10; i++) {
				g.drawLine(0, y*i, getWidth(), y*i);
			}
		}
	}
}
