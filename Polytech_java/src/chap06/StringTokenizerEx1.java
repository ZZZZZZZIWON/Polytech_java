package chap06;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
//		String data = "ȫ�浿,010-1234-5678,�����,�л�";
//		StringTokenizer st = new StringTokenizer(data, ",");
//		System.out.println("Token�� �� : " + st.countTokens() + "��");
//		
//		while(st.hasMoreTokens()) { // hasMoreTokens�� false�� ��(�� �̻� token�� ���� ��)
//			System.out.println("�Ʒ� : " +st.nextToken());
//			System.out.println("��ȭ : " +st.nextToken());
//			System.out.println("�ּ� : " +st.nextToken());
//			System.out.println("���� : " +st.nextToken());
//		}

		String data = "ȫ�浿,��,65,170/�輼��,��,57,164/���屺,��,80,190/����,��,77,167/ȫ�̿�,��,64,165";
		StringTokenizer st = new StringTokenizer(data, "/");
		// System.out.println("Token�� �� : " + st.countTokens() + "��");

		while (st.hasMoreTokens()) {
			StringTokenizer st1 = new StringTokenizer(st.nextToken(), ",");
			int sum = 0;
			int count = 0;
			while (st1.hasMoreTokens()) {
				if(st1.nextToken().equals("��")) {
					count++;
					sum += Integer.parseInt(st1.nextToken());
				}

				}
			}
	
		//System.out.println("���ڵ��� ��� ü�� : " + ((double)sum/count));
		}

	}


