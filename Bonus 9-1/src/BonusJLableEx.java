import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BonusJLableEx extends JFrame{
	public BonusJLableEx() {
		super("마우스 휠로...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		
		la.addMouseWheelListener(new MouseAdapter() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				if(n<0) {
					//JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("Arial", Font.PLAIN, size-5));
				}else {
					//JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("Arial", Font.PLAIN, size+5));
				}
			}
		});
		
		c.add(la);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BonusJLableEx();
	}
}
