package service;

public class MergeSort {

	public void sort(boolean[] profitArray,double[] a, int left, int right) {
		//base condition
				if(left<right) {
					
					//find the middle element
					int mid=(left+right)/2;
					
					//sort left and right array
					sort( profitArray,a,left,mid);//0,3  //0,1	//0,0
					sort( profitArray,a,mid+1,right);//4,7	//6,7	//7,7
					
					//merge sorted array
					mergeArray( profitArray,a,left,mid,right);
				}
			}

	private void mergeArray(boolean[] profitArray, double[] a, int left, int mid, int right) {
		//size of two temp array
				int n1=mid-left+1;
				int n2=right-mid;
				// create two temp array
				double[] leftArray=new double[n1]; 
				double[] rightArray=new double [n2]; 
				// add elements to temp arrays
				for(int i=0;i<n1;i++) {
				leftArray[i]=a[left+i];
				}
				for (int j=0;j<n2;j++) {
					rightArray[j]= a[mid+1+j];
				}
				
				//merge two arrays
				int i=0,j=0;
				int k=left;
				while(i<n1 && j<n2) {
					if(leftArray[i]<=rightArray[j]) {
						a[k]=leftArray[i];
						i++;
					}
					else {
						a[k]=rightArray[j];
						j++;
					}
					k++;
				}
				//copy remaining elements
				while(i<n1) {
					a[k]=leftArray[i];
					i++;
					k++;
				}
				while(j<n2) {
					a[k]=rightArray[j];
					j++;
					k++;
				}
	}
	}

	


