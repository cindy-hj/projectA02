package projectA02;

public class projectA0225 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			sum = sum + i; 
			System.out.print(i);
			if(i<=999) {
				System.out.print("+");
			} else {
				System.out.print("=");
				System.out.print(sum);
			}
		}

	}

}
