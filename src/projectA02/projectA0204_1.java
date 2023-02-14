package projectA02;

import java.util.Scanner;

public class projectA0204_1 {

	public static void main(String[] args) {
		// 입력 받은 수를 비교하여 10의 배수를 출력
		// 10의 배수인 경우 *5를 하여 결과를 출력 하시오.
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int n = scanner.nextInt();
		if (n%10 == 0) {
			System.out.println("결과:"+n*5);
		}
	}

}
