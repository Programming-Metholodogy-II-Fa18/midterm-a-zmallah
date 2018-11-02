public class Data {
	private int[] queue = new int[50];
	private int N;
	
	public Data(){
		
	}
	
	public void add(int a){
		N++;
		shiftRight();
		queue[0] = a;
	}
	
	private void shiftRight(){
		for(int k = N; k >0; k--){
			queue[k] = queue[k-1];
		}
	}
	
	public int remove(){
		if(N<=0) return -1;
		int val = queue[--N];
		System.out.println(val);
		return val;
	}
	
	public int getValue(int i){
		if(i>=N) return -1;
		return queue[N-i];
	}
	
}
