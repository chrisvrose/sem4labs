#include<stdio.h>
#include<string.h>
#define SIZE 256

int table[SIZE];

void shiftTable(char * p){
	int m = strlen(p),i,j;
	for(i=0 ;i<SIZE;i++){
		table[i] = m;
	}
	for(j=0;j<m-1;j++){
		table[p[j]] = m-1-j;
	}
}




int horsepool(char *t, char* p){
	int m = strlen(p),n = strlen(t),i,j,k;
	for(i = m-1;i<n;){
		//k = 0;
		for(k=0;k<m&&p[m-1-k]==t[i-k];k++);
		if(k==m) return i-m+1;
		else i += table[t[i]];
	}
	return -1;
}

int main(){
	char text[32],pattern[16];

	printf("Enter text\n:");
	scanf("%[^\n]",text);
	printf("Enter pattern\n:");
	scanf(" %s",pattern);

	shiftTable(pattern);

	int pos = horsepool(text,pattern);
	if(pos==-1){
		printf("Pattern absent");
	}else{
		printf("Pattern found at position %d",pos);
	}

	return 0;

}
