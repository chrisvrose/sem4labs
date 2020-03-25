import java.util.Scanner;
public class HeapSort{
	private int[] a;
	public	int count = 0;
	//int count2 = 0;
	public HeapSort(int[] heap){this.a  = heap;makeHeap();heapSort();}


	public void heapUp(int endpoint){
		int i=endpoint,t;
		while(((i-1)/2)>=0){
			//System.out.println(a[i]+" CHECK:"+i);
			count++;
			if(a[i]>a[(i-1)/2]){
				t = a[i];
				a[i] = a[(i-1)/2];
				a[(i-1)/2] = t;
			}else{
				break;
			}
			//count++;
			i = (i-1)/2;
		}
	}


	public void heapDown(int endpoint){
		int i=0,maxChildIndex,t;
		while(i<=endpoint){
			if(2*i+1<=endpoint){
				//has atleast 1 child
				maxChildIndex = 2*i+1;
				//count++;
				if(2*i+2<=endpoint){
					maxChildIndex = a[2*i+1]>a[2*i+2]?(2*i+1):(2*i+2);
				}
				count++;
				if(a[i]<a[maxChildIndex]){
					t = a[maxChildIndex];
					a[maxChildIndex] = a[i];
					a[i] = t;
				}
				i = maxChildIndex;  
			}else{
				break;
			}

		}
	}

	public void makeHeap(){
		for(int i=1;i<a.length;i++){
			//till endpoint
			heapUp(i);
		}
	}

	public void heapSort(){
		int t;
		for(int i=a.length-2;i>=0;i--){
			t = a[0];
			a[0] = a[i+1];
			a[i+1] = t;
			heapDown(i);
		}

	}

	//public removeRoot(in

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = in.nextInt(),i,j;
		int[] heapArray = new int[n];
		for(i=0;i<n;i++){
			heapArray[i] = in.nextInt();
		}
		int newCount = new HeapSort(heapArray).count;
		for(int x:heapArray){
			System.out.print(x+" ");
		}
		System.out.println("COUNT "+newCount);

		int[][] newArray = new int[3][];
		int[] counts = new int[3];
		System.out.println("n\tASC\tDESC\tRAND");
		for(i=1;i<16;i++){
			for(j=0;j<3;j++){
				newArray[j] = new int[1<<i];
			}
			for(j=0;j<(1<<i);j++){
				newArray[0][j] = j;
				newArray[1][j] = 1<<i - j;
				newArray[2][j] = (int)(Math.random()*(1<<i));
			}
			for(j=0;j<3;j++){
				counts[j] = new HeapSort(newArray[j]).count;
			}
			n = newArray[0].length;
			System.out.println(n+"\t"+counts[0]+"\t"+counts[1]+"\t"+counts[2]);
		}
	}
}
