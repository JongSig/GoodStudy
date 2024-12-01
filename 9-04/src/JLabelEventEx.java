import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JLabelEventEx extends JFrame{
	private JLabel la = new JLabel("Love Java");
	
	public JLabelEventEx() {
		super("+,-키로 폰트...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());	
		c.add(la);		
		
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		la.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyChar = e.getKeyChar();
				Font f = la.getFont();
				int size = f.getSize();
				if(keyChar == '+') {
					la.setFont(new Font("Arial", Font.PLAIN, size+5));
				}
				if(keyChar == '-') {
					la.setFont(new Font("Arial", Font.PLAIN, size-5));
				}
			}
		});
		
		la.setFocusable(true);
		la.requestFocus();
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JLabelEventEx();
	}
}
