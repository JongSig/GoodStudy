import javax.swing.*;
import java.awt.*;

public class OF extends JFrame{
	public OF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyJPanel());
		
		setSize(360,210);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new OF();
	}
	
	class MyJPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			g.setColor(Color.BLUE);
			g.drawOval(10, 10, 100, 100);
			g.setColor(Color.YELLOW);
			g.drawOval(67, 65, 100, 100);
			g.setColor(Color.BLACK);
			g.drawOval(125, 10, 100, 100);
			g.setColor(Color.GREEN);
			g.drawOval(183, 65, 100, 100);
			g.setColor(Color.RED);
			g.drawOval(241, 10, 100, 100);
		}
	}
}
