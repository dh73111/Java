package homework;

import java.util.Scanner;

public class Practice2_12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� >> ");
		int x = sc.nextInt();
		String y = sc.next();
		int z = sc.nextInt();
		
		if(y.equals("+"))
			System.out.println(x+y+z+"�� ��� ����� "+ (x+z));
		else if(y.equals("-"))
			System.out.println(x+y+z+"�� ��� ����� "+ (x-z));
		else if(y.equals("*"))
			System.out.println(x+y+z+"�� ��� ����� "+ (x*z));
		else if(y.equals("/"))
			System.out.println(x+y+z+"�� ��� ����� "+ (x/z));
		sc.close();
	}

}
