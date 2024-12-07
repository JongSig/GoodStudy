import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class drawOvalEx extends JFrame{
	public drawOvalEx() {
		setTitle("이미지 위에 원 드래기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyJPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new drawOvalEx();
	}
	
	class MyJPanel extends JPanel{
		private Point start = null;
		
		public MyJPanel() {
			MyMouseListener listener = new MyMouseListener();
			
			addMouseListener(listener);
			addMouseMotionListener(listener);
			
		}
		
		private ImageIcon icon = new ImageIcon("images/Gosegu.jpg");
		private Image img = icon.getImage();
		
		@Override
		public void paintComponent(Graphics g) {
			//super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			
			if(start == null)
				return;
			
			int x = start.x - 10;
			int y = start.y - 10;
			g.setColor(Color.CYAN);
			g.fillOval(x, y, 20, 20);
		}
		
		class MyMouseListener extends MouseAdapter{
			@Override
			public void mousePressed(MouseEvent e) {
				start = e.getPoint();
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				start = e.getPoint();
				repaint();
			}
		}
	}
}
