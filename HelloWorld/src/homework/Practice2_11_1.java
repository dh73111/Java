package homework;

import java.util.Scanner;

public class Practice2_11_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int x = sc.nextInt();
		//sc.nextLine();
		//String season = sc.next();
		
		if(x>=3 && x<=5)
			System.out.println("��");
		else if(x>=6 && x<=8)
			System.out.println("����");
		else if(x>=9 && x<=11)
			System.out.println("����");
		else if(x==1 || x==2 || x==12)
			System.out.println("�ܿ�");
		else
			System.out.println("��ȣ�� �߸��Է��ϼ̽��ϴ�.");
	}
}
