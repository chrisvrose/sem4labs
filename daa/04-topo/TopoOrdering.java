import java.util.Scanner;
//import java.io.PrintWriter;
public class TopoOrdering{
	//public int count=0;
	//private int components=0;
	public int[] DFS(int a[][],int n){
		int components=0,i;
		int[] v = new int[n];
		int[] topo = new int[n];
		int topon = n;
		for(i=0;i<n;i++) v[i] = 0;
		for(i=0;i<n;i++){
			if(v[i]==0){
				topon = dfs(a,n,v,i,topo,topon);
				components++;
			}
		}
		return topo;
	}
	public int dfs(int a[][],int n,int v[],int src,int[] topo,int topon){
		///mark
		v[src] = 1;
		//System.out.print(src+" ");
		for(int i=0;i<n;i++){
			if(a[src][i]==1 && v[i]==0) topon = dfs(a,n,v,i,topo,topon);
		}
		topo[--topon] = src;
		return topon;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int i,j;
		System.out.println("Enter order of the adjacency matrix");
		int n = in.nextInt();

		///Adjaency Array
		int[][] arr = new int[n][n];
		System.out.println("Enter adjacency matrix");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				arr[i][j] = in.nextInt();
		}
		//BFS(arr,i)
		//System.out.println("DFS:");
		//System.out.println("\nDFS:"+new GTravel().DFS(arr,n)+" components");
		//DFS(arr

		int[] topoOrder = new TopoOrdering().DFS(arr,n);
		System.out.println("Topological Order:");
		for(int x: topoOrder){
			System.out.print(x+" ");
		}
		in.close();
	}
}
