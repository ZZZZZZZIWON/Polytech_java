package midproject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AppMainM extends JFrame implements ActionListener {

	// ȭ�� ������ ���� �г�
	JPanel p1 = new JPanel(); // �ؽ�Ʈ �� �г�
	JPanel p2 = new JPanel(); // �Է� ��� �г�
	JPanel p3 = new JPanel(); // ������ ��� �г�

	// �ؽ�Ʈ ��
	JLabel msg1 = new JLabel();

	// �Է� ��Ŀ� ���� �ؽ�Ʈ �ʵ�
	JTextField t1 = new JTextField(20);
	JTextField t2 = new JTextField(20);
	JTextField t3 = new JTextField(20);

	// ���� �ڵ尡 �� �޺� �ڽ�
	JComboBox cb;

	// ������ ����� ���� �ؽ�Ʈ ����
	JTextArea area = new JTextArea(10, 40);

	// ���, ��ȸ, ���� �޴� ��ư
	JButton b1 = new JButton("���");
	JButton b2 = new JButton("��ȸ");
	JButton b3 = new JButton("����");

	// �Է� ��� ���� ��
	JLabel la1 = new JLabel("������ȣ");
	JLabel la2 = new JLabel("��ǰ��");
	JLabel la3 = new JLabel("�ܰ�");
	JLabel la4 = new JLabel("������");

	// editmode ���� (false -> ���,����,���� �Ұ�)
	boolean editmode;

	// ProductDAO�� ���� ��ü ����
	ProductDAO dao = new ProductDAO();
	ArrayList<Product> datas = new ArrayList<Product>();
	Product product;

	private static final long serialVersionUID = 1L;

	public AppMainM() {
		setTitle("��ǰ ���� ���α׷�");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		msg1.setText("���α׷��� ���۵Ǿ����ϴ�.");

		// ���̾ƿ� ��ġ
		p1.setLayout(new GridLayout(4, 1, 20, 2));
		p2.setLayout(new GridLayout(4, 1, 20, 2));

		cb = new JComboBox();
		// ��ũ�� ����� ������ area ����
		JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		// refresh �޼ҵ� ȣ��
		refreshData();
		// ������ ���(b1), ��ȸ(b2), ����(b3) ��ư�� �̺�Ʈ ������ �߰�
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

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

		setSize(700, 300);
		setVisible(true);
	}

	// refresh : �ʱ� ȭ�� ����
	public void refreshData() {

		// ������ ������ ��� ����� �ʱ�ȭ
		// textfield �ʱ�ȭ
		area.setText("");
		t1.setText("");
		t2.setText("");
		t3.setText("");

		editmode = false;


		// textfield�� ������ ��� ��� ����
		area.append("������ȣ \t ��ǰ�� \t �ܰ� \t ������ \n");
		datas = dao.getAll();
		
		// �޺��ڽ��� items �־��ֱ�
		cb.setModel(new DefaultComboBoxModel<String>(dao.getItems()));

		if (datas != null) {
			for (Product p : datas) {
				StringBuffer sb = new StringBuffer();
				sb.append(p.getPcode() + " \t ");
				sb.append(p.getPname() + " \t ");
				sb.append(p.getPrice() + " \t ");
				sb.append(p.getManufacture() + " \t ");
				area.append(sb.toString());
			}
		} else {
			area.append("��ϵ� ��ǰ�� �����ϴ�");
		}
	}

	// �̺�Ʈ �߻��� ó�� �޼ҵ�
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		// ��� ���
		if (obj == b1) {
			product = new Product();
			product.setPname(t1.getText()); // ��ǰ��
			product.setPrice(Integer.parseInt(t2.getText())); // �ܰ�
			product.setManufacture(t2.getText()); // ������

			// 1. ����� ���
			if (editmode == false) {
				if (dao.insertProd(product)) {
					msg1.setText("��ǰ�� ��ϵǾ����ϴ�");
				} else {
					msg1.setText("��ǰ����� �����߽��ϴ�");
				}
			}

			// 2. ������ ���
			else if (editmode == true) {

				product.setPcode(Integer.parseInt((String) cb.getSelectedItem()));
				if (dao.updateProd(product)) {
					msg1.setText("��ǰ�� �����Ǿ����ϴ�");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					editmode = false;
				} else {
					msg1.setText("��ǰ������ �����߽��ϴ�.");
				}
				refreshData();
			}

		}
		// ��ȸ ���
		if (obj == b2) {
			// item = �˻� ����
			String item = (String) cb.getSelectedItem();

			if (item.equals("��ü")) {
				refreshData();
			} else {
				product = dao.getOne(Integer.parseInt(item));
				if (product != null) {
					t1.setText(product.getPname());
					t2.setText(String.valueOf(product.getPrice()));
					t3.setText(product.getManufacture());
					editmode = true; // ���� ���� ���� ����
				} else {
					msg1.setText("��ȸ�� ���� �ʽ��ϴ�");
				}
			}
		}
		// ���� ���
		if (obj == b3) {
			String item=(String)cb.getSelectedItem();
			if(item.equals("��ü")) {
				msg1.setText("��ü ������ ���� �ʽ��ϴ�");
			} else {
				if(dao.deleteProd(Integer.parseInt(item))) {
					
				} else {
					msg1.setText("������ ���� �ʾҽ��ϴ�");
				}
			}
		}
	}

	public static void main(String[] args) {
		AppMainM app = new AppMainM();
		app.refreshData();
	}

}
