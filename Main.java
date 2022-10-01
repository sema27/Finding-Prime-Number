package mini1;

public class Main {

	public static void main(String[] args) {
		int number=-1;
		int remainder=number % 2;
		boolean isPrime=true;
		
		if(number==1)
		{
			System.out.println("Sayı Asal Değildir");
			return;
		}
		
		if(number<1)
		{
			System.out.println("Geçersiz Sayı");
			return;
		}
		
		for(int i=2;i<number;i++)
		{
			if(number % i==0)
			{
				isPrime=false;
				System.out.println("Sayı Asal Değildir");

			}
		}
		if(isPrime)
		{
			System.out.println("Sayı Asaldır");
		}
	}

}
