import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoRadioButtonEx extends JFrame{
	private JRadioButton Colors[] = new JRadioButton[2];
	private String ColorName[] = {"Red", "Blue"};
	
	public TwoRadioButtonEx() {
		super("Two Radio Button");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		createRadioButton();
		MyItemListener Listener = new MyItemListener();
		Colors[0].addItemListener(Listener);
		Colors[1].addItemListener(Listener);
		
		c.setFocusable(true);
		c.requestFocus();
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public void createRadioButton() {
		ButtonGroup g = new ButtonGroup();
		
		for(int i=0; i<2; i++) {
			Colors[i] = new JRadioButton(ColorName[i]);
			Colors[i].setBorderPainted(true);
			g.add(Colors[i]);
			add(Colors[i]);
		}
	}
	
	class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			Object result = e.getItem();
			
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(result == Colors[0])
					getContentPane().setBackground(Color.RED);
				else
					getContentPane().setBackground(Color.BLUE);
			}
		}
	}
	public static void main(String[] args) {
		new TwoRadioButtonEx();
	}
}
