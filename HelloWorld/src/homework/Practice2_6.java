package homework;

import java.util.Scanner;
public class Practice2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("1~99 »çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À>>");
		num = sc.nextInt();
		if(num>=1 && num<=99) {
			if(num/10 ==3 || num/10 ==6 || num/10==9)
					if(num%10==3 || num%10 ==6|| num%10 ==9)
						System.out.println("¹Ú¼öÂ¦Â¦");
					else
						System.out.println("¹Ú¼öÂ¦");
			
			else if(num%10==3 || num%10 ==6|| num%10 ==9)
				if(num/10 ==3 || num/10 ==6 || num/10==9)
					System.out.println("¹Ú¼öÂ¦Â¦");
				else
					System.out.println("¹Ú¼öÂ¦");

			}
		else
			System.out.println("Á¤¼öÀÔ·ÂÀÌ ¿ÇÁö ¾Ê½À´Ï´Ù.");
		
		System.out.println("===================");
		System.out.println("| ÇĞ¹ø : 2015041057 |");
		System.out.println("| ÀÌ¸§ :    ±èµÎÈ¸         |");
		System.out.println("===================");
	}
}
