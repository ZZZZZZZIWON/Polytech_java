package midproject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AppMain_2 extends JFrame implements ActionListener {
	JButton b1;
	JButton b2;
	JButton b3;

	JTextField t1;
	JTextField t2;
	JTextField t3;

	JTextArea area;
	
	JComboBox cb;
	public AppMain_2() {
		setTitle("���α׷� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		p1.setLayout(new GridLayout(4, 1, 20, 2));
		p2.setLayout(new GridLayout(4, 1, 20, 2));

		JLabel msg1 = new JLabel();

		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();

		area = new JTextArea(10, 40);
		
		cb = new JComboBox();

		// �Ű������� ��� ���� ���� �� ����

		b1 = new JButton("���");
		b2 = new JButton("��ȸ");
		b3 = new JButton("����");

		b1.addActionListener(this);

		JLabel la1 = new JLabel("������ȣ");
		JLabel la2 = new JLabel("��ǰ��");
		JLabel la3 = new JLabel("�ܰ�");
		JLabel la4 = new JLabel("������");

		JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

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
		Product product = new Product();
		ProductDAO dao = new ProductDAO();

		if (e.getSource() == b1) {
			// b1(���)��ư -> Product��ü ���� -> pname, price, manufacture ����ϱ�
			// textField���� �Է¹��� ���� String type�̱� ������ price���� ���������� ��ȯ �ʿ�

			product.setPname(t1.getText());
			product.setPrice(Integer.parseInt(t2.getText()));
			product.setManufacture(t3.getText());

			// ProductDAO ��ü�� ���� -> insertProd �����ϱ�
			boolean success = dao.insertProd(product);

			if (success) {
				area.setText("��� ����");
			} else
				area.setText("��� ����");
		}

		else if (e.getSource() == b2) {
			

		}

		else if (e.getSource() == b3) {
			// b3(����)��ư�� ->
			
		}

	}

	public static void main(String[] args) {
		AppMain_2 app = new AppMain_2();

	}

}
