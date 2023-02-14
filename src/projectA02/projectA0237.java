package projectA02;

public class projectA0237 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		do {
			sum = sum + i;
			i = i + 1;
		} while (i <= 100);
		System.out.print("0에서부터 100까지 합은: "+sum);
	}

}
