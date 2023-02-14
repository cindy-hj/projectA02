package projectA02;

public class projectA0236 {

	public static void main(String[] args) {
		int i = 2;
		int j = 1;
		while(i<=9) {
			System.out.println("** "+i+"단 **");
			j = 1;
			while(j<=9) {
				System.out.println(i+" x "+j+" = "+i*j);
				j = j + 1;
			}
			i = i + 1;
			
		}

	}

}
