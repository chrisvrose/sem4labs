import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
	protected int[] a;
	public int count = 0;

	public HeapSort(int[] heap) {
		this.a = heap;
		heapify();
		heapSort();
	}

	// wrap it
	void heapify() {
		heapify(a.length - 1);
	}

	// bottom up heap
	void heapify(int n) {
		int k, v = 0, j = 0;
		boolean heap = false;
		for (int i = n / 2; i > 0; i--) {
			k = i;
			v = a[k];
			heap = false;

			while (!heap && 2 * k <= n) {
				j = 2 * k;
				if (j < n) {
					if (a[j] < a[j + 1])
						j++;
				}
				count++;
				if (v >= a[j]) {
					heap = true;
				} else {
					a[k] = a[j];
					k = j;
				}

			}
			// final swap
			a[k] = v;
			// System.out.println(i + "," + Arrays.toString(a));
		}
	}

	public void heapSort() {
		int t;
		for (int i = a.length - 2; i >= 1; i--) {
			t = a[1];
			a[1] = a[i + 1];
			a[i + 1] = t;
			// System.out.println("RUN" + i);
			heapify(i);
		}

	}

	// public removeRoot(in

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i, j;
		System.out.println("Enter number of elements");
		n = in.nextInt();
		int[] heapArray = new int[n + 1];
		heapArray[0] = -1;
		for (i = 1; i <= n; i++) {
			heapArray[i] = in.nextInt();
		}
		in.close();
		int newCount = new HeapSort(heapArray).count;
		for (i = 1; i <= n; i++) {
			System.out.print(heapArray[i] + " ");
		}
		System.out.println("COUNT " + newCount);

		// int[][] newArray = new int[3][];
		// int[] counts = new int[3];
		// System.out.println("n\tASC\tDESC\tRAND");
		// for(i=1;i<16;i++){
		// for(j=0;j<3;j++){
		// newArray[j] = new int[1<<i];
		// }
		// for(j=0;j<(1<<i);j++){
		// newArray[0][j] = j;
		// newArray[1][j] = 1<<i - j;
		// newArray[2][j] = (int)(Math.random()*(1<<i));
		// }
		// for(j=0;j<3;j++){
		// counts[j] = new HeapSort(newArray[j]).count;
		// }
		// n = newArray[0].length;
		// System.out.println(n+"\t"+counts[0]+"\t"+counts[1]+"\t"+counts[2]);
		// }

	}
}
