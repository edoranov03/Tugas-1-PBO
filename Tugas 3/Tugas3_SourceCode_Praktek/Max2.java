// 13020220010, Edo Ranov Anjasmara, Selasa/05.03.2024, 14:45
import java.util.Scanner;
public class Max2{
	public static void main(String[] args){
		int a,b;
		Scanner masukan=new Scanner(System.in);
		System.out.print("Maksimum dua bilangan : \n");
		System.out.print("Ketikan dua bilangan, pidahkan dg RETURN : \n");
		a=masukan.nextInt();
		b=masukan.nextInt();
		System.out.println ("Ke dua bilangan : a = "+ a+" b = "+b);
		if (a >= b){
			System.out.println ("Nilai a yang maksimum "+a);
		}else{
			System.out.println ("Nilai b yang maksimum: "+b);
		}
	}
	
}