package projectA02;

public class projectA0206 {

	public static void main(String[] args) {
		// 변수 a에 100을 할당하고
		// 변수 b에 50을 할당하고
		// a를 b로 나누어 결과를 출력하고
		// 해당 결과가 5의 배수인지를 출력하는 프로그램을 작성하시오.
		int a = 100;
		int b = 50;
		System.out.println(a/b);
		if(a/b%5 == 0) {
			System.out.println("5의 배수 입니다.");
			return; // 프로그램이 여기서 마쳐짐
		} else {
			System.out.println("5의 배수가 아닙니다.");
			return;
		}

	}

}
