package reverse_string;
//import java.util.random.*;
import java.util.Scanner;
public class random_guess {

	public static void main(String args[])
	{
		int  i,j,k,flag1;
		i= (int)(100* Math.random());
		//int j=(int)i;
		System.out.println("the value of i is "+i);
		Scanner readint =new Scanner (System.in);
		flag1=0;
		for(j=0;j<=10;j++)
		{ 
			k=readint.nextInt();
			if (i==k)
			{ System.out.println("Congradulations! You win!");
			 flag1=1;
			 break;
			}
			System.out.println("The number is not correct! Pleaes try again");
		}
		readint.close();
		if (flag1==0)
		{System.out.println("You have tried too many time. Game over ");}
	}
	
}
