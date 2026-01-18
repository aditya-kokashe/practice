public class Doubly{
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
        }
    }
    
    Node head;
    Node tail;
    public void insertFirst(int data){
        Node n = new Node(data);
        if(isEmpty()){
            head = n;
            tail = n;
            return;
        }
        n.next = head;
        head.prev = n;
        head = n;
    }
    
    public void insertLast(int data){
        Node n = new Node(data);
        if(isEmpty()){
            head = n;
            tail = n;
            return;
        }
        n.prev = tail;
        tail.next = n;
        tail = n;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("LL is empty");
            return;
        }
        System.out.println("\nDeleted : "+ head.data);
        head = head.next;
        head.prev = null;
    }
    
    public void deleteLast(){
        if(isEmpty()){
            System.out.println("LL is empty");
            return;
        }
        System.out.println("\nDeleted : "+ tail.data);
        tail = tail.prev;
        tail.next = null;
    }
    
    public void display(){
        Node temp = head;
        // System.out.print("Null <-> ");
        
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    
    public static void main(String[] args){
        Doubly d = new Doubly();
        d.insertFirst(1);
        d.insertFirst(5);
        d.insertLast(10);
        d.display();
        d.deleteFirst();
        d.display();
        d.deleteLast();
        d.display();
    }
}
