package projectA02;

public class projectA0228 {

	public static void main(String[] args) {
		int suma = 0; // 짝수
		int sumb = 0; // 홀수
		
		for(int i=0; i<=100; i=i+2) { // 짝수
			suma = suma + i;
		}
		for(int i=1; i<=100; i=i+2) { // 홀수
			sumb = sumb + i;
		}
		System.out.println("짝수 합은"+suma);
		System.out.println("홀수 합은"+sumb);
	}

}
