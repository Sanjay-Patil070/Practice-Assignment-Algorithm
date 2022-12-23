package service;

public class AdditionalService {
	//print stock price in ascending order
	public void displayPricesAscendingOrder(double[] Array) {
		System.out.println("Enter elements in ascending order");
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]+" ");
			System.out.println();
		}
	}
	//print stock price in descending order
	public void displayPricesDescendingOrder(double[] Array) {
		System.out.println("Enter elements in descending order");
		for (int i=Array.length-1 ; i >=0 ; i--) {
			System.out.println(Array[i]+" ");
			System.out.println();
		}
	}
	
	
	
	
}
