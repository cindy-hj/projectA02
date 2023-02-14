package projectA02;

import java.util.Scanner;

public class projectA0211 {

	public static void main(String[] args) {
		// 학점을 입력받아 ...
		System.out.println("학점을 입력하세요.");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		
		if (score<=100 && score>=95) {
			System.out.println("A+");
		} else if (score<=94 && score>=90) {
			System.out.println("A");
		} else if (score<=89 && score>=85) {
			System.out.println("B+");
		} else if (score<=84 && score>=80) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		in.close();
	}

}
