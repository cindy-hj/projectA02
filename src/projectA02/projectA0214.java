package projectA02;

public class projectA0214 {

	public static void main(String[] args) {
		int a = 50;
		int b = 50;
		
		if((a+b)>=100) {
			System.out.println("100보다 크거나 같다");
		}
		if((a+b)<100) {
			System.out.println("100보다 작다");
		}
		System.out.println("합과 차의 결과가 같은가");
		if((a+b) == (a-b)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

	}

}
