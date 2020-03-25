import static java.lang.System.out;
import java.util.*;
public class KnapSack{
	int m;
	private int p[];
	private int w[];
	private int v[][];
	KnapSack(int p[],int w[],int m){
		this.p = p;this.w = w;this.m = m;
		int n = p.length-1;
		v = new int[n+1][m+1];
		for(int i=0;i<=n;i++){
			for(int j=0;j<=m;j++){
				if(i==0||j==0) v[i][j] = 0;
				else if( j-w[i] < 0) v[i][j] = v[i-1][j];
				else v[i][j] = max( v[i-1][j] , v[i-1][j-w[i]] + p[i] );
			}
		}
	}
	
	int[][] getV(){return v;}

	int getMaxPrice(){return v[p.length-1][m];}

	ArrayList<int[]> getObjects(){
		int i,j=m;

		ArrayList<int[]> objects = new ArrayList<int[]>();

		for(i=p.length-1;i>0&&j>=0;i--){
			if( v[i][j]!=v[i-1][j] ){objects.add(new int[]{i,w[i],p[i]}); j-=w[i];}
		}
		return objects;
	}

	static int max(int a,int b){return a>b?a:b;}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		out.println("Number of objects:");
		int n = in.nextInt(),i,j;

		out.println("Weights");

		int[] w = new int[n+1];
		int[] p = new int[n+1];
		for(i=1;i<=n;i++){
			w[i] = in.nextInt();
		}
		out.println("Profits:");
		for(i=1;i<=n;i++){
			p[i] = in.nextInt();
		}

		out.println("Enter bag size:");
		int m = in.nextInt();

		KnapSack k = new KnapSack(p,w,m);

		//print table
		int[][] v = k.getV();
		for( i=0;i<=n;i++){
			for(j=0;j<=m;j++) out.print(v[i][j]+"\t");
			out.println();
		}

		out.println("Solution objects:\nObj\tWt\tPrice");
		ArrayList<int[]> objects = k.getObjects();
		for(int[] x:objects){
			out.println(x[0]+"\t"+x[1]+"\t"+x[2]);
		}

		out.println("Total profit:" + k.getMaxPrice());

		in.close();
	}
}
