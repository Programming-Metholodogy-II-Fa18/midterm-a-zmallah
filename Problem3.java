public class Problem3 {
	public static int ProblemThree(Data data, int value){
		int i = 0;
		while(data.getValue(i) <= value){
			if(data.getValue(i) == value) break;
			i++;
		}
		System.out.println("Number of compares: " + i);
		return i;
	}
	
	public static void main(String[] args){
		Data data = new Data();
		data.add(1);
		data.add(5);
		data.add(8);
		data.add(10);
		data.add(12);
		data.add(14);
		data.add(18);
		data.add(20);
		data.add(33);
		data.add(41);
		ProblemThree(data, 8);
		ProblemThree(data, 33);
	}
}
