package projectA02;

public class projectA0205 {

	public static void main(String[] args) {
		// a=10을 넣고 b=20을 넣어서 a+b한 결과를 출력하고
		// c에 a+b 결과를 할당하고
		// c가 홀수인지 짝수인지 출력하시오
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		
		int c = a+b;
		if (c%2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

}
