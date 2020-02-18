package com.aarti.maven;

import java.util.Scanner;

import com.aarti.maven.CompoundInterest;
import com.aarti.maven.SimpleInterest;

public class MainInterest {

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			int principle;
			double rate,time;
			while(true)
			{
				System.out.println("MENU");
				System.out.println("1.Simple Interest");
				System.out.println("2.Compound Interest");
				System.out.println("3.Exit");
				int choice=sc.nextInt();
				 switch(choice)
				 {
				 case 1:
					 System.out.println("Enter principal,rate of interest and time: ");
						principle=sc.nextInt();
						rate=sc.nextDouble();
						time=sc.nextDouble();
					 SimpleInterest simpleinterest=new SimpleInterest(principle, rate, time);
					 System.out.println("Simple Interest is: "+simpleinterest.calculateInterest());
					 break;
				 case 2:
					 System.out.println("Enter principal,rate of interest and time: ");
						principle=sc.nextInt();
						rate=sc.nextDouble();
						time=sc.nextDouble();
					 CompoundInterest compoundinterest=new CompoundInterest(principle, rate, time);
					 System.out.println("Compound Interest is: "+compoundinterest.calculateInterest());
					 break;
				 case 3:
					 System.out.println("ThankYou");
					 System.exit(0);
				default:
					 System.out.println("Invlaid Choice!!Try Again!!");
				 }
			}

		}


	

}
