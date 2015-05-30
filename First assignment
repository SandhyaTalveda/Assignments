import java.util.Scanner;
class ass
{
	public static void main(String[] args)
	{
		int n,N,gn,choice,check;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the highest range of random number(N):\n");
		N=sc.nextInt();
		n=(int)(Math.random()*N);
		System.out.println(n);
		check=n/5; //20% of generated random number to check too low or too high
		do
		{
			System.out.print("Guess and enter a number:");
			gn=sc.nextInt();
			if(gn>(n+check))
					System.out.println("Too high\n");
			else if(gn<(n-check))
					System.out.println("Too low\n");
			else if(gn==n)
			{
					System.out.println("Congrats\n");
					System.exit(0);
			}
			else
					System.out.println("You are on the correct way\n");// near to the number
			System.out.println("Do u want to continue(0/1):\n");
			choice=sc.nextInt();
		 }while(choice==1);
		 if(choice==0)
			System.out.println("The number is:"+n+"\n");
		 else
		 {
			 System.out.println("You have entered wrong... enter 0 or 1\n");
			 System.exit(0);
		 }
	}
}
