package ex3;
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x,y = 0;
		boolean ag=false;
		do {
			System.out.print("Introduceti primul nr:");
			x=sc.nextInt();
			System.out.print("Introduceti al doilea nr:");
			y=sc.nextInt();
			System.out.println("Suma acestor 2 numere este:" + (x+y));
			System.out.println("Doriti sa repetati?(1=Da;2=Nu)");
			System.out.print("Raspunsul:");
			x=sc.nextInt();
			if(x==2) {
				ag=true;
			}
		}while(ag == false);
		sc.close();
	}

}
