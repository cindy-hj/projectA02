package projectA02;

public class projectA0224 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i =1; i<=100; i++) {
			sum = sum+i;
			System.out.print(i);
			if(i<=99) {
				System.out.print("+");
			} else {
				System.out.print("=");
				System.out.print("sum");
			}
		}

	}

}
