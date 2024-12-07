import javax.swing.*;
import java.awt.*;

public class diamond extends JFrame{
	
	public diamond() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyJPanel());
		
		setSize(200, 200);
		setVisible(true);
	}
	
	class MyJPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			int x[] = {(int)(getWidth()/2), 0, (int)(getWidth()/2), getWidth()};
			int y[] = {0, (int)(getHeight()/2), getHeight(), (int)(getHeight()/2)};
			g.drawPolygon(x, y, 4);
		}
	}
	
	public static void main(String[] args) {
		new diamond();
	}
}
