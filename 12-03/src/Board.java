import java.awt.*;
import javax.swing.*;

public class Board extends JFrame{
	public Board() {
		setTitle("걸어서 나..");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(new WalkingLabel("나는 당신을 사랑합니다."));
		
		setSize(300, 200);
		setVisible(true);
	}
	
	private class WalkingLabel extends JLabel implements Runnable{
		private String text;
		private int count = 1;
		
		public WalkingLabel(String str) {
			this.text = str;
			new Thread(this).start();
		}
		
		
		public void run() {
			while(true) {
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) { return; }
				
				String s = text.substring(0, count);
				setText(s);
				
				count %= text.length();
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		new Board();
	}
}
