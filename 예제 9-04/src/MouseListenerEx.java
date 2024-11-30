import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame{
	private JLabel label = new JLabel("Hello");
	
	public MouseListenerEx() {
		setTitle("Mouse 이밴트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(null);
		label.setSize(50, 20);
		label.setLocation(30, 30);
		contentPane.add(label);
		
		setSize(200, 200);
		setVisible(true);
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getX();
				int y = e.getY();
				label.setLocation(x, y);
			}
		});
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
