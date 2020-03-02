// Java program for implementation of Heap Sort 
public class HeapSort 
{
    int count=0;
    public void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // Build heap (rearrange array) 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 
  
        // One by one extract an element from heap 
        for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
            count++;
            // call max heapify on the reduced heap 
            heapify(arr, i, 0); 
        } 
    } 
  
    // To heapify a subtree rooted with node i which is 
    // an index in arr[]. n is size of heap 
    void heapify(int arr[], int n, int i) 
    { 
        int largest = i; // Initialize largest as root 
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
  
        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) {
            count++;
            largest = l; }
  
        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]) {
            count++;
        
            largest = r; }
  
        // If largest is not root 
        if (largest != i) 
        { 
            count++;
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
  
            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest); 
        } 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int n1 = Integer.parseInt(args[0]),n2 = Integer.parseInt(args[1]);
        int arr1[] = new int[n1];
        int arr2[] = new int[n2]; 
        for(int i=0;i<n2;i++){
            if(i<n1) arr1[i] = n1-i;
            arr2[i] = n2-i;
        }
        //int n = arr.length; 
  
        HeapSort ob1 = new HeapSort(),ob2 = new HeapSort(); 
        ob1.sort(arr1); 
        ob2.sort(arr2);

  
        System.out.println("Sorted array is"); 
        //printArray(arr1); 
        //printArray(arr2);
        System.out.println(ob1.count);
        System.out.println(ob2.count);
    } 
} 