package midproject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AppMain extends JFrame implements ActionListener{
	// ȭ�� ������ ���� �г� 
	JPanel p1 = new JPanel(); //�ؽ�Ʈ �� �г�
	JPanel p2 = new JPanel(); //�Է� ��� �г� 
	JPanel p3 = new JPanel(); //������ ��� �г� (��ư)
	
	// �ؽ�Ʈ �󺧺� 
	JLabel msg1 = new JLabel();
	
	// �Է� ��Ŀ� ���� �ؽ�Ʈ �ʵ� 
	JTextField t1 = new JTextField(20); //��ǰ��
	JTextField t2 = new JTextField(20); //�ܰ�
	JTextField t3 = new JTextField(20); //������
	
	// ���� �ڵ尡 �� �޺��ڽ�
	JComboBox cb;
	
	// ����������� ���� �ؽ�Ʈ ����
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
	
	// editmode ���� (false : ���/��ȸ/���� �ȵǰ�)
	boolean editmode;
	
	// ProductDAO �� ���� ��ü ���� 
	ProductDAO dao = new ProductDAO();
	ArrayList<Product> datas = new ArrayList<Product>();
	Product product; 
	
	// refreshData : �ʱ� ȭ���� ����
	public void refreshData() {
		// ������ ������ ��� ����� �ʱ�ȭ
		area.setText("");
		t1.setText("");
		t2.setText("");
		t3.setText("");		

		// editmode : true - ��������, ����, ��ü��� ��ȸ�� ������ ���� 
		// editmode : false - ��������, ����, ��ü��� ��ȸ�� �ȵǴ� ����
		editmode = false;
		
		// �޺��ڽ��� items �� �־��ִ� ��
		cb.setModel(new DefaultComboBoxModel(dao.getItems()));
		
		// textfield �� ������ ��� ��� ���� 
		datas = dao.getAll();
		area.append("������ȣ \t ��ǰ�� \t �ܰ� \t ������ \n");
		if(datas != null) 	{
			for(Product p : datas) {
				StringBuffer sb = new StringBuffer();
				sb.append(p.getPcode() + " \t ");
				sb.append(p.getPname() + " \t ");
				sb.append(p.getPrice() + " \t ");
				sb.append(p.getManufacture() + " \t ");
				area.append(sb.toString());
			}
		}
		else{
			area.append("��ϵ� ��ǰ�� �����ϴ�! ��ǰ�� ���� ������ּ���.");
		}
	}

	// �̺�Ʈ �߻� ó�� �޼���
	// actionPerformed �������̵� 
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		//��ϱ��
		if(obj==b1) {
			product = new Product();
			product.setPname(t1.getText()); 					//��ǰ��
			product.setPrice(Integer.parseInt(t2.getText())); 	//�ܰ�
			product.setManufacture(t3.getText()); 				//������
			
			//����� ��� 
			if(editmode == false) {
				if(dao.insertProd(product)) 
					msg1.setText("��ǰ�� ��ϵǾ����ϴ�.");
				else 
					msg1.setText("��ǰ����� �����߽��ϴ�.");
			}
			//������ ���
			else if (editmode == true) {
				product.setPcode(Integer.parseInt((String)cb.getSelectedItem()));
				if(dao.updateProd(product)) { 
					msg1.setText("��ǰ�� �����Ǿ����ϴ�.");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					editmode = false;  //���� �Ұ� ���� ���� 					
				}
				else 
					msg1.setText("��ǰ������ �����߽��ϴ�.");
			}			
		}
		//��ȸ���
		if(obj==b2) {
			String item = (String)cb.getSelectedItem();
			if(item.equals("��ü")) {
				refreshData(); //ȭ���� �ʱ�ȭ�Ͽ� ����
			}
			else
			{
				product = dao.getOne(Integer.parseInt(item));
				if(product != null) {
					t1.setText(product.getPname());
					t2.setText(String.valueOf(product.getPrice()));
					t3.setText(product.getManufacture());
					editmode = true; //�������� ���� ����
				}else {
					msg1.setText("��ȸ�� ���� �ʽ��ϴ�.");
				}
			}
		}
		//�������
		if(obj==b3) {
			String item = (String)cb.getSelectedItem();
			if(item.equals("��ü")) {
				msg1.setText("��ü������ ���� �ʽ��ϴ�.");
			}
			else {
				if(dao.deleteProd(Integer.parseInt(item))) {
					msg1.setText("������ �Ǿ����ϴ�");
				}
				else {
					msg1.setText("������ ���� �ʾҽ��ϴ�.");
				}
			}
			refreshData(); //ȭ�� ����
		}
		}
	
	public void AppMain(){
		setTitle("���α׷��� ���۵Ǿ����ϴ�.");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		msg1.setText("���α׷��� ���۵Ǿ����ϴ�.");
		
		// ���̾ƿ� ��ġ 
		p1.setLayout(new GridLayout(4, 1, 20, 2));
		p2.setLayout(new GridLayout(4, 1, 20, 2));
		
		// ��ũ�� ����� ������ area �� ����
		JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		cb = new JComboBox();
		
		// refreshData �޼ҵ� ȣ��
		
		// ������ ���(b1),��ȸ(b2),����(b3) ��ư�� �̺�Ʈ ������ �߰�
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
		
		setSize(700,300);
//		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		AppMainM app = new AppMainM();
		app.refreshData();
	}

}