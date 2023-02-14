package projectA02;

import java.util.Scanner;

public class projectA0202 {

	public static void main(String[] args) {
		// 수를 하나 입력 받아 3의 배수인지 아닌지를 알아내는 프로그램을 작성
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int n = in.nextInt();
		if(n%3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
	}

}
