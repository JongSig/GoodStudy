import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Heroes extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ImageIcon[] IconHeroes = new ImageIcon[4];
	public JLabel label;
	public int num = 0;
	
	public Heroes() {
		setTitle("Open Challenge 10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		IconHeroes[0] = new ImageIcon("images/SpiderMan.gif");
		IconHeroes[1] = new ImageIcon("images/Batman.gif");
		IconHeroes[2] = new ImageIcon("images/Superman.gif");
		IconHeroes[3] = new ImageIcon("images/WonderWoman.gif");

		
		label = new JLabel(IconHeroes[num]);
		c.add(label, BorderLayout.CENTER);
		c.add(new ArrowPanel(), BorderLayout.SOUTH);
		
		
		
		//JPanel panal = new JPanel();

		
		//c.add(panal, SwingConstants.SOUTH);
		
		setSize(500, 700);
		setVisible(true);
	}
	
	class ArrowPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public ArrowPanel() {
			ImageIcon LeftIcon = new ImageIcon("images/LeftIcon.gif");
			ImageIcon RightIcon = new ImageIcon("images/RightIcon.gif");
			JButton Left = new JButton(LeftIcon);
			JButton Right = new JButton(RightIcon);
			add(Left);
			add(Right);
			
			Left.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					num --;
					num += IconHeroes.length;
					num %= IconHeroes.length;
					label.setIcon(IconHeroes[num]);
				}
			});
			
			Right.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					num ++;
					num %= IconHeroes.length;
					label.setIcon(IconHeroes[num]);
				}
			});
		}
	}
	
	
	public static void main(String[] args) {
		new Heroes();
	}
}