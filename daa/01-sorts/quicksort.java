import java.util.Scanner;
public class quicksort{
	//int arr[];
	public static int count=0;

	public static void quickSort(int arr[],int low,int high){
		if(low<high){
			int m = partition(arr,low,high);
			quickSort(arr,low,m-1);
			quickSort(arr,m+1,high);
		}
	}
	public static int partition(int[] arr, int low, int high){
		int i=low,j=high+1,pivot=arr[low],t;		//Set pivot to first element
		//while(true){
		//	System.out.println("("+i+","+j+")");
		//	while(pivot>=arr[i]&&i<=high){ i++;count++;};
		//	while(pivot<arr[j]&&j>=low) {j--;count++;}
		//	
		//	if(i<j){
		//		t = arr[j];
		//		arr[j]= arr[i];
		//		arr[i] = t;
		//	}else{
		//		t = arr[low];
		//		arr[low] = arr[j];
		//		arr[j] = t;
		//		return j;
		//	}
		//}
		do{
			do{
				i++;
			}while(arr[i]>=pivot);
			do{
				j--;
			}while(arr[j]<=pivot);
			t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}while(i>=j);
		t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;

		t = arr[low];
		arr[low] = arr[j];
		arr[j] = t;
		return j;
	}

	public static void main(String[] args){
		System.out.println("Enter number of elements in array");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) arr[i] = in.nextInt();

		quickSort(arr,0,n-1);
		for(int x:arr){
			System.out.println(x+" ");
		}
		System.out.println("Number of Comparisons: "+count);
	}
}
