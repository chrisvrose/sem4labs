#include<iostream>
using namespace std;

class arrayInt{
	private:
		int a[100];
		int n;
		void mergeSort(int,int);
		void arrayMerge(int,int,int);
	public:
		arrayInt(int *,int);
		int linSearch(int);
		int selectionSort();
		int bubbleSort();
		void print();
};

void arrayInt::mergeSort(int left,int right){
	if(left<=right){
		int middle
	}
}


void arrayInt::print(){
	for(int i=0;i<n;i++){
		cout<<a[i]<<' ';
	}
	cout<<'\n';
}

arrayInt::arrayInt(int *arr,int num){
	n = num;
	for(int i=0;i<n;i++)
		a[i] = arr[i];
}

int arrayInt::linSearch(int ele){
	for(int i=0;i<n;i++){
		if(a[i] == ele){return ele;}
	}
	return -1;
}

int arrayInt::selectionSort(){
	int min,t,count=0;
	for(int i=0;i<n;i++){
		min = i;
		for(int j=i+1;j<n;j++,count++){
			if(a[j]<a[min]){min = j;}
		}
		t = a[min];
		a[min] = a[i];
		a[i] = t;
	}
	return count;
}

int arrayInt::bubbleSort(){
	int t,count=0;
	for(int i=0;i<n;i++){
		for(int j=0;j<n-i-1;j++,count++){
			if(a[j+1]<a[j]){
				t = a[j];
				a[j] = a[j+1];
				a[j+1] = t;
			}
		}
	}
	return count;
}


int arrayInt::mergeSort(){
}


int main(){
	int a[100],n;
	cout<<"Enter number of elements\n";
	cin>>n;
	cout<<"Enter elements\n";
	for(int i=0;i<n;i++) cin>>a[i];
	arrayInt obj(a,n);
	for(int c;cin>>c;){
		switch(c){
			case 0:
				cout<<"0.Menu\n1. LinSearch\n2.SelSort\n3.BubbleSort\n\n4.Output\n";
				break;
			case 1:
				cin>>c;
				if(obj.linSearch(c)!=-1){
					cout<<"Found";

				}
				else{
					cout<<"Getrekd";
				}
				break;
			case 2:
				cout<<obj.selectionSort();
				break;
			case 3:
				cout<<obj.bubbleSort();
				break;
			case 4:
				obj.print();
				break;
			default:
				cout<<"Invalid";
		}


				
	}
}

