package homework;

import java.util.Scanner;

public class Practice2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>>");
		int num;
		num = sc.nextInt();
		if(num >=10 && num <=99)
			if(num/10 == num%10) {
				System.out.println("Yes! 10���ڸ��� 1�� �ڸ��� �����ϴ�.");
			}
			else
				System.out.println("No! 10�ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		else
			System.out.println("���� �Է��� ���� �ʽ��ϴ�.");
		System.out.println("===================");
		System.out.println(" �й� : 2015041057   ");
		System.out.println(" �̸� :   ���ȸ           ");
		System.out.println("===================");
	}

}
