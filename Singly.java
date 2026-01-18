public class Singly
{
	static class Node{
	    int data;
	    Node next;
	    public Node(int data){
	        this.data = data;
	        this.next = null;
	    }
	}
	
	Node head;
	public void insertFirst(int data){
	    Node n = new Node(data);
	    if(isEmpty()){
	        head = n;
	        return;
	    }
	    else{
	        n.next = head;
	        head = n;
	    }
	}
	
	public void insertLast(int data){
	    Node n = new Node(data);
	    if(isEmpty()){
	        head = n;
	        return;
	    }
	    else{
	        Node temp = head;
	        while(temp.next != null){
	            temp = temp.next;
	        }
	        temp.next = n;
	    }
	}
	
	public void display(){
	    if(isEmpty()){
	        System.out.println("LL is empty");
	    }
	    else{
	        Node temp = head;
	        while(temp != null){
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.print("Null");
	    }
	}
	
	public boolean isEmpty(){
	    return head==null;
	}
	
	public void deleteFirst(){
	    if(isEmpty()){
	        System.out.println("LL is empty");
	    }  
	    else{
	        System.out.println("\nDeleted : "+ head.data);
	        head = head.next;
	    }
	}
	
	public void deleteLast(){
	    if(isEmpty()){
	        System.out.println("LL is empty");
	    }
	    
        Node temp = head;
        Node nextNode = temp.next;

        while(nextNode.next != null){
            temp = temp.next;
        }
        System.out.println("\nDeleted : " + nextNode.data);
        temp.next = null;
	}
	
	
	
	public static void main(String[] args){
	    Singly s = new Singly();
	    s.insertFirst(1);
	    s.insertFirst(2);
	    s.insertLast(8);
	    s.display();
	    
	    s.deleteFirst();
	    s.display();
	    System.out.println();
	    s.deleteLast();
	    s.display();
	}
	
}