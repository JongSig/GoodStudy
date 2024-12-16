import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PieChart extends JFrame {
	
	JLabel Fruit[] = new JLabel[4];
	JTextField TextFruit[] = new JTextField[4];
	JLabel Persant[] = new JLabel[4];
	String Fruits[] = {"apple", "cherry", "strawberry", "prune"};
	int Num[] = new int[4];
	int SUM = 0;
	
	public PieChart() {
		super("Open Challenge11");
		Container c = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.setLayout(new BorderLayout());
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		
		setSize(1000, 600);
		setVisible(true);
	}
	
	class NorthPanel extends JPanel {
		
		public NorthPanel() {
			setBackground(Color.GRAY);
			
			for(int i=0; i<4; i++) {
				Fruit[i] = new JLabel("apple");
				TextFruit[i] = new JTextField(7);
				TextFruit[i].setText("0");
			}
			
			MyKeyListener keyListener = new MyKeyListener();
			for(int i=0; i<4; i++) {
				TextFruit[i].addKeyListener(keyListener);
				add(Fruit[i]);
				add(TextFruit[i]);
			}
		}
	}
	
	class CenterPanel extends JPanel {
		
		public CenterPanel() {
			
			for(int i=0; i<4; i++) {
				Persant[i] = new JLabel(Fruits[i] + Math.round((double)Num[i]/SUM*100) + "%        ");
				add(Persant[i]);
			}
			
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			int start = 0;
			Color[] colors = {Color.RED,Color.BLUE,Color.GREEN,Color.MAGENTA};
			for(int i = 0; i< Num.length; i++) {	
				int angle = (int) Math.round((double) Num[i] / SUM * 360);
				g.setColor(colors[i]);
				g.fillArc(275, 75, 400, 400, start, angle);
				start += angle;
			}
		}
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() == '\n') {
				for(int i=0; i<4; i++)
					Num[i] = Integer.parseInt(TextFruit[i].getText());
				
				SUM = Num[0] +  Num[1] +  Num[2] + Num[3];
				
				for(int i = 0; i<4; i++) {
					Persant[i].setText(Fruit[i].getText() + " " + Math.round((double) Num[i] / SUM * 100) + "%");
				}
				
				repaint();
			}
				
		}
	}
	
	
	public static void main(String[] args) {
		new PieChart();
	}
}
