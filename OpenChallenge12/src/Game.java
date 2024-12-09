import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JFrame{
	
	public Game() {
		super("Open Challenge 12");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new GamePanel());
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	class GamePanel extends JPanel{
		private String avatarChar = "@";
		private String monsterChar = "M";
		private char quitChar = 'q';
		private long monsterDelay = 200;
		private JLabel avatar = new JLabel(avatarChar);
		private JLabel monster = new JLabel(monsterChar);
		private static final int AVATAR_MOVE = 10;
		
		public GamePanel() {
			setLayout(null);
			addKeyListener(new MyKeyListener());
			
			avatar.setLocation(50, 150);
			avatar.setSize(15, 15);
			avatar.setForeground(Color.RED);
			add(avatar);
			
			monster.setLocation(200, 5);
			monster.setSize(15, 15);
			add(monster);
			
			setFocusable(true);
			requestFocus();
			
			MonsterThread th = new MonsterThread(monster, avatar, monsterDelay);
			th.start();
		}
		
		class MyKeyListener extends KeyAdapter{
			@Override
			public void keyPressed (KeyEvent e) {
				if(e.getKeyChar() == quitChar)
					System.exit(0);
				
				int key = e.getKeyCode();
				
				switch(key) {
				case KeyEvent.VK_UP:
					avatar.setLocation(avatar.getX(), avatar.getY()-AVATAR_MOVE);
					break;
				case KeyEvent.VK_DOWN:
					avatar.setLocation(avatar.getX(), avatar.getY()+AVATAR_MOVE);
					break;
				case KeyEvent.VK_LEFT:
					avatar.setLocation(avatar.getX()-AVATAR_MOVE, avatar.getY());
					break;
				case KeyEvent.VK_RIGHT:
					avatar.setLocation(avatar.getX()+AVATAR_MOVE, avatar.getY());
					break;
				}
				
				avatar.getParent().repaint();
			}
		}
		
		class MonsterThread extends Thread{
			private JLabel from;
			private JLabel to;
			private long monsterDelay;
			private static final int MONSTER_MOVE = 5;
			
			public MonsterThread(JLabel from, JLabel to, long monsterDelay) {
				this.from = from;
				this.to = to;
				this.monsterDelay = monsterDelay;
			}
			
			public void run() {
				int x = from.getX(), y = from.getY();
				
				while(true) {
					if(to.getX() < from.getX())
						x = from.getX() - MONSTER_MOVE;
					else
						x = from.getX() + MONSTER_MOVE;
					if(to.getY() < from.getY())
						y = from.getY() - MONSTER_MOVE;
					else
						y = from.getY() + MONSTER_MOVE;
					
					from.setLocation(x, y);
					
					from.getParent().repaint();
					
					try {
						sleep(monsterDelay);
					}catch(InterruptedException e) {
						return;
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Game();
	}
}
