import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DigitChanger extends JFrame{
	private JRadioButton notation[] = new JRadioButton[4];
	private JTextField Digit = new JTextField(8);
	private JTextField Result = new JTextField(8);
	private String name[] = {"decimal", "binary", "ocatal", "hex"}; 
	
	public DigitChanger() {
		super("Digit Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(Digit); c.add(new JLabel("->")); c.add(Result);
		createRadioButton();
		
		MyItemListener listener = new MyItemListener();
		
		for(int i=0; i<4; i++) {
			notation[i].addItemListener(listener);
		}
		
		setSize(300, 100);
		setVisible(true);
	}
	
	public void createRadioButton() {
		ButtonGroup g = new ButtonGroup();
		
		for(int i=0; i<4; i++) {
			notation[i] = new JRadioButton(name[i]);
			g.add(notation[i]);
			add(notation[i]);
		}
	}
	
	class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			Object result = e.getItem();
			int number = Integer.parseInt(Digit.getText());
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(result == notation[0])
					Result.setText(Integer.toString(number));
				else if(result == notation[1])
					Result.setText(Integer.toBinaryString(number));
				else if(result == notation[2])
					Result.setText(Integer.toOctalString(number));
				else if(result == notation[3])
					Result.setText(Integer.toHexString(number));
			}
		}
	}
	public static void main(String[] args) {
		new DigitChanger();
	}
}
