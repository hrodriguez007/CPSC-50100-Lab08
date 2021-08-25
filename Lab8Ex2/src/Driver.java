//Lab 08
//Exercise 2
public class Driver {
	public static void main(String args[]) {
		
				LinkedQueue obj2 = new LinkedQueue();
				System.out.println();
				System.out.println("Enqueuing 1,7,3,4,9,2");
					obj2.enqueue(1);
					obj2.enqueue(7);
					obj2.enqueue(3);
					obj2.enqueue(4);
					obj2.enqueue(9);
					obj2.enqueue(2);
				System.out.println("After enqueuing the data, the size of LinkedQueue is " + obj2.size());
				System.out.println(obj2);
				
				//Middle removal
				System.out.println();
				System.out.println("Removing middle");
				obj2.removeMiddle();
				System.out.println("After removing middle, we have only: " + obj2);
	}
}