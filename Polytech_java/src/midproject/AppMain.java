package midproject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AppMain extends JFrame implements ActionListener{
	
	public AppMain() {
		setTitle("프로그램 시작");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		p1.setLayout(new GridLayout(4,1,20,2));
		p2.setLayout(new GridLayout(4,1,20,2));

		JLabel msg1 = new JLabel();
		
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		
		JComboBox cb = new JComboBox();
		
		JTextArea area = new JTextArea(10, 40);
		// 매개변수로 행과 열을 넣을 수 있음
		
		JButton b1 = new JButton("등록");
		JButton b2 = new JButton("조회");
		JButton b3 = new JButton("삭제");
		
		JLabel la1 = new JLabel("관리번호");
		JLabel la2 = new JLabel("상품명");
		JLabel la3 = new JLabel("단가");
		JLabel la4 = new JLabel("제조사");
				
		JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		p1.add(la1);
		p1.add(la2);
		p1.add(la3);
		p1.add(la4);
		
		p2.add(cb);
		p2.add(t1);
		p2.add(t2);
		p2.add(t3);
		
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		
		add(msg1, BorderLayout.PAGE_START);
		add(p1, BorderLayout.LINE_START);
		add(p2, BorderLayout.CENTER);
		add(scroll, BorderLayout.LINE_END);
		add(p3, BorderLayout.PAGE_END);
		
		setSize(1000, 500);
		setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		AppMain app = new AppMain();
	}


}
