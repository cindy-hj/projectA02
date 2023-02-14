package projectA02;

import java.util.Scanner;

public class projectA0203 {

	public static void main(String[] args) {
		// 수를 하나 입력 받아 입력 받은 수가 짝수인지 홀수인지 를 알아내는 프로그램 작성
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int n = scanner.nextInt();
		int rts = n%2;
		if(rts == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

}
