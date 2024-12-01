import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventEx extends JFrame{
	private JLabel la = new JLabel("자기야");
	
	public MouseEventEx() {
		setTitle("마우스 올...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new CenterPanel());
		
		la.setFocusable(true);
		la.requestFocus();
		
		setSize(200, 100);
		setVisible(true);
	}
	
	public class CenterPanel extends JPanel{
		public CenterPanel() {
			add(la);
			la.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					JLabel label = (JLabel)e.getSource();
					label.setText("사랑해");
				}
				@Override
				public void mouseExited(MouseEvent e) {
					la.setText("자기야");
				}
			});	
		}
	}
	
	public static void main(String[] args) {
		new MouseEventEx();
	}
}
