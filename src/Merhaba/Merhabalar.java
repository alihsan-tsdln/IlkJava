package Merhaba;
import java.util.Scanner;

public class Merhabalar {
	
	public static void main(String[] args)
	{
		System.out.print("Sayi giriniz:  ");
		Scanner reader = new Scanner(System.in);
		int sayi = reader.nextInt();
		boolean asal = false;
		for (int i = 2; i < sayi; i++)
		{
			if(sayi % i == 0 && sayi != i)
			{
				asal = true;
			}
		}
		if(asal)
		{
			System.out.println("Sayi asal degildir. Sayi: " + sayi);
		}
		
		else
		{
			System.out.println("Sayi asaldýr. Sayi: " + sayi);
		}
		
	}
}
