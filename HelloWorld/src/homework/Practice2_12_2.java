package homework;

import java.util.Scanner;

public class Practice2_12_2 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� >> ");
		int x = sc.nextInt();
		String y = sc.next();
		int z = sc.nextInt();
		
		switch(y) {
		case "+":System.out.println(x+y+z+"�� ��� ����� "+ (x+z));break;
		case "-":System.out.println(x+y+z+"�� ��� ����� "+ (x-z));break;
		case "*":System.out.println(x+y+z+"�� ��� ����� "+ (x*z));break;
		case "/":System.out.println(x+y+z+"�� ��� ����� "+ (x/z));break;
		}
	}
}
