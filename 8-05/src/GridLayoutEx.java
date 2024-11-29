import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
	private Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
			Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
			Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
			Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA};
	
	public GridLayoutEx() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(4, 4));
		
		for(int i=0; i<16; i++) {
			JLabel label = new JLabel(Integer.toString(i));
			label.setOpaque(true);
			label.setBackground(color[i]);
			c.add(label);
		}
		
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
