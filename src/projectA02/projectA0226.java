package projectA02;

public class projectA0226 {

	public static void main(String[] args) {
		// 0에서 부터 100까지 홀수와 짝수의 합을 각각 구하시오
		int sumEven = 0;
		int sumOdd = 0;
		for(int i = 0; i<=100; i++) {
			if(i%2 == 0) {
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;
			}
		}
		System.out.println("짝수의 합은: "+sumEven);
		System.out.println("홀수의 합은: "+sumOdd);
	}

}
