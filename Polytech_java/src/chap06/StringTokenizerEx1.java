package chap06;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
//		String data = "홍길동,010-1234-5678,서울시,학생";
//		StringTokenizer st = new StringTokenizer(data, ",");
//		System.out.println("Token의 수 : " + st.countTokens() + "개");
//		
//		while(st.hasMoreTokens()) { // hasMoreTokens가 false일 때(더 이상 token이 없을 떄)
//			System.out.println("아룸 : " +st.nextToken());
//			System.out.println("전화 : " +st.nextToken());
//			System.out.println("주소 : " +st.nextToken());
//			System.out.println("직업 : " +st.nextToken());
//		}

		String data = "홍길동,남,65,170/김세영,여,57,164/이장군,남,80,190/김명수,남,77,167/홍미용,여,64,165";
		StringTokenizer st = new StringTokenizer(data, "/");
		// System.out.println("Token의 수 : " + st.countTokens() + "개");

		while (st.hasMoreTokens()) {
			StringTokenizer st1 = new StringTokenizer(st.nextToken(), ",");
			int sum = 0;
			int count = 0;
			while (st1.hasMoreTokens()) {
				if(st1.nextToken().equals("남")) {
					count++;
					sum += Integer.parseInt(st1.nextToken());
				}

				}
			}
	
		//System.out.println("남자들의 평균 체중 : " + ((double)sum/count));
		}

	}


