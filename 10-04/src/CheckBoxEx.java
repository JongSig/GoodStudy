import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxEx extends JFrame{
	private JCheckBox btnEvent[] = new JCheckBox[2];
	private JButton text = new JButton("text button");
	private String str[] = {"버튼 비활성화", "버튼 감추기"};
	
	public CheckBoxEx() {
		super("CheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyItemListener listener = new MyItemListener();
		
		for(int i=0; i<2; i++) {
			btnEvent[i] = new JCheckBox(str[i]);
			btnEvent[i].addItemListener(listener);
			c.add(btnEvent[i]);
		}
		c.add(text);
		
		setSize(250, 150);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			Object source = e.getSource();
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(source == btnEvent[0]) {
					text.setEnabled(false);
				}else if(source == btnEvent[1]) {
					text.setVisible(false);
				}
			}else {
				if(source == btnEvent[0])
					text.setEnabled(true);
				else if(source == btnEvent[1])
					text.setVisible(true);
			}
		}
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();
	}
}
