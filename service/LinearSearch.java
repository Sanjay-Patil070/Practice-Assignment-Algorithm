package service;

public class LinearSearch {

	public int countCompaniesInProfit(boolean[] Array) {
		int count=0;
		for (int i = 0; i < Array.length; i++) {
			if(Array[i]==true) {
				count++;
			}
		}
		return count;
		
	}

}
