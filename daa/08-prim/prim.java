import java.util.Scanner;

/**
 * prim
 */
public class prim {
    protected static int inf = 999;
    protected void prims(int n,int[][] cost,int source){
        int v[] = new int[n+1];//visited
        int d[] = new int[n+1];//distances ie latest shortest dist

        int i,j;//iteration indices


        //keeps track of nearest node to spanning tree
        int[] vertex = new int[n+1];


        //init
        for(i=1;i<=n;i++){
            // v[i] = 0;
            //set distances from source
            d[i] = cost[source][i];
            //set nearest as src for now
            vertex[i] = source;
        }

        //first vertex is done, time for rest
        v[source] = 1;

        //u, least - smallest node and dist to it
        int u=1,least,sum=0;
        //lets go - loop through all the vertices
        //<n cos 1 done already
        for(i=1;i<n;i++){
            //start with infinity
            least = inf;
            //for every pair 
            for(j=1;j<=n;j++){
                if(v[j]==0 && d[j]<least){
                    least = d[j];
                    u =j;
                }
            }
            //mark visited - this node we found
            v[u] = 1;
            //new sum
            sum+=d[u];
            System.out.format("%d --> %d = %d Sum = %d\n", vertex[u], u, d[u], sum);


            //now to update the distances we now have
            for(j=1;j<=n;j++){
                //if its not visited and the distance to it is lesser than what we have
                if(v[j]==0 && cost[u][j]<d[j]){
                    d[j] = cost[u][j];
                    vertex[j] = u;
                }
            }
            System.out.println("Total Cost: "+sum);
        }





    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int n = in.nextInt();
        int[][] cost = new int[n+1][n+1];
        //array in 1->n, 0 is blank
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                cost[i][j] = in.nextInt();
            }
        }

        System.out.println("Source:");
        int source = in.nextInt();

        new prim().prims(n,cost,source);



        in.close();
    }
    
}