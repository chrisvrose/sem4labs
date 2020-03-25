#include<stdio.h>

int max(int a,int b){return a>b?a:b;}

int clearTable(int n,int m){
	int i=0,j=0;
	for(i=0;i<n;i++){
		for(j=0;j<m;j++);
	}
}

int main(){
	int n,m,i,j,w[10],p[10],v[10][10],x[10];
	printf("Read no. of objects\n:");scanf("%d",&n);
	printf("Weights\n:");for(i=0;i<n;i++) scanf("%d",w+i+1);
	printf("Profits\n:");for(i=0;i<n;i++) scanf("%d",p+i+1);

	printf("Read size of sack\n:");scanf("%d",&m);
	
	for(i=0;i<=n;i++){
		for(j=0;j<=m;j++){
			if(i==0||j==0) v[i][j] = 0;
			else if(j-w[i]<0) v[i][j] = v[i-1][j];
			else v[i][j] = max(v[i-1][j],v[i-1][j-w[i]]+p[i] );
			printf("%d\t",v[i][j]);
		}
		printf("\n");
	}


	for(i=0;i<10;i++)x[i]=0;

	for(i=n,j=m;i>=0&&j>=0;i--){
		if(v[i][j]!=v[i-1][j]){ x[i] = 1; j-=w[i];}

	}

	printf("Solution is\nObj\tWt\tProfit\n");
	for(i=0;i<10;i++){
		if(x[i]) printf("%d\t%d\t%d\n",i,w[i],p[i]);
	}
	printf("Total profit:%d",v[n][m]);	

	//Table generation done
	return 0;
}
