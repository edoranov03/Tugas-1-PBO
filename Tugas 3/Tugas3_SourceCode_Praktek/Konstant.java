// 13020220010, Edo Ranov Anjasmara, Selasa/05.03.2024, 14:45
import java.util.Scanner;
public class Konstant{
	public static void main(String[] args){
		final float PHI = 3.1315f;
		float r;
		Scanner masukan=new Scanner (System.in);
		System.out.print("Jari-jari lingkaran =");
		r = masukan.nextFloat();
		System.out.print("Jari-jari lingkaran = "+ (PHI * r * r)+"\n");
		System.out.print("Akhir program \n");
	}
}