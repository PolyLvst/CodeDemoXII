//Import alat dan keperluan
import java.util.Scanner;
import java.lang.StringBuilder;
public class DemoCode{
	public static void main(String[]args){
		Scanner scanInt = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);
		StringBuilder buildString = new StringBuilder();
		//indonesiatanahairbeta
		for (int i=0; i<args.length; i++){
			System.out.print(args[i]);
			buildString.append(args[i]);
		}
		int lokasiSpasi;
		for (int i=0; i<3; i++){
			System.out.print("\nMenambahkan spasi diantara kata\nMasukkan lokasi spasi : ");
			lokasiSpasi = scanInt.nextInt();
			//System.out.println(lokasiSpasi);
			buildString.insert(lokasiSpasi," ");
			printSaya(buildString);
		}
		int lokasiKapital;
		char tanya,hurufTarget;
		do{
			System.out.print("\nMengubah huruf menjadi kapital \nMasukkan lokasi kapital : ");
			lokasiKapital = scanInt.nextInt();
			System.out.print("\nMasukkan huruf kapital : ");
			hurufTarget = scanStr.nextLine().charAt(0);
			buildString.setCharAt(lokasiKapital,hurufTarget);
			printSaya(buildString);
			System.out.print("\nLagi ? (y/t) ");
			tanya = scanStr.nextLine().charAt(0);
			if (tanya == 'T' || tanya == 't') break;
		} while (true);
	}
	private static void printSaya(StringBuilder target){
		System.out.println(target);
	}
}