package homework;

import java.util.Scanner;
public class Practice2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		double r = sc.nextDouble();
		System.out.print("�� �Է�>>");
		double a=sc.nextInt();
		double b=sc.nextInt();
		if((x-a)*(x-a)+(y-b)*(y-b)<r*r)
		{
			System.out.println("�� ("+a+","+b+")�� �� �ȿ� �ִ�");
		}
		else
      	    System.out.println("�� �ȿ� �������� �ʽ��ϴ�.");
		
	 	System.out.println("===================");
		System.out.println("| �й� : 2015041057 |");
		System.out.println("| �̸� :    ���ȸ         |");
		System.out.println("===================");
			
	}
}
