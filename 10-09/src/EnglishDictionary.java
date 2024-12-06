import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class EnglishDictionary extends JFrame{
	HashMap<String, String> dic = new HashMap<String, String>();
	private JTextArea ta = new JTextArea(7, 20);
	private JTextField[] tf = new JTextField[2];
	private JLabel index = new JLabel("0");
	
	public EnglishDictionary() {
		super("단어 사전 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyActionListener listener = new MyActionListener();
		
		tf[0] = new JTextField(7);
		tf[1] = new JTextField(7);
		c.add(new JLabel("영어")); c.add(tf[0]);
		c.add(new JLabel("한글")); c.add(tf[1]);
		
		JButton[] event = new JButton[2];
		event[0] = new JButton("저장");
		event[1] = new JButton("찾기");
		event[0].setBackground(Color.YELLOW);
		event[1].setBackground(Color.RED);
		event[0].addActionListener(listener);
		event[1].addActionListener(listener);
		c.add(event[0]); c.add(event[1]); c.add(index);
		c.add(new JScrollPane(ta));
		
		setSize(300, 250);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String eng = tf[0].getText();
			String kor = tf[1].getText();
			
			if(e.getActionCommand() == "저장") {
				if(eng.length()==0 || kor.length()==0) {
					return;
				}
				if(dic.get(eng) == null) {
					ta.append("삽입 (" + eng + "," + kor + ")\n");
					int c = Integer.parseInt(index.getText());
					c++;
					index.setText(Integer.toString(c));
				}else
					ta.append("변경 (" + eng + "," + kor + ")\n");
				dic.put(eng, kor);
			}
			
			if(e.getActionCommand() == "찾기") {
				if(dic.get(eng) != null) {
					tf[1].setText(dic.get(eng));
				}
			}
		}
	}


	
	public static void main(String[] args) {
		new EnglishDictionary();
	}
}
