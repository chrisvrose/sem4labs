/**
 * dijkstra
 */
import java.util.Scanner;
public class dijkstra {

    protected static int inf = 999;
    protected void dijk(int cost[][],int n,int source,int v[],int d[]){
        //first step
        int least,i,j,u=1;

        //the src is already visited, skip
        v[source] = 1;

        //n-1 times
        for(i=1;i<n;i++){
            least = inf;
            for(j=1;j<=n;j++){
                //find the least farthest neighbour
                if(v[j]==0 && d[j]<least){
                    least = d[j];
                    u = j;
                }
            }

            //now mark it
            v[u] = 1;

            //update the distances
            for(j=1;j<=n;j++){
                //if the distance found is lesser than what was there initially, reduce it
                if(v[j]==0 && (d[j]>(d[u]+cost[u][j]) ))
                    d[j] = d[u]+cost[u][j];
            }


        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int n = in.nextInt();

        int[][] cost = new int[n+1][n+1];
        int source;
        int[] v = new int[n+1];
        int[] d = new int[n+1];
        //iteration indices
        int i,j;

        System.out.println("Enter cost matrix");
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                cost[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter source");
        source = in.nextInt();

        //setup the distance array
        for(i=1;i<=n;i++){
            d[i] = cost[source][i];
            //v is pre-zeroed
        }

        new dijkstra().dijk(cost,n,source,v,d);

        for(i = 1;i<=n;i++)
            System.out.format("%d --> %d = %d \n\n", source, i, d[i]);
        
        in.close();
    }
}