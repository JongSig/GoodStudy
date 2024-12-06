import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class mouseDrag extends JFrame{
	private ImageIcon icon = new ImageIcon("images/mouse.png");
	private JLabel label = new JLabel(icon);
	
	public mouseDrag() {
		super("이미지 드래깅");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		MymouseListener listener = new MymouseListener();
		label.addMouseListener(listener);
		label.addMouseMotionListener(listener);
		
		label.setIcon(icon);
		label.setLocation(50, 50);
		label.setSize(50, 50);
		c.add(label);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public class MymouseListener extends MouseAdapter {
		private int x,y;
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX(); y = e.getY();
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println(e.getX() + "," + e.getY());
			int distanceX = e.getX() - x;
			int distanceY = e.getY() - y;
			label.setLocation(label.getX() + distanceX, label.getY() + distanceY);
		}
	}
	
	public static void main(String[] args) {
		new mouseDrag();
	}
}
