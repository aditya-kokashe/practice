public class Circular{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    
    Node head;
    Node tail;
    public boolean isEmpty(){
        return head == null;
    }
    
    public void insertFirst(int data){
        Node n = new Node(data);
        if(isEmpty()){
            tail = head = n;
            tail.next = head;
            return;
        }
        else{
            n.next = head;
            head = n;
            tail.next = head;
        }
    }
    
    public void insertLast(int data){
        Node n = new Node(data);
        if(isEmpty()){
            tail = head = n;
            tail.next = head;
            return;
        }
        else{
            tail.next = n;
            tail = n;
            tail.next = head;
        }
    }
    
    public void deleteFirst(){
        if(isEmpty()){
            return;
        }
        System.out.println("\nDeleted : "+ head.data);
        head = head.next;
        tail.next = head;
    }
    
    public void deleteLast(){
        if(isEmpty()){
            return;
        }
        System.out.println("\nDeleted : "+ tail.data);
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        tail = temp;
        tail.next = head;
    }
    
    
    public void display(){
        Node temp = head;
        if(isEmpty()){
            System.out.println("LL is empty");
            return;   
        }
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }while(temp != head);
        System.out.print("Null");
    }
    
    public static void main(String[] args){
        Circular c = new Circular();
        c.insertFirst(10);  
        c.insertFirst(15);  
        c.insertLast(20);
        c.display();
        c.deleteFirst();
        c.display();
        c.deleteLast();
        c.display();
        
    }
}