package midprojectB;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

// 메인 프로그램, JFrame 을 상속받고 자체적으로 ActionListener 를 구현해서 이벤트 처리
public class AppMain extends JFrame implements ActionListener{
	
	// 화면 구성을 위한 패널 정의
	JPanel p1 = new JPanel(); // 텍스트 라벨 패널
	JPanel p2 = new JPanel(); // 입력 양식 패널
	JPanel p3 = new JPanel(); // 데이터 출력 패널
	
	// 메시지 출력을 위한 라벨
	JLabel ml = new JLabel();
	
	// 입력양식에 사용될 텍스트 필드
    JTextField t1 = new JTextField(20);
	JTextField t2 = new JTextField(20);
	JTextField t3 = new JTextField(20);

	// 관리 코드 선택을 위한 콤보박스
	JComboBox cb;
	
	// 데이터 출력을 위한 텍스트영역
	JTextArea ta;
	
	// 메뉴 버튼
	JButton b1 = new JButton("등록");
	JButton b2 = new JButton("조회");
	JButton b3 = new JButton("삭제");
    
   	// 데이터베이스 연동 클래스 인스턴스 생성
	ProductDAO dao = new ProductDAO();
	
	// 상품정보 출력을 위한 상품 인스턴스 생성
	Product product;
	
	// 전체 상품목록 출력을 위한 ArrayList 생성
	ArrayList<Product> datas = new ArrayList<Product>();
	
	String msg = "## 메시지: ";
	boolean editmode;
	
	// 메인 UI 실행 메서드
	public void startUI() {
		ml.setText(msg+" 프로그램이 시작 되었습니다.!!");
		ml.setEnabled(false);

		// 양식 배치를 위한 패널 레이아웃 설정
		p1.setLayout(new GridLayout(4,1,20,2));
		p2.setLayout(new GridLayout(4,1,20,2));
		
		// 양식에 사용될 라벨 설정
		JLabel l1 = new JLabel("관리번호");
		JLabel l2 = new JLabel("상품명");
		JLabel l3 = new JLabel("단 가");
		JLabel l4 = new JLabel("제조사");

		// 양식에 사용될 콤보박스와 텍스트 영역 초기화
		cb = new JComboBox();		
		ta = new JTextArea(10,40);
		JScrollPane scroll = new JScrollPane (ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		// 화면 데이터 갱신
		refreshData();

		// 이벤트 리스너 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		// 패널에 컴포넌트 추가
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
		
		// 메인 프레임에 패널 및 컴포넌트 배치
		add(ml,BorderLayout.PAGE_START);
		add(p1,BorderLayout.LINE_START);
		add(p2,BorderLayout.CENTER);
		add(scroll,BorderLayout.LINE_END);
		add(p3,BorderLayout.PAGE_END);
		
		setResizable(false);
		setVisible(true);
	}
	
	// 전체 데이터 목록 출력 및 갱신 메서드
	public void refreshData() {
		ta.setText("");
		clearField();
		editmode=false;
		
		ta.append("관리번호\t상품명\t\t단가\t제조사\n");
		datas = dao.getAll();
		
		// 데이터변경시 콤보박스 데이터 갱신
		cb.setModel(new DefaultComboBoxModel(dao.getItems()));
		
		if(datas != null) {
			// ArrayList 의 전체 데이터를 형식에 맞춰 출력
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
			ta.append("등록된 상품이 없습니다. !!\n상품을 등록해 주세요 !!");	
		}
	}
	
	// 생성자, 프레임 초기화
	public AppMain() {
		super("Product Manager Application V1.0");
		setLayout(new BorderLayout(20,20));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,300);
	}
	
	// 등록, 삭제, 전체 목록 조회시 필드 초기화
	public void clearField() {
		t1.setText("");
		t2.setText("");
		t3.setText("");
	}
	
	// 이벤트 발생 처리 메서드
    public void actionPerformed(ActionEvent e) {
    	Object obj = e.getSource();
    	// 등록 버튼인 경우, 등록과 수정을 겸해서 처리함.
    	if(obj == b1) {
    		product = new Product();
    		product.setPname(t1.getText());
    		product.setPrice(Integer.parseInt(t2.getText()));
    		product.setManufacture(t3.getText());
    		
    		// 수정인 경우
    		if(editmode == true) {
    			product.setPcode(Integer.parseInt((String)cb.getSelectedItem()));
    			if(dao.updateProduct(product)) {
    	   			ml.setText(msg+"상품을 수정했습니다.!!");
        			clearField();
        			editmode = false;
    			}
        		else
        			ml.setText(msg+"상품 수정이 실패 했습니다.!!");
    		}
    		// 등록인 경우
    		else {
	    		if(dao.newProduct(product)) {
	    			ml.setText(msg+"상품을 등록했습니다.!!");
	    		}
	    		else
	    			ml.setText(msg+"상품 등록이 실패 했습니다.!!");
	    	}
        	// 화면 데이터 갱신
        	refreshData();
    	}
    	// 조회 버튼인 경우
    	else if(obj == b2) {
    		String s = (String)cb.getSelectedItem();
    		if(!s.equals("전체")) {
        		product = dao.getProduct(Integer.parseInt(s));
        		if(product != null) {
         			ml.setText(msg+"상품정보를 가져왔습니다.!!");
            		t1.setText(product.getPname());
            		t2.setText(String.valueOf(product.getPrice()));
            		t3.setText(product.getManufacture());
            		//cb.setSelectedIndex(anIndex);
            		editmode = true;
        		}
        		else {
         			ml.setText(msg+"상품이 검색되지 않았습니다.!!");    			
        		}	    			
    		}
    		else {
	        	// 화면 데이터 갱신
	        	refreshData();
    		}
    	}
    	// 삭제 버튼인 경우
    	else if(obj == b3) {
    		String s = (String)cb.getSelectedItem();
    		if(s.equals("전체")) {
     			ml.setText(msg+"전체 삭제는 되지 않습니다.!!");    			
    		}
    		else {
        		if(dao.delProduct(Integer.parseInt(s))) {
         			ml.setText(msg+"상품이 삭제되었습니다.!!");
        		}
        		else {
         			ml.setText(msg+"상품이 삭제되지 않았습니다.!!");    			    			    			
        		}    			
    		}
        	// 화면 데이터 갱신
        	refreshData();
    	}
    }
	
	public static void main(String[] args) {
		AppMain pm = new AppMain();
		pm.startUI();
	}
}