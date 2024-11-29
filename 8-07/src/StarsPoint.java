import java.awt.*;
import javax.swing.*;

class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.YELLOW);
		setLayout(new FlowLayout());
		add(new JButton("새로 배치"));
		add(new JButton("종료"));
	}
}

class CenterPanel extends JPanel{
	public CenterPanel() {
		setLayout(null);
		for(int i=0;i<10;i++) {
			JLabel label = new JLabel("*");
			int x = (int)(Math.random()*290);
			int y = (int)(Math.random()*150);
			label.setLocation(x, y);
			label.setSize(20, 20);
			label.setForeground(Color.RED);
			add(label);
		}
	}
}

class SouthPanel extends JPanel{
	public SouthPanel() {
		setBackground(Color.GRAY);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("별 개수 수정"));
		add(new JTextField(10));
	}
}

public class StarsPoint extends JFrame{
	public StarsPoint() {
		setTitle("3개의 패널을 가지고..");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new NorthPanel(), BorderLayout.NORTH);
		add(new CenterPanel(), BorderLayout.CENTER);
		add(new SouthPanel(), BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new StarsPoint();
	}
}
