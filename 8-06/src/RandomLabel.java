import java.awt.*;
import javax.swing.*;

public class RandomLabel extends JFrame{
	public RandomLabel(){
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0; i<20; i++) {
			JLabel label = new JLabel(Integer.toString(i));
			int x = (int)(Math.random()*220) + 30;
			int y = (int)(Math.random()*220) + 30;
			label.setLocation(x, y);
			label.setSize(20, 20);
			label.setForeground(Color.MAGENTA);
			c.add(label);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RandomLabel();
	}
}
