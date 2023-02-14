package projectA02;

public class projectA0223 {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
//			System.out.printf("\n** %d단 **\n", i); // \n은 개행, printf는 파라미터를 받음
			System.out.println("** "+i+"단 **");
			for(int j=1; j<=9; j++) {
//				System.out.printf("%d x %d = %d\n", i, j, i*j);
				System.out.println(i+" x "+j+" = "+i*j);
			}
		}
	}

}
