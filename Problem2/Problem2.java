
public class Problem2 {

	public static void main(String[] args) {
		Data queue = new Data();
		queue.add(1);
		queue.add(9);
		queue.add(4);
		queue.add(5);
		queue.add(10);
		queue.add(0);
		System.out.println(queue.getValue(0));
		System.out.println(queue.getValue(3));

	}

}
