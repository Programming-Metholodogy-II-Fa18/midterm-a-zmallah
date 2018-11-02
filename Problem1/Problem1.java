public class Problem1{
	public static void main(String[] args){
		int[] arr = {15, 9, 60, 44, 12, 1,4};
		ExamSort(arr, arr.length);
		for(int i: arr) System.out.print(i + " ");
		System.out.println();
		
	}
	
	public static void ExamSort(int[] a, int size){
		int[] aux = new int[size];
		ExamSort(a,aux, 0, size-1);
	}
	
	public static void ExamSort(int[] a, int[] aux, int lo, int hi){
		if(lo>= hi) return;
		int mid = (lo+hi)/2;
		ExamSort(a, aux, lo, mid);
		ExamSort(a, aux, mid+1, hi);
		merge(a,aux,lo,mid,hi);
	}
	
	public static void merge(int[] a, int[] aux, int lo, int mid, int hi){
		for(int k = lo; k <= hi; k++) aux[k] = a[k];
		int i = lo, j = mid+1;
		for(int k = lo; k <= hi; k++) {
			if(i>mid) a[k] = aux[j++];
			else if(j>hi) a[k] = aux[i++];
			else if(aux[j]<aux[i]) a[k] = aux[j++];
			else a[k] =aux[i++];
		}
	}
}