package projectA02;

public class projectA0231 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(i<=100) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println("0에서 부터 "+(i-1)+"까지의 합은: "+sum);
	}

}
