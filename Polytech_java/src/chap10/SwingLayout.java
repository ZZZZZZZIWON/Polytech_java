package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class SwingLayout extends JFrame {
	
	JButton button1 = new JButton("��ư1");
	JButton button2 = new JButton("��ư2");
	JButton button3 = new JButton("��ư3");
	JButton button4 = new JButton("��ư4");
	JButton button5 = new JButton("��ư5");
	
	Panel panel1 = new Panel();
	Panel panel2 = new Panel();
	Panel panel3 = new Panel();
	
	public SwingLayout() {
		setTitle("���� ���̾ƿ� �����ϱ�");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		Container container = getContentPane();
		
		// container�� panel�� ������Ű��
//		container.add(panel1);
	
//		flowLayout();
//		gridLayout();
//		borderLayout();
		cardLayout();
		
		setSize(300, 200);
		setVisible(true);
		
	}
	// FlowLayout �����ϱ�
	public void flowLayout() {
		panel1.setLayout(new FlowLayout());
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);
	}
	
	public void gridLayout() {
		panel1.setLayout(new GridLayout(2,2));
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
	}
	
	public void borderLayout() {
		panel1.setLayout(new BorderLayout());
		panel1.add(button1, BorderLayout.NORTH);
		panel1.add(button2, BorderLayout.WEST);
		panel1.add(button3, BorderLayout.CENTER);
		panel1.add(button4, BorderLayout.EAST);
		panel1.add(button5, BorderLayout.SOUTH);
	}
	
	// �̺�Ʈ �ڵ鷯 �ޱ�
	public void cardLayout() {
		final CardLayout card = new CardLayout();
		setLayout(card);
		
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel2.add(button4);
		panel3.add(button5);
	
		//JFrame�� add��Ű��
		add("panel1", panel1);
		add("panel2", panel2);
		add("panel3", panel3);
		
		// �̺�Ʈ �ڵ鷯 �ޱ� (�̺�Ʈ ����, �ڵ鷯 �ٴ� ���)
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(getContentPane());
			}
		});
		
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(getContentPane());
			}
		});
	
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getContentPane(), "panel1");
			}
		});
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				if(btn.getText().equals("��ư1")) {
					btn.setText("Action");
				} else if(btn.getText().equals("Action"))
					btn.setText("��ư1");
			}
		});
		
//		button2.addActionListener(new MyActionListener());
		button2.addMouseListener(new myMouseAdapter());
	}

	public static void main(String[] args) {
		
		SwingLayout layout = new SwingLayout();
	}

	
	// button2�� ���콺�� ������ ���콺�� ������ ��ǥ ȣ�� -> ��ư�� ���
	// MouseAdapter Ȱ��
	class myMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			JButton btn = (JButton) e.getSource();
			int x = e.getX();
			int y = e.getY();
			if(btn.getText().equals("��ư2")) {
				btn.setText("("+ x + "," + y +")");
			} else 
				btn.setText("��ư2");
		}
		
	}
	
	
//	class MyActionListener implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			JButton btn = (JButton) e.getSource();
//			if(btn.getText().equals("��ư2")) {
//				btn.setText("Pushed");
//			} else if(btn.getText().equals("Pushed"))
//				btn.setText("��ư2");
//		}
//		
//	}

}









