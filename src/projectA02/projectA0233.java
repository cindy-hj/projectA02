package projectA02;

public class projectA0233 {

	public static void main(String[] args) {
		// 0에서 부터 100까지 홀수 합과 짝수 합을 구하시오
		int i = 0;
		int sumOdd = 0;
		int sumEven = 0;
		
		i = 1;
		while(i<=100) {
			sumOdd = sumOdd + i;
			i = i + 2;
		}
		System.out.println("홀수 합은: "+sumOdd);
		
		i = 0;
		while(i<=100) {
			sumEven = sumEven + i;
			i = i + 2;
		}
		System.out.println("짝수 합은: "+sumEven);

	}

}
