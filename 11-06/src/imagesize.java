import java.awt.*;
import java.awt.RenderingHints.Key;
import java.awt.event.*;
import javax.swing.*;

public class imagesize extends JFrame{
	public imagesize() {
		setTitle("그래픽 이미지 10%");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyJPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new imagesize();
	}
	
	class MyJPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/Gosegu.jpg");
		private Image img = icon.getImage();
		private int x = img.getWidth(this), y = img.getHeight(this);
		
		public MyJPanel() {
			MyKeyListener listener = new MyKeyListener();
			
			addKeyListener(listener);
			
			setFocusable(true);
			requestFocus();
		}
		
		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(img, 10, 10, x, y, this);
		}
		
		class MyKeyListener extends KeyAdapter{
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					x = x+x/10;
					y = y+y/10;
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					x = x-x/10;
					y = y-y/10;
				}
				repaint();
			}
		}
	}
}
