import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame{
	private JLabel[] la = new JLabel[12];
	
	public GridLayoutEx() {
		super("3X4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 3));
		
		for(int i=0; i<la.length; i++) {
			la[i] = new JLabel(Integer.toString(i));
			la[i].setSize(20, 20);
			
			la[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					JLabel la = (JLabel)e.getSource();
					int r = (int) (Math.random()*256);
					int g = (int) (Math.random()*256);
					int b = (int) (Math.random()*256);
					la.setOpaque(true);
					la.setBackground(new Color(r, g, b));
				}
			});
			c.add(la[i]);
		}
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
