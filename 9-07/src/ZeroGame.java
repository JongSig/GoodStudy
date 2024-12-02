import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ZeroGame extends JFrame{
	private JLabel la;
	private JButton[] btn = new JButton[3];
	
	public ZeroGame() {
		super("0로 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new CenterJPanel(), BorderLayout.CENTER);
		c.add(new SouthJPanel(), BorderLayout.SOUTH);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class CenterJPanel extends JPanel{
		public CenterJPanel() {
			int num = (int)(Math.random()*60+1);
			la = new JLabel(Integer.toString(num));
			la.setSize(60, 30);
			la.setFont(getFont().deriveFont(20.0f));
			add(la);
		}
	}
	class SouthJPanel extends JPanel{
		
		public SouthJPanel() {
			btn[0] = new JButton("+2");
			btn[1] = new JButton("-1");
			btn[2] = new JButton("%4");
			
			for(int i=0; i<btn.length; i++) {
				btn[i].addActionListener(new MyActionListener());
				add(btn[i]);
			}
		}
	}
	
	public class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			ZeroGame.this.setTitle("0으로 만들기");
			
			int num = Integer.valueOf(la.getText());
			switch (e.getActionCommand()) {
			case "+2":
				num += 2;
				btn[0].setEnabled(false);
				la.setText(Integer.toString(num));
				break;
			case "-1":
				num -= 1;
				btn[1].setEnabled(false);
				la.setText(Integer.toString(num));
				break;
			case "%4":
				num %= 4;
				btn[2].setEnabled(false);
				la.setText(Integer.toString(num));
				break;
			}
			if(num == 0) {
				ZeroGame.this.setTitle("성공");
				for(int i=0; i<3; i++) {
					btn[i].setEnabled(true);
				}
				int n = (int)(Math.random()*60+1);
				la.setText(Integer.toString(n));
			}else {
				if(btn[0].isEnabled() == false &&
						btn[1].isEnabled() == false &&
						btn[2].isEnabled() == false) setTitle("실패");
			}
		}
	}
	
	
	public static void main(String[] args) {
		new ZeroGame();
	}
}
