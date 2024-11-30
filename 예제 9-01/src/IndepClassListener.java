import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class IndepClassListener  extends JFrame{
	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
			}
		});
		
		
		setSize(250, 120);
		setVisible(true);
	}
	public static void main(String[] args) {
		new IndepClassListener();
	}
}
