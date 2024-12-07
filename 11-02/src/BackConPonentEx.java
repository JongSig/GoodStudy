import java.awt.*;
import javax.swing.*;

public class BackConPonentEx extends JFrame{
	public BackConPonentEx() {
		setTitle("이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyJPanel());
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JButton("Hello"));
		
		setSize(300, 550);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BackConPonentEx();
	}
	
	class MyJPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
}
