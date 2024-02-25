// 13020220010, Edo Ranov Anjasmara, Kamis/22.02.2024, 21:33
import java.util.Scanner;

public class BacaData {

	public static void main(String[] args) {

		int a;
		Scanner masukan;

		System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
		masukan = new Scanner(System.in);
		a = masukan.nextInt(); 
		System.out.print ("Nilai yang dibaca : "+ a);
	}
}
