import javax.swing.*;
import java.awt.*;

public class MenuEx extends JFrame{
	public MenuEx() {
		super("메뉴 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		setSize(300, 250); setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu LookMenu = new JMenu("Screen");
		
		LookMenu.add(new JMenuItem("화면확대"));
		LookMenu.addSeparator();
		LookMenu.add(new JMenuItem("쪽윤관"));
		
		mb.add(new JMenu("파일"));
		mb.add(new JMenu("편집"));
		mb.add(LookMenu);
		mb.add(new JMenu("입력"));
		
		setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		new MenuEx();
	}
}
