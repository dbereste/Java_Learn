package ex3;
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduceti nr pozitiv:");
		i = sc.nextInt();
		if (i>0) {
			System.out.print("Numarul este pozitiv");
		}else {
			System.out.print("Numarul este negativ");
		}
		sc.close();
	}

}
