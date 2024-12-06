import javax.swing.*;
import java.awt.*;

public class imagesJLabelEx extends JFrame{
	private ImageIcon[] images = new ImageIcon[4];
	private JLabel[] la = new JLabel[4];
	
	public imagesJLabelEx() {
		super("4 Images");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,4));
		
		for(int i=0; i<images.length; i++) {
			images[i] = new ImageIcon("images/img"+(i+1)+".jpg");
			la[i] = new JLabel(images[i]);
			c.add(la[i]);
		}
		
		setSize(800, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new imagesJLabelEx();
	}
}
