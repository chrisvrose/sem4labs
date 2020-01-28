import java.util.Scanner;
public class merge{
	//int arr[];
	public static int count=0;
	public static void mergeSort(int arr[],int l,int h){
		int m = (l+h)/2;
		if(l<h){
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,h);
			//System.out.println("("+l+','+m+","+h+")");
			merge(arr,l,m,h);
		}
	}
	public static void merge(int[] arr,int l,int m,int h){
		//int i=0,j=m;
		int a1[] = new int[m-l+1];
		int a2[] = new int[h-m];
		for(int i=0;i<m-l+1;i++){
			a1[i] = arr[i+l];
		}
		for(int i=0;i<h-m;i++){
			a2[i] = arr[m+1+i];
		}
		//for(int x:a1)System.out.println(x+" ");
		//System.out.println();
		//for(int x:a2)System.out.println(x+" ");
		//System.out.println();

		int i,j;
		for(i=0,j=0;i<(m-l+1)&&j<(h-m);){
			count++;
			if(a1[i]<a2[j])
				arr[i+j+l] = a1[i++];
			else
				arr[i+j+l] = a2[j++];
		}
		while(i<(m-l+1)){ arr[i+j+l] = a1[i++];count++;}
		while(j<(h-m)){ arr[i+j+l] = a2[j++];count++;}
		//for(int z=0;z<6;z++) System.out.print(arr[z]); System.out.println();
	}


	public static void main(String[] args){
		System.out.println("Enter number of elements in array");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) arr[i] = in.nextInt();

		mergeSort(arr,0,n-1);
		for(int x:arr){
			System.out.println(x+" ");
		}
		System.out.println("Number of Comparisons: "+count);
	}
}
