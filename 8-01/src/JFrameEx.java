import javax.swing.*;

public class JFrameEx extends JFrame{
	public JFrameEx() {
		super("Let's study Java");
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameEx();
	}
}
