import javax.swing.*;
import java.awt.*;



public class AutomaticShutdown extends JFrame{
	
	public AutomaticShutdown() {
		super("실행화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.YELLOW);
		setSize(300, 200);
		setVisible(true);
		Thread th = new Thread(new Shutdown());
		th.start();
	}
	
	class Shutdown extends Thread{
		public Shutdown() {
			
		}
		
		@Override
		public void run() {
			try {
				sleep(10000);
			}catch(InterruptedException e) {
				return;
			}
			setTitle("실행 종료");
			getContentPane().setBackground(Color.BLUE);
		}
	}
	
	
	public static void main(String[] args) {
		new AutomaticShutdown();
	}
}
