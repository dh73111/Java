package practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int num;
		Scanner sc = new Scanner(System.in);
		// System.in �� �Է��� ���� ����Ʈ ������ �д� ���� ����.
		
		num = sc.nextInt();
		System.out.println(num);
		
		sc.nextLine();
		// ���ڸ� ���� �� ���ڸ� ������ ���ۿ� ���� ����� �۵� �ȵ�
		// ���۸� ��������.
		str = sc.next();
		System.out.println(str);
		
		sc.close(); // Scanner �� ������ �������� �Ƚᵵ ����
	}

}
