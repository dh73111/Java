package homework;

import java.util.Scanner;

public class Practice2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		double r1 = sc.nextDouble();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double r2 = sc.nextDouble();
		
		if(Math.pow(Math.pow(x1-x2,2) + Math.pow(y1-y2, 2),0.5)<r1+r2)
			System.out.println("�� ���� ���� ��ģ��.");
		else 
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
	}

}
