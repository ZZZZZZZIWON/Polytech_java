package midproject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AppMain extends JFrame implements ActionListener{
	
	public AppMain() {
		setTitle("���α׷� ����");
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
		// �Ű������� ��� ���� ���� �� ����
		
		JButton b1 = new JButton("���");
		JButton b2 = new JButton("��ȸ");
		JButton b3 = new JButton("����");
		
		JLabel la1 = new JLabel("������ȣ");
		JLabel la2 = new JLabel("��ǰ��");
		JLabel la3 = new JLabel("�ܰ�");
		JLabel la4 = new JLabel("������");
				
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
