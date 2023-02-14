package projectA02;

public class projectA0221 {

	public static void main(String[] args) {
		int sum = 0; // 합을 구할 변수
		for(int i=0; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println("0~10까지 합은:"+sum);
		// 0에서 부터 100까지의 합은
		int sum100 = 0;
		for(int i=0; i<=100; i++) {
			sum100 = sum100 + i;
		}
		System.out.println("0~100까지 합은:"+sum100);
		// 0에서부터 1000까지의 합은
		int sum1000 = 0;
		for(int i=0; i<=1000; i++) {
			sum1000 = sum1000 + i;
		}
		System.out.println("0~1000까지 합은:"+sum1000);
		// 99~999까지의 합은
		int sum999 = 0;
		for(int i=99; i<1000; i++) {
			sum999 = sum999 + i;
		}
		System.out.println("99~999까지 합은:"+sum999);
	}

}
