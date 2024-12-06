import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;

public class saveFile extends JFrame{
	private JMenuBar mb = new JMenuBar();
	private JMenu file = new JMenu("파일");
	private JMenuItem save = new JMenuItem("저장");
	private JTextArea ta = new JTextArea();
	
	public saveFile() {
		super("파일 저장");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,1));
		
		MyActionListener listener = new MyActionListener();
		
		file.add(save);
		mb.add(file);
		
		save.addActionListener(listener);
		
		setJMenuBar(mb);
		c.add(new JScrollPane(ta));
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(ta.getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "파일을 저장할 수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE);
				return;
			}
			String fileName = JOptionPane.showInputDialog("저장할 파일명을 입력하세요.");
			if(fileName == null) {
				JOptionPane.showMessageDialog(null, "바보세요?", "기분나빠..", JOptionPane.WARNING_MESSAGE);
			}
			
			try {
				FileWriter fout = new FileWriter(fileName);
				String t = ta.getText();
				StringTokenizer st = new StringTokenizer(ta.getText(), "\n");
				
				while(st.hasMoreTokens()) {
					fout.write(st.nextToken());
					fout.write("\r\n");
				}
				fout.close();
			}catch(IOException e1) {}
		}
	}
	
	public static void main(String[] args) {
		new saveFile();
	}
}
