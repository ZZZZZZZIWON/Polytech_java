package midprojectB;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

// ���� ���α׷�, JFrame �� ��ӹް� ��ü������ ActionListener �� �����ؼ� �̺�Ʈ ó��
public class AppMain extends JFrame implements ActionListener{
	
	// ȭ�� ������ ���� �г� ����
	JPanel p1 = new JPanel(); // �ؽ�Ʈ �� �г�
	JPanel p2 = new JPanel(); // �Է� ��� �г�
	JPanel p3 = new JPanel(); // ������ ��� �г�
	
	// �޽��� ����� ���� ��
	JLabel ml = new JLabel();
	
	// �Է¾�Ŀ� ���� �ؽ�Ʈ �ʵ�
    JTextField t1 = new JTextField(20);
	JTextField t2 = new JTextField(20);
	JTextField t3 = new JTextField(20);

	// ���� �ڵ� ������ ���� �޺��ڽ�
	JComboBox cb;
	
	// ������ ����� ���� �ؽ�Ʈ����
	JTextArea ta;
	
	// �޴� ��ư
	JButton b1 = new JButton("���");
	JButton b2 = new JButton("��ȸ");
	JButton b3 = new JButton("����");
    
   	// �����ͺ��̽� ���� Ŭ���� �ν��Ͻ� ����
	ProductDAO dao = new ProductDAO();
	
	// ��ǰ���� ����� ���� ��ǰ �ν��Ͻ� ����
	Product product;
	
	// ��ü ��ǰ��� ����� ���� ArrayList ����
	ArrayList<Product> datas = new ArrayList<Product>();
	
	String msg = "## �޽���: ";
	boolean editmode;
	
	// ���� UI ���� �޼���
	public void startUI() {
		ml.setText(msg+" ���α׷��� ���� �Ǿ����ϴ�.!!");
		ml.setEnabled(false);

		// ��� ��ġ�� ���� �г� ���̾ƿ� ����
		p1.setLayout(new GridLayout(4,1,20,2));
		p2.setLayout(new GridLayout(4,1,20,2));
		
		// ��Ŀ� ���� �� ����
		JLabel l1 = new JLabel("������ȣ");
		JLabel l2 = new JLabel("��ǰ��");
		JLabel l3 = new JLabel("�� ��");
		JLabel l4 = new JLabel("������");

		// ��Ŀ� ���� �޺��ڽ��� �ؽ�Ʈ ���� �ʱ�ȭ
		cb = new JComboBox();		
		ta = new JTextArea(10,40);
		JScrollPane scroll = new JScrollPane (ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		// ȭ�� ������ ����
		refreshData();

		// �̺�Ʈ ������ ���
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		// �гο� ������Ʈ �߰�
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);

		p2.add(cb);
		p2.add(t1);
		p2.add(t2);
		p2.add(t3);

		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		
		// ���� �����ӿ� �г� �� ������Ʈ ��ġ
		add(ml,BorderLayout.PAGE_START);
		add(p1,BorderLayout.LINE_START);
		add(p2,BorderLayout.CENTER);
		add(scroll,BorderLayout.LINE_END);
		add(p3,BorderLayout.PAGE_END);
		
		setResizable(false);
		setVisible(true);
	}
	
	// ��ü ������ ��� ��� �� ���� �޼���
	public void refreshData() {
		ta.setText("");
		clearField();
		editmode=false;
		
		ta.append("������ȣ\t��ǰ��\t\t�ܰ�\t������\n");
		datas = dao.getAll();
		
		// �����ͺ���� �޺��ڽ� ������ ����
		cb.setModel(new DefaultComboBoxModel(dao.getItems()));
		
		if(datas != null) {
			// ArrayList �� ��ü �����͸� ���Ŀ� ���� ���
			for(Product p : datas) {
				StringBuffer sb = new StringBuffer();
				sb.append(p.getPcode()+"\t");
				sb.append(p.getPname()+"\t\t");
				sb.append(p.getPrice()+"\t");
				sb.append(p.getManufacture()+"\n");
				ta.append(sb.toString());
			}
		}
		else {
			ta.append("��ϵ� ��ǰ�� �����ϴ�. !!\n��ǰ�� ����� �ּ��� !!");	
		}
	}
	
	// ������, ������ �ʱ�ȭ
	public AppMain() {
		super("Product Manager Application V1.0");
		setLayout(new BorderLayout(20,20));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,300);
	}
	
	// ���, ����, ��ü ��� ��ȸ�� �ʵ� �ʱ�ȭ
	public void clearField() {
		t1.setText("");
		t2.setText("");
		t3.setText("");
	}
	
	// �̺�Ʈ �߻� ó�� �޼���
    public void actionPerformed(ActionEvent e) {
    	Object obj = e.getSource();
    	// ��� ��ư�� ���, ��ϰ� ������ ���ؼ� ó����.
    	if(obj == b1) {
    		product = new Product();
    		product.setPname(t1.getText());
    		product.setPrice(Integer.parseInt(t2.getText()));
    		product.setManufacture(t3.getText());
    		
    		// ������ ���
    		if(editmode == true) {
    			product.setPcode(Integer.parseInt((String)cb.getSelectedItem()));
    			if(dao.updateProduct(product)) {
    	   			ml.setText(msg+"��ǰ�� �����߽��ϴ�.!!");
        			clearField();
        			editmode = false;
    			}
        		else
        			ml.setText(msg+"��ǰ ������ ���� �߽��ϴ�.!!");
    		}
    		// ����� ���
    		else {
	    		if(dao.newProduct(product)) {
	    			ml.setText(msg+"��ǰ�� ����߽��ϴ�.!!");
	    		}
	    		else
	    			ml.setText(msg+"��ǰ ����� ���� �߽��ϴ�.!!");
	    	}
        	// ȭ�� ������ ����
        	refreshData();
    	}
    	// ��ȸ ��ư�� ���
    	else if(obj == b2) {
    		String s = (String)cb.getSelectedItem();
    		if(!s.equals("��ü")) {
        		product = dao.getProduct(Integer.parseInt(s));
        		if(product != null) {
         			ml.setText(msg+"��ǰ������ �����Խ��ϴ�.!!");
            		t1.setText(product.getPname());
            		t2.setText(String.valueOf(product.getPrice()));
            		t3.setText(product.getManufacture());
            		//cb.setSelectedIndex(anIndex);
            		editmode = true;
        		}
        		else {
         			ml.setText(msg+"��ǰ�� �˻����� �ʾҽ��ϴ�.!!");    			
        		}	    			
    		}
    		else {
	        	// ȭ�� ������ ����
	        	refreshData();
    		}
    	}
    	// ���� ��ư�� ���
    	else if(obj == b3) {
    		String s = (String)cb.getSelectedItem();
    		if(s.equals("��ü")) {
     			ml.setText(msg+"��ü ������ ���� �ʽ��ϴ�.!!");    			
    		}
    		else {
        		if(dao.delProduct(Integer.parseInt(s))) {
         			ml.setText(msg+"��ǰ�� �����Ǿ����ϴ�.!!");
        		}
        		else {
         			ml.setText(msg+"��ǰ�� �������� �ʾҽ��ϴ�.!!");    			    			    			
        		}    			
    		}
        	// ȭ�� ������ ����
        	refreshData();
    	}
    }
	
	public static void main(String[] args) {
		AppMain pm = new AppMain();
		pm.startUI();
	}
}