package service;

public class BinarySearch {

	public void searchValue(double[] priceArray, double key) {
// declare the initialize variable	
		int left=0;
		int right=priceArray.length-1;
		int mid=left+(right-left)/2;
		while (left<=right) {
			if(key==priceArray[mid]) {
				System.out.println("stock value"+" "+key+" "+"is present");
				break;
			}
			else if(key<priceArray[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
			mid=left+(right-left)/2;
		}
		if(left>right){
			System.out.println("value not found");
			
		}
	}

}
