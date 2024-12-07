import javax.swing.*;
import java.awt.*;

public class TPC extends JFrame{
	public TPC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyJPanel());
		
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TPC();
	}
	
	class MyJPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			g.setColor(Color.RED);
			g.fillArc(10, 10, 150, 150, 90, 120);
			g.setColor(Color.BLUE);
			g.fillArc(10, 10, 150, 150, 210, 120);
			g.setColor(Color.YELLOW);
			g.fillArc(10, 10, 150, 150, 330, 120);
		}
	}
}
