import java.util.Scanner;

public class quicksort {
	//int arr[];
	private int count;
	private int[] arr;
	public quicksort(int[] arr){
		this.arr = arr;
		count=0;
	}

	public int[] Sort(int low,int high){
		if(low<high){
			int m = partition(low,high);
			Sort(low,m-1);
			Sort(m+1,high);
			return arr;
		}else{
			return null;
		}
	}
	public int getCount(){return count;}
	public boolean isSorted(){
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false; // It is proven that the array is not sorted.
			}
		}
		return true;
	}
	/**
	 * Make a partition for a subarray from {@code low} to {@code high} for {@code arr} to return an index
	 * @param low
	 * @param high
	 * @return Index for partition
	 */
	public int partition(int low, int high){
		int i=low+1,j=high,pivot=arr[low],t;		//Set pivot to first element
		while(true){
			//System.out.println("("+i+","+j+")");
			while(i<=high && pivot>=arr[i]){ i++;count++;};
			while(pivot<arr[j]) {j--;count++;}
			
			if(i<j){
				//System.out.println("LEft case");
				t = arr[j];
				arr[j]= arr[i];
				arr[i] = t;
			}else{
				//System.out.println("Right:"+i+","+j+""+low);
				t = arr[low];
				arr[low] = arr[j];
				arr[j] = t;
				return j;
			
			}
			//return j;
		}
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int s = in.nextInt();
		int[] input = new int[s];
		System.out.println("Enter the values");
		for(int i=0;i<s;i++) input[i] = in.nextInt();
		quicksort sort = new quicksort(input);
		sort.Sort(0, s-1);
		System.out.println("The list is "+(sort.isSorted()?"sorted":"not sorted"));





		int[] a,b,c,res = new int[3];
		System.out.println("Size\tAsc\tDesc\tRand");
		for(int i=2;i<=512;i*=2){
			a = new int[i];
			b = new int[i];
			c = new int[i];
			for(int j=0;j<i;j++){
				a[j]= j+1;
				b[j] = i+1-j;
				c[j] = (int)(Math.random()*i);
			}
			quicksort[] sorts = {new quicksort(a),new quicksort(b),new quicksort(c)};
			for(int j=0;j<3;j++){
				sorts[j].Sort(0, i-1);
				res[j] = sorts[j].getCount();
				///Assert that this array is sorted for sure
				if(!sorts[j].isSorted()){System.err.println("Not sorted");}
			}
			System.out.println(i+"\t"+res[0]+"\t"+res[1]+"\t"+res[2]);
		}
		in.close();
	}
}
