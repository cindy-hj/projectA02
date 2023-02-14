package projectA02;

import java.util.Scanner;

public class projectA0212 {

	public static void main(String[] args) {
		int num, count = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99사이의 정수를 입력하시오>>");
		num = scanner.nextInt();
		if(num >= 1 && num <= 99) {
			int a, b;
		
			a = num/10; // 10의 자리에서 3, 6, 9 검사
			b = num%10; // 1의 자리에서 3, 6, 9 검사
			
			if(a != 0 && a%3 == 0) {
				count ++;
			} 
			if(b != 0 && b%3 == 0) {
				count ++;
			}
			if(count == 2) {
				System.out.println("박수짝짝");
			} else if (count == 1) {
				System.out.println("박수짝");
			} else {
				System.out.println("박수 없음");
			}
		} else {
			System.out.println("숫자가 범위를 벗어났습니다.");
		}
		scanner.close();
	}

}
