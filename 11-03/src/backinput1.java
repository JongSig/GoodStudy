import java.awt.*;
import javax.swing.*;

public class backinput1 extends JFrame{
	public backinput1() {
		setTitle("두 이미지 나란히");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyJPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new backinput1();
	}
	
	class MyJPanel extends JPanel{
		private ImageIcon icon[] = new ImageIcon[2];
		private Image img[] = new Image[2];
		
		@Override
		public void paintComponent(Graphics g) {
			
			for(int i=0; i<2; i++) {
				icon[i] = new ImageIcon("images/back" + i + ".jpg");
				img[i] = icon[i].getImage();
			}
			g.drawImage(img[0], 0, 0, getWidth(), getHeight()/2, this);
			g.drawImage(img[1], 0, getHeight()/2, getWidth(), getHeight(), this);
		}
	}
}