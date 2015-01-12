
public class QueueInt {
private Node head;
private Node tail;

public QueueInt() {
	this.head=null;
	this.tail=null;
}

public void push(int value){
	Node current=new Node(value);
    if(head==null){
		head=current;
	    tail=current;
    }
    tail.next=current;
    tail=current;
}
public int pop(){
	if(head==null){
	throw new NullPointerException("Stack is empty");
	}
	int temp=head.value;
	head=head.next;
	return temp;
	
}
public int peek(){
	if(head==null){
		throw new NullPointerException("Stack is empty");
	}
	return head.value;
}
public int getSize(){
	if(head==null)
		return 0;
	return getSize(head,0);
}

private int getSize(Node current, int counter){
	if(current==null)
		return counter;
	return getSize(current.next,counter+1);
}

public boolean contains(int value){
	if(head.value==value)
		return true;
	return contains(head,value);
		
}

private boolean contains(Node current, int value) {
	if(current==null)
	return false;
	if(current.value==value)
		return true;
	
	return contains(current.next,value);
	
	
}

public void print() {
	String str="";
	Node current=head;
	while(current!=null){
		System.out.print(current.value);
		current=current.next;
	}
	System.out.println();
	
}
	
}
//
//class Node {
//	public int value;
//	public Node next;
//
//	public Node(int value) {
//		this.value = value;
//
//	}
//
//	public Node(int value, Node next) {
//		this.value = value;
//		this.next = next;
//	}
//}
