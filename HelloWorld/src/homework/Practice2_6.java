package homework;

import java.util.Scanner;
public class Practice2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("1~99 ������ ������ �Է��Ͻÿ�>>");
		num = sc.nextInt();
		if(num>=1 && num<=99) {
			if(num/10 ==3 || num/10 ==6 || num/10==9)
					if(num%10==3 || num%10 ==6|| num%10 ==9)
						System.out.println("�ڼ�¦¦");
					else
						System.out.println("�ڼ�¦");
			
			else if(num%10==3 || num%10 ==6|| num%10 ==9)
				if(num/10 ==3 || num/10 ==6 || num/10==9)
					System.out.println("�ڼ�¦¦");
				else
					System.out.println("�ڼ�¦");

			}
		else
			System.out.println("�����Է��� ���� �ʽ��ϴ�.");
		
		System.out.println("===================");
		System.out.println("| �й� : 2015041057 |");
		System.out.println("| �̸� :    ���ȸ         |");
		System.out.println("===================");
	}
}
