import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame{
	public GraphicsDrawImageEx1() {
		setTitle("원본의 크기로 원하는 위치에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		MyPanel a = new MyPanel();
		
		int width = a.getpaintX();
		int height = a.getpaintY();
		
		setSize(width+50, height+75);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/Beechan.jpg");
		private Image img = icon.getImage();
		
		public int getpaintX() {return img.getWidth(this);}
		public int getpaintY() {return img.getHeight(this);}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 20, 20, this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx1();
	}
}
