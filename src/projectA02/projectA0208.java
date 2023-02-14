package projectA02;

import java.util.Scanner;

public class projectA0208 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력받아 평균을 구하고 평균이 60 이상인지를 구분하시오
		Scanner scanner = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력하세요.");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int sum = num1+num2+num3;
		int avg = sum/3;
		if(avg>=60) {
			System.out.println("축하합니다.");
		} else {
			System.out.println("노력하세요.");
		}
	}

}
