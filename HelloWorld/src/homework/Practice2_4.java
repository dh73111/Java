package homework;

import java.util.Scanner;

public class Practice2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[3];
		System.out.print("���� 3�� �Է�>>");
		for(int i=0 ; i<3 ; i++)
			num[i] = sc.nextInt();
		int max =0, min = num[0];
		for(int i=0 ; i<3 ; i++) {
			if(max <= num[i]) 
				max = num[i];
			if(min >= num[i])
				min = num[i];
			}
		for(int i=0 ; i<3 ; i++) {
			//if(num[i] != max && num[i] != min)
			if(max>num[i] && min<num[i]) 
				System.out.println("�߾� ���� " + num[i]);
			}
		System.out.println("===================");
		System.out.println("| �й� : 2015041057 |");
		System.out.println("| �̸� :    ���ȸ         |");
		System.out.println("===================");
		
	}
}