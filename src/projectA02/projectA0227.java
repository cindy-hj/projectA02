package projectA02;

public class projectA0227 {

	public static void main(String[] args) {
		// 100에서 부터 200까지 홀수와 짝수의 합을 각각 구하시오
		int sumOdd = 0;
		int sumEven = 0;
		for(int i = 100; i<=200; i++) {
			if(i%2 == 0) {
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;
			}
		}
		System.out.println("홀수의 합은: "+sumOdd);
		System.out.println("짝수의 합은: "+sumEven);

	}

}
