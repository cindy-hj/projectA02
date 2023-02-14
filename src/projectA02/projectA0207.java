package projectA02;

import java.util.Scanner;

public class projectA0207 {

	public static void main(String[] args) {
		// 두수를 입력 받아 두수의 합이 짝수인지 홀수인지를 출력하시오
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력 하세요.");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		// scanner를 두개 만들 필요 없음
		
		int c = a+b;
		if(c%2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

}
