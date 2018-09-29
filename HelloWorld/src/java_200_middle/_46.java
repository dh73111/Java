package java_200_middle;

public class _46 {
	public static void main(String[] args) {
		int range = 10;
		int start = 1;
		int a = 0, b = 0, c = 0;
		while(true){
			a=(int)(range*Math.random()+start);
			b=(int)(range*Math.random()+start);
			c=(int)(range*Math.random()+start);
			// Math.random() 함수는 무작위의 숫자(double)를 반환해주는 메서드 예-0.2124454123
			// 그러므로 10을 곱해주어 정수처럼 변환
			// 1을 더하는것은 1~10의 정수를 얻기 위해 만약 0부터라면 1은 더할 필요 없다.
			if(a != b && b != c && c != a) 
				break; 
			// while(true)구문은 무한반복이므로 반드시 끝내는 조건문 필요
		}
        System.out.printf("%d\t%d\t%d",a,b,c);
	}

}
