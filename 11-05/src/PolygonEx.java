import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class PolygonEx extends JFrame{
	public PolygonEx() {
		setTitle("마우스 폐다각");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyJPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PolygonEx();
	}
	
	class MyJPanel extends JPanel{
		private Vector<Integer> x = new Vector<Integer>();
		private Vector<Integer> y = new Vector<Integer>();
		
		public MyJPanel() {
			MyMouseListener listener = new MyMouseListener();
			addMouseListener(listener);
		}
		
		@Override
		public void paintComponent(Graphics g) {
			
			int xs[] = new int[x.size()];
			int ys[] = new int[y.size()];
			for(int i=0; i<x.size(); i++) {
				xs[i] = x.get(i);
				ys[i] = y.get(i);
			}
			
			g.drawPolygon(xs, ys, xs.length);
		}
		
		class MyMouseListener extends MouseAdapter{
			@Override
			public void mousePressed(MouseEvent e) {
				x.add(e.getX());
				y.add(e.getY());
				repaint();
			}
		}
	}
}
