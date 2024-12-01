import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventEx extends JFrame{
	public KeyEventEx() {
		super("키 누르기...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.setBackground(Color.CYAN);
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int keyChar = e.getKeyChar();
				if(keyChar == 'r') {
					c.setBackground(Color.RED);
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				c.setBackground(Color.CYAN);
			}
		});
		
		c.setFocusable(true);
		c.requestFocus();
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new KeyEventEx();
	}
}
