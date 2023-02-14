package projectA02;

public class projectA0235 {

	public static void main(String[] args) {
		// 100에서 부터 200까지 홀수합과 짝수합을 구하시오
		int i = 0;
		int sumOdd = 0;
		int sumEven = 0;
		
		i = 100;
		while(i<=200) {
			if(i%2 != 0) {
				sumOdd = sumOdd + i;
				i++;
			} else {
				sumEven = sumEven + i;
				i++;
			}
		}
		System.out.println("홀수합 :"+sumOdd);
		System.out.println("짝수합 :"+sumEven);

	}

}
