package homework;

import java.util.Scanner;

public class Practice2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	int money =0;

	System.out.print("�ݾ��� �Է��Ͻÿ�>>");
	money = sc.nextInt();
	System.out.println("�������� " + money/50000 + "��");
	System.out.println("������" + (money - 50000*(money/50000))/10000 + "��");
	System.out.println("õ����" + (money - 10000*(money/10000))/1000 + '��');
	System.out.println("���" + (money - 1000*(money/1000))/100 + "��");
	System.out.println("���ʿ�" + (money - 100*(money/100))/50 + "��");
	System.out.println("�ʿ�" + (money - 50*(money/50))/10 + "��");
	System.out.println("�Ͽ�" + (money -10*(money/10)) + "��");
	System.out.println("===================");
	System.out.println("| �й� : 2015041057 |");
	System.out.println("| �̸� :    ���ȸ         |");
	System.out.println("===================");
	}

}
