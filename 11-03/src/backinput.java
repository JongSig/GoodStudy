import java.awt.*;
import javax.swing.*;

public class backinput extends JFrame{
	public backinput() {
		setTitle("두 이미지 나란히");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyJPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new backinput();
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
			g.drawImage(img[0], 0, 0, getWidth()/2, getHeight(), this);
			g.drawImage(img[1], getWidth()/2, 0, getWidth(), getHeight(), this);
		}
	}
}
