import java.util.Scanner;
//import java.io.PrintWriter;
public class GTravel{
	//public int count=0;
	//private int components=0;
	public int DFS(int a[][],int n){
		int components=0, i;
		int[] v = new int[n];
		for(i=0;i<n;i++) v[i] = 0;
		for(i=0;i<n;i++){
			if(v[i]==0){
				dfs(a,n,v,i);
				components++;
			}
		}
		return components;
	}
	public void dfs(int a[][],int n,int v[],int src){
		///mark
		v[src] = 1;
		System.out.print(src+" ");
		for(int i=0;i<n;i++){
			if(a[src][i]==1 && v[i]==0) dfs(a,n,v,i);
		}
	}

	public int BFS(int[][] a,int n){
		int components=0,i;
		int[] v = new int[n];
		for(i=0;i<n;i++){v[i]= 0;}
		for(i=0;i<n;i++){
			if(v[i]==0){
				bfs(a,n,v,i);
				components++;
			}
		}
		return components;
	}

	public void bfs(int a[][],int n,int v[],int src){
		int[] q = new int[n];
		///nd is a popout temp var
		int f=0,r=-1,nd,i;
		v[src] = 1;
		q[++r] = src;
		System.out.print(src+" ");
		while(f<=r){
			nd = q[f++];
			for(i=0;i<n;i++){
				if(a[nd][i]!=0 && v[i] ==0){
					q[++r] = i;v[i] = 1;
					System.out.print(i+" ");
				}
			}
		}
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
		System.out.println("DFS:");
		i = new GTravel().DFS(arr,n);
		System.out.println("\nDFS:"+(i==1?"Connected":(i+" component(s)")));
		System.out.println("BFS:");
		j = new GTravel().BFS(arr,n);
		System.out.println("\nBFS:"+(j==1?"Connected":(j+"component(s)")));
		//DFS(arr
		in.close();
	}
}
