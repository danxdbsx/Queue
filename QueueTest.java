package QueuePkg;

/**
 *
 * @author Danial
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q1 = new Queue<Integer>(4);
        
        q1.enqueue(1);
        q1.enqueue(28);
        System.out.println(q1.dequeue());
	q1.enqueue(31);
	System.out.println(q1.dequeue());
	System.out.println(q1.dequeue());
	q1.displayQueue();
	q1.enqueue(47);
	q1.displayQueue();
    }
}
