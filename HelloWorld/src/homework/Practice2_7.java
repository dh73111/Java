package homework;

import java.util.Scanner;

public class Practice2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		
		int x=0,y=0;
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x>100 && x<200 && y>100 && y<200)
				System.out.println("("+x+","+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
		
		else 
			System.out.println("("+x+","+y+")�� �簢�� �ȿ� ���� �ʽ��ϴ�.");
		
		System.out.println("===================");
		System.out.println(" �й� : 2015041057   ");
		System.out.println(" �̸� :   ���ȸ           ");
		System.out.println("===================");
	}
}
