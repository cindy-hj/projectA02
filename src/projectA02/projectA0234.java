package projectA02;

public class projectA0234 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		for(i = 1; i<=5; i++) {
			for (j=1; j<=5; j++) {
				System.out.print(i+j+" ");
			}
			System.out.println();
		}
		
		//*
		//**
		//***
		for(i=1; i<=3; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//*
		//**
		//***
		//****
		//*****
		for(i=1; i<=5; i++) {
			for (j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
