package java_200_middle;

public class _44 {
	public static void showOddnEven(int n){
		int temp = n;
		do{
			if(temp % 2 == 1){
				temp = temp * 3 + 1;     // È¦¼ö
			}
			else{
				temp /= 2;           // Â¦¼ö
			}
			System.out.print("["+temp+"] ");
		}while(temp != 1);
		System.out.println("\n---------------------");
	}
	public static void main(String[] args) {
		showOddnEven(122);
	}

}
