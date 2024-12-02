import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RandomJLabel extends JFrame{
	private JLabel la = new JLabel("C");
	
	public RandomJLabel() {
		super("클릭 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		la.setSize(20, 20);
		la.setFont(new Font("Anial", Font.PLAIN, 15));
		la.setLocation(50, 50);
		c.add(la);
		
		la.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Container c = la.getParent();
				int xBound = c.getWidth() - la.getWidth();
				int yBound = c.getHeight() - la.getHeight();
				la.setLocation((int)(Math.random()*xBound), (int)(Math.random()*yBound));
			}
		});
		
		la.setFocusable(true);
		la.requestFocus();
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RandomJLabel();
	}
}
