import java.awt.*;
import javax.swing.*;

class ConterPanel extends JPanel{
	public ConterPanel() {
		setLayout(null);
		JLabel label = new JLabel("Hello Java!");
		label.setSize(100, 20);
		label.setLocation(100, 50);
		add(label);
	}
}

class NorthPanel extends JPanel{
	public NorthPanel(){
		setLayout(new FlowLayout());
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
		setBackground(Color.GRAY);
	}
}

public class aSimpleSwingProgram extends JFrame{
	public aSimpleSwingProgram() {
		setTitle("Open Challenge 8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new NorthPanel(), BorderLayout.NORTH);
		add(new ConterPanel(), BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new aSimpleSwingProgram();
	}
}
