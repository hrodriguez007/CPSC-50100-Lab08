//Lab 08
//Exercise 1
public class Driver {
	public static void main(String args[]) {
		
		//Creating ArrayQ instance
		ArrayQ obj1 = new ArrayQ();
		System.out.println("Enqueuing 1,7,3,4,9,2");
		
			obj1.enqueue(1);
			obj1.enqueue(7);
			obj1.enqueue(3);
			obj1.enqueue(4);
			obj1.enqueue(9);
			obj1.enqueue(2);
			System.out.println("After enqueuing the data, the size of ArrayQ is " + obj1.size());

			//Dequeue
			obj1.dequeue(); obj1.dequeue(); obj1.dequeue(); obj1.dequeue(); obj1.dequeue(); obj1.dequeue();
				System.out.println("After dequeuing the data, the size of ArrayQ is " + obj1.size());
  
		//Creating LinkedQueue instance
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
				
			//Dequeue
			obj2.dequeue(); obj2.dequeue(); obj2.dequeue(); obj2.dequeue(); obj2.dequeue(); obj2.dequeue();
				System.out.println("After dequeuing the data, the size of LinkedQueue is " + obj2.size());
	}
}