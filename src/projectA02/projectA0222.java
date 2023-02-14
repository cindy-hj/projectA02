package projectA02;

public class projectA0222 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<100; i++, System.out.print(i==100?"-":i)) {
			sum = sum + i;
		}
		System.out.println();
		System.out.println("0에서 99까지 합은:" + sum);

		// 1에서 부터 10까지 출력하고 합도 출력하시오
		int sum10 = 0;
		for(int i=1; i<=10; i++) {
			System.out.print(i);
			sum10 = sum10 + i;
		}
		System.out.println();
		System.out.println("1에서 10까지 합은:" + sum10);
	}

}
