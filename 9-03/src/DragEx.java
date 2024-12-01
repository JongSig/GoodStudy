import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DragEx extends JFrame{
	public DragEx() {
		super("드래깅동안...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		
		MyMouseListener ml = new MyMouseListener();
		c.addMouseListener(ml);
		c.addMouseMotionListener(ml);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter implements MouseMotionListener{
		@Override
		public void mouseDragged(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		@Override
		public void mouseMoved(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {
			Container c = (Container)e.getComponent();
			c.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String[] args) {
		new DragEx();
	}
}