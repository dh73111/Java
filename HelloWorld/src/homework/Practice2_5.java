package homework;

import java.util.Scanner;

public class Practice2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		
		int num[] = new int[3];
		int max =0;
		int total =0;
		for(int i=0;i<3;i++)
			num[i] = sc.nextInt();
		
		for(int i=0 ; i<3 ; i++) 
			if(max <= num[i]) 
				max = num[i];
		
		for(int i=0;i<3;i++)
			if(num[i] != max)
				total +=num[i];
		
		if(total > max)
			System.out.println("�ﰢ���� �˴ϴ�.");
		else
			System.out.println("�ﰢ���� �ƴմϴ�.");
		
		System.out.println("===================");
		System.out.println(" �й� : 2015041057   ");
		System.out.println(" �̸� :   ���ȸ           ");
		System.out.println("===================");
	}
}
