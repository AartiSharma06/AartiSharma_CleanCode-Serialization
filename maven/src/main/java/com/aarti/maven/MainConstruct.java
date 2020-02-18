package com.aarti.maven;

import java.util.Scanner;

import com.aarti.maven.HouseConstruct;

public class MainConstruct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
			System.out.println("MENU");
			System.out.println("Select Material:");
			System.out.println("	1.Standard Material");
			System.out.println("	2.Above Standard Material");
			System.out.println("	3.High Standard Material");
			System.out.println("Enter your requirements:");
			int material_standard=sc.nextInt();
			
			System.out.println("Enter the square feet:");
			int square_feet=sc.nextInt();
			
			System.out.println("Select Fully Automation:True if Yes or False if No");
			boolean fully_automated=sc.nextBoolean();
			
			HouseConstruct houseConstruct=new HouseConstruct(material_standard, square_feet, fully_automated);
			double total_cost=houseConstruct.calculateCost();
			total_cost=houseConstruct.calculateCostAutomated();
			System.out.println("The total cost is: "+total_cost);
	}
}
