package projectA02;

public class projectA0229 {

	public static void main(String[] args) {
		// 0~10까지 홀수와 짝수와 전체 합을 구하시오.
		int sumOdd = 0;
		int sumEven = 0;
		int sumTotal = 0;
		for(int i = 0; i<=10; i=i+2) {
			sumEven = sumEven + i;
		}
		for(int i = 1; i<=10; i=i+2) {
			sumOdd = sumOdd + i;
		}
		for(int i = 0; i<=10; i++) {
			sumTotal = sumTotal + i;
		}
		System.out.println("홀수의 합은: "+sumOdd);
		System.out.println("짝수의 합은: "+sumEven);
		System.out.println("전체의 합은: "+sumTotal);

	}

}
