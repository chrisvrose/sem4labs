import java.util.Scanner;

@SuppressWarnings("unused")
public class VertexDelete{
	public int[] SourceDelete(int a[][],int[] indeg,int n){
		int i,j;
		int topoOrder[] = new int[n];
		int visited[] = new int[n];
		int topoOrdern = -1;
		for(i=0;i<n;i++){
			if(indeg[i]==0&&visited[i]==0){
				topoOrdern = deleteSource(a,n,indeg,visited,topoOrder,topoOrdern,i);
			}
		}
		return topoOrder;
	}
	public int deleteSource(int[][] a,int n,int[] indeg,int[] visited,int[] topoOrder,int topoOrdern,int src){
		///Remove vertexSrc
		int poppAble,i,j,k;
		visited[src] = 1;
		//System.out.println("Visiting:"+src+","+topoOrdern);
		topoOrder[++topoOrdern] = src;
		///Update indegrees
		
		for(j=0;j<n;j++){
			if(a[src][j]!=0){
				///Update graph
				a[src][j]=0;
				indeg[j]-=1;
				for(k=0;k<n;k++){
					if(indeg[k]==0&&visited[k]==0){
						topoOrdern = deleteSource(a,n,indeg,visited,topoOrder,topoOrdern,k);
					}
				}
				//if(visited[j]==0){
				//	//System.out.println("Try:"+j);
				//	for(i=0;i<n;i++){
				//		if(a[i][j]==1&&indeg[j]==0)
				//			topoOrdern = deleteSource(a,n,indeg,visited,topoOrder,topoOrdern,j);
				//	}
				//}
			}
		}
		return topoOrdern;
		
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the order of the adjacency matrix");
		int n = in.nextInt(),i,j;
		int[][] arr = new int[n][n];
		int[] indeg = new int[n];
		System.out.println("Enter adjacency matrix:");
		for(i=0;i<n;i++){
			//[i]=0;
			for(j=0;j<n;j++) {
				arr[i][j] = in.nextInt();
				///Generate indeg array
				indeg[j]+=arr[i][j];
			}
		}

		///Get Topo Order
		int[] topoOrder = new VertexDelete().SourceDelete(arr,indeg,n);

		System.out.println("Topological Order");
		for(int x: topoOrder){
			System.out.print(x + " ");
		}
	}
}	
