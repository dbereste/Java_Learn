package ex2;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ora = 232;
		if (ora >= 0 && ora <= 12 ) {
			System.out.print("Prima parte a zilei");
		}else if(ora > 12 && ora < 24) {
			System.out.print("A doua parte a zilei");
		}else {
			System.out.print("Unknown error");
		}
	}

}
