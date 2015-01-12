
public class StackIntTest {
	public static void main(String[] args) {
		
	 StackInt stack = new StackInt();
	 stack.push(6);
	 stack.push(8);
	 stack.push(3);
	 stack.push(1);
	 stack.print();
	 stack.pop();
	 stack.print();
	 stack.push(0);
	 stack.print();
	 System.out.println(stack.getSize());
	 System.out.println(stack.peek());
	 QueueInt queue =new QueueInt();
	 queue.push(1);
	 queue.push(2);
	 queue.push(3);
	 queue.print();
	 queue.pop();
	 queue.print();
	 queue.push(0);
	 queue.pop();
	 queue.pop();
	 queue.push(1);
	 
	 queue.print();
	 System.out.println(queue.getSize());
	 System.out.println(queue.peek());
	 
}
}
