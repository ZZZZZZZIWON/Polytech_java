package chap03;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};
		
		
		//선택정렬=================================================
		System.out.print("정렬 전 : ");
		for(int iu : iu_height)
			System.out.print(iu + " ");
		System.out.println();
		
		//3. 단계별로 반복하기
		for(int i = 0; i < 7; i++)
		{
			//1. 최소값 알고리즘
			int min = iu_height[i];
			int min_index = i; //min이 들어있는 배열의 index번호
			
			for(int j=i+1; j<8; j++) {
				if(min > iu_height[j]) {
					min = iu_height[j];
				    min_index = j;
				}
			}
		
			//2. 교환 알고리즘
			int temp = iu_height[min_index];
			iu_height[min_index] = iu_height[i];
			iu_height[i] = temp;
		
		}	
		
		System.out.print("정렬 후 : ");
		for(int iu : iu_height)
			System.out.print(iu + " ");
		System.out.println();
		//선택정렬=================================================

		//탐색 알고리즘 
		Scanner scan = new Scanner(System.in);
		System.out.print("검색 키값 : ");
		int key = scan.nextInt();
		int key_index = -1; //검색된 값의 인덱스값, -1은실패로 가정
		
		// 순차탐색 (Sequential Search)
		System.out.println("순차탐색 =====================================");
		for(int i = 0; i <8; i++) 
			if(iu_height[i] == key)
				key_index = i;
		
		if(key_index == -1)
			System.out.println("검색 실패!");
		else
			System.out.println("검색 성공! " + key_index + "번 방에 있습니다.");

		
		// 이진탐색 (Binary Search)
		System.out.println("이진탐색 =====================================");
		int low = 0, high = 7; //low, high 초기화
		int middle = 0;        //중간 방의 인덱스
		
		System.out.print("검색 키값 : ");
		key = scan.nextInt();
		key_index = -1; //중복돼서 데이터타입 지우고, 위에서 값이 변경돼서 다시 초기화
		
		while(low<=high)
		{
			middle = (low + high) / 2;
			System.out.println("[low] " + low + "[high] " + high + 
					"[middle] "+ middle +"[value] " + iu_height[middle]);
			if(key == iu_height[middle]) {
				key_index = middle;
				break;
			}
			else if(key > iu_height[middle])
				low = middle + 1;
			else if(key < iu_height[middle])
				high = middle - 1;
		}
		
		if(key_index == -1)
			System.out.println("검색 실패!");
		else
			System.out.println("검색 성공! " + key_index + "번 방에 있습니다.");
			 
	}

}
