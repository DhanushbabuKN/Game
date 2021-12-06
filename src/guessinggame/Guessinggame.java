package guessinggame;

import java.util.Scanner;

public class Guessinggame {
public static void main(String[] args) {
	int comp=(int)(Math.random()*10+1);
	int guess;
	int tries=1;
	
			Scanner ob=new Scanner(System.in);
			System.out.println("Enter the number");
	while(true)
	{
		
		guess=ob.nextInt();
		if(tries<5)
		{
			if(guess == comp)
			{
				System.out.println("Yaav u guessd the answer ");
				System.out.println(" ");
				System.out.println("it took you only" +tries + " tries to guess answer");
				break;
			}
			else if (guess > comp)
			{
				System.out.println("Your number is greater");
				System.out.println(" you used your "+ tries +" chances");
				System.out.println("enter smaller number: ");
			}
			else if(guess < comp)
			{
				System.out.println("Your number is lesser");
				System.out.println(" you used your"+ tries +" chances");
				System.out.println("enter bigger number: ");
			}
			
		}
		
		
		else if(tries==5)
		{
			
			if(guess== comp)
			{
				System.out.println("Yaav u guessde the answer ");
				System.out.println(" ");
				System.out.println("It took you only " +tries + " chance to guess answer");
				System.exit(0);
			}
			else
			{
				System.out.println("You exceeded your chances" +" the num was "+comp+" betterluck next time");
				System.exit(0);
			}
		}
		tries++;
		
	}
	ob.close();

}

}	