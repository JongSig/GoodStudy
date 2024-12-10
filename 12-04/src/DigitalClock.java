import java.awt.*;
import javax.swing.*;
import java.util.Calendar;

public class DigitalClock extends JFrame{
	public DigitalClock() {
		setTitle("디지털 시계");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 1));
		
		c.add(new CalendarLabel());
		
		setSize(340, 180);
		setVisible(true);
	}
	
	private class CalendarLabel extends JLabel implements Runnable{
		private String clockText;
		
		public CalendarLabel() {
			setFont(new Font("Arial", Font.ITALIC, 80));
			new Thread(this).start();
		}
		
		public void run() {
			
			while(true) {
				
				Calendar c = Calendar.getInstance();
				int hour = c.get(Calendar.HOUR_OF_DAY);
				int min = c.get(Calendar.MINUTE);
				int second = c.get(Calendar.SECOND);
				clockText = Integer.toString(hour);
				clockText = clockText.concat(":");
				clockText = clockText.concat(Integer.toString(min));
				clockText = clockText.concat(":");
				clockText = clockText.concat(Integer.toString(second));
				
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) { return; }
				
				
				setText(clockText);
			}
			
		}
	}
	
	public static void main(String[] args) {
		new DigitalClock();
	}
}
