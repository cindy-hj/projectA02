package projectA02;

public class projectA0232 {

	public static void main(String[] args) {
		// 100에서부터 200까지의 합을 구하시오
		int i = 0;
		int sum = 0;
		
		i = 100;
		while(i<=200) {
			sum = sum + i;
			i++;
		}
		System.out.println("100에서 부터 200까지의 합은: "+sum);
	}

}
