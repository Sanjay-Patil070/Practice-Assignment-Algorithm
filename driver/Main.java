package driver;

import java.util.Scanner;

import service.AdditionalService;
import service.BinarySearch;
import service.LinearSearch;
import service.MergeSort;
import service.LinearSearch;

public class Main {
	public static void main(String[] args) {
		// declare all the required variables
		int noOfCompanies;


		// find the total no of companies that are associated with Stocker's
		System.out.println("enter the companies that are associated with Stocker's");
		Scanner sc=new Scanner(System.in);
		noOfCompanies=sc.nextInt();

		//declare and intialize required no of arrays
		double[] priceArray=new double[noOfCompanies];
		boolean[] profitArray=new boolean[noOfCompanies];

		//take stock price of all company and check whether price rose or fallen
		for(int i=0;i<noOfCompanies;i++) {
			System.out.println("enter the current stock price of company" +(i+1));
			priceArray[i]=sc.nextDouble();
			System.out.println("whether stock price rose compared to yesterday");
			profitArray[i]=sc.nextBoolean();
		}
		//sort the input values
		MergeSort ms=new MergeSort();
		ms.sort(profitArray,priceArray,0,priceArray.length-1); 

		AdditionalService as=new AdditionalService();
		LinearSearch ls=new LinearSearch();
		BinarySearch bs=new BinarySearch();

		int option;
		do {
			System.out.println();
			System.out.println("Enter the operstion thst you want to perform");
			System.out.println("1.Display the company stock price ascending order");
			System.out.println("2.Display the company stock price descending order");
			System.out.println("3.Dispaly the no of comapnies for which stock price rose today");
			System.out.println("4.Dispaly the no of comapnies for which stock price fallen today");
			System.out.println("5.search a specific stock price ");
			System.out.println("6.enter 0 to exit");
			System.out.println();

			option=sc.nextInt();

			switch (option) {
			case 0:
				System.out.println("Exited sucessfully");
				break;
			case 1 :
					as.displayPricesAscendingOrder(priceArray);
				break;
			case 2:
				as.displayPricesDescendingOrder(priceArray);
				break;
			case 3 :
				System.out.println("no of companies whose stock price rose today");
				System.out.println(ls.countCompaniesInProfit(profitArray)); 
				break;
			case 4:
				System.out.println("no of companies whose stock price fallen today\n"+ (noOfCompanies-ls.countCompaniesInProfit(profitArray))
				);
				break;
			case 5:
				double key;
				System.out.println("enter the key value");
				key=sc.nextDouble();
				bs.searchValue(priceArray,key);
				break;

			default:
				System.out.println("enter the valid option");
				break;
			}
		} while (option!=0);
		sc.close();
	}
}
