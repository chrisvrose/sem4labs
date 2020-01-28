//import java.util.Scanner;
public class mergeSort{
	//int arr[];
	private int count;
	private int arr[];
	public mergeSort(int[] arr){
		count = 0;
		this.arr = arr;
	}
	public void Sort(int l,int h){
		int m = (l+h)/2;
		if(l<h){
			Sort(l,m);
			Sort(m+1,h);
			//System.out.println("("+l+','+m+","+h+")");
			merge(l,m,h);
		}
	}
	public void merge(int l,int m,int h){
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

	public int getCount(){return count;}
	public boolean isSorted(){
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false; // It is proven that the array is not sorted.
			}
		}
		return true;
	}
	
	public static void main(String[] args){
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
			mergeSort[] sorts = {new mergeSort(a),new mergeSort(b),new mergeSort(c)};
			for(int j=0;j<3;j++){
				sorts[j].Sort(0, i-1);
				res[j] = sorts[j].getCount();
				if(!sorts[j].isSorted()){System.err.println("Not sorted");}
			}
			System.out.println(i+"\t"+res[0]+"\t"+res[1]+"\t"+res[2]);
		}
		//in.close();
	
	}
}
