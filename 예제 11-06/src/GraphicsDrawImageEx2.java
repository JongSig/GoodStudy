import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx2 extends JFrame{
	public GraphicsDrawImageEx2() {
		setTitle("패널의 크기에 맞추어 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(800, 1000);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/Gosegu.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 10, 10, getWidth()-20, getHeight()-20, this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx2();
	}
}
