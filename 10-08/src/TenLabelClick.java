import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TenLabelClick extends JFrame{
	private JLabel[] label = new JLabel[10];
	private int count = 0;
	
	public TenLabelClick() {
		super("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		MyMouseListener listener = new MyMouseListener();
		for(int i=0; i<10; i++) {
			int x = (int)(Math.random()*250);
			int y = (int)(Math.random()*250);
			
			System.out.println(x + " " + y);
			label[i] = new JLabel(Integer.toString(i));
			label[i].setBounds(x, y, 20, 20);
			label[i].addMouseListener(listener);
			c.add(label[i]);
		}
		
		setSize(300,300);
		setVisible(true);
	}
	
	public class MyMouseListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			JLabel la = (JLabel)e.getSource();
			if(label[count] == la) {
				la.setVisible(false);
				count++;
				if(count == 10) {
					new TenLabelClick();
					dispose();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new TenLabelClick();
	}
}
